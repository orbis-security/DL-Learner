/**
 * Copyright (C) 2007 - 2016, Jens Lehmann
 *
 * This file is part of DL-Learner.
 *
 * DL-Learner is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 *
 * DL-Learner is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.dllearner.learningproblems;

import com.google.common.collect.Sets;
import com.google.common.collect.Sets.SetView;
import org.apache.log4j.Logger;
import org.dllearner.accuracymethods.AccMethodApproximate;
import org.dllearner.accuracymethods.AccMethodPredAcc;
import org.dllearner.accuracymethods.AccMethodTwoValued;
import org.dllearner.core.AbstractClassExpressionLearningProblem;
import org.dllearner.core.AbstractReasonerComponent;
import org.dllearner.core.ComponentInitException;
import org.dllearner.core.config.ConfigOption;
import org.dllearner.reasoning.SPARQLReasoner;
import org.dllearner.utilities.Helper;
import org.semanticweb.owlapi.model.OWLClassExpression;
import org.semanticweb.owlapi.model.OWLIndividual;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.ArrayList;

/**
 * @author Jens Lehmann
 *
 */
public abstract class PosNegLP extends AbstractClassExpressionLearningProblem<ScorePosNeg<OWLNamedIndividual>> {
	protected static final Logger logger = Logger.getLogger(PosNegLP.class);

	@ConfigOption(description = "list of positive examples", required = true)
	protected Set<OWLIndividual> positiveExamples = new TreeSet<>();
	@ConfigOption(description = "list of negative examples", required = true)
	protected Set<OWLIndividual> negativeExamples = new TreeSet<>();
	protected Set<OWLIndividual> allExamples = new TreeSet<>();

	protected Set<OWLIndividual> testPositiveExamples = new TreeSet<>();
	protected Set<OWLIndividual> testNegativeExamples = new TreeSet<>();

	@ConfigOption(description = "\"Specifies whether to use retrieval or instance checks for testing a concept. - NO LONGER FULLY SUPPORTED.",defaultValue = "false")
    private boolean useRetrievalForClassification = false;
    @ConfigOption(description = "Percent Per Length Unit", defaultValue = "0.05", required = false)
    private double percentPerLengthUnit = 0.05;

	@ConfigOption(description = "Specifies, which method/function to use for computing accuracy. Available measues are \"PRED_ACC\" (predictive accuracy), \"FMEASURE\" (F measure), \"GEN_FMEASURE\" (generalised F-Measure according to Fanizzi and d'Amato).",
			defaultValue = "PRED_ACC")
	protected AccMethodTwoValued accuracyMethod;

    public PosNegLP(){

    }

	public PosNegLP(AbstractReasonerComponent reasoningService) {
		super(reasoningService);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.dllearner.core.Component#init()
	 */
	@Override
	public void init() throws ComponentInitException {
		ExampleLoader exampleLoaderHelper = this.getExampleLoaderHelper();
		if (exampleLoaderHelper != null && !exampleLoaderHelper.isInitialized()) {
			logger.info("Loading examples by expression");
			exampleLoaderHelper.setPosNegLP(this);
			exampleLoaderHelper.init();
		}
		// check if some positive examples have been set
		if(positiveExamples.isEmpty()) {
			throw new ComponentInitException("No positive examples have been set.");
		}
		
		// check if some negative examples have been set and give warning if not
		if(negativeExamples.isEmpty()) {
			logger.warn("No negative examples have been set, but you decided to use the positive-negative learning"
					+ "problem. We recommend to use the positive-only learning problem for the case of no negative examples instead.");
		}
		
		// check if there is some overlap between positive and negative examples and give warning
		// in that case
		SetView<OWLIndividual> overlap = Sets.intersection(positiveExamples, negativeExamples);
		if(!overlap.isEmpty()) {
			logger.warn("You declared some individuals as both positive and negative examples.");
		}
		
		allExamples = Sets.union(positiveExamples, negativeExamples);
		
		if (accuracyMethod == null) {
			accuracyMethod = new AccMethodPredAcc(true);
		}
		if (accuracyMethod instanceof AccMethodApproximate) {
			((AccMethodApproximate)accuracyMethod).setReasoner(reasoner);
		}
		
		// sanity check whether examples are contained in KB
		Helper.checkIndividuals(reasoner, allExamples);
		
		initialized = true;
	}

	public Set<OWLIndividual> getNegativeExamples() {
		return negativeExamples;
	}

	public Set<OWLIndividual> getPositiveExamples() {
		return positiveExamples;
	}
	
	public void setNegativeExamples(Set<OWLIndividual> set) {
		this.negativeExamples=set;
	}

	public void setPositiveExamples(Set<OWLIndividual> set) {
		this.positiveExamples=set;
	}
	
	public Set<OWLIndividual> getTestNegativeExamples() {
		return testNegativeExamples;
	}

	public Set<OWLIndividual> getTestPositiveExamples() {
		return testPositiveExamples;
	}
	
	public void setTestNegativeExamples(Set<OWLIndividual> set) {
		this.testNegativeExamples=set;
	}

	public void setTestPositiveExamples(Set<OWLIndividual> set) {
		this.testPositiveExamples=set;
	}

	public double getPercentPerLengthUnit() {
		return percentPerLengthUnit;
	}

    public void setPercentPerLengthUnit(double percentPerLengthUnit) {
        this.percentPerLengthUnit = percentPerLengthUnit;
    }

    public boolean isUseRetrievalForClassification() {
        return useRetrievalForClassification;
    }

    public void setUseRetrievalForClassification(boolean useRetrievalForClassification) {
        this.useRetrievalForClassification = useRetrievalForClassification;
    }

	public AccMethodTwoValued getAccuracyMethod() {
	    return accuracyMethod;
	}

	@Autowired(required=false)
	public void setAccuracyMethod(AccMethodTwoValued accuracyMethod) {
	    this.accuracyMethod = accuracyMethod;
	}

	public double testEvaluation(OWLClassExpression concept, boolean print)
	{
		Set<OWLIndividual> true_positives = new HashSet<>();
		Set<OWLIndividual> false_positives = new HashSet<>();
		Set<OWLIndividual> true_negatives = new HashSet<>();
		Set<OWLIndividual> false_negatives = new HashSet<>();

		int min_match = 1;

		for(OWLIndividual example : testPositiveExamples)
		{
			int matches = 0;
			{
				if(reasoner.hasType(concept, example))
				{
					matches += 1;
				}
			}

			if(matches >= min_match)
			{
				true_positives.add(example);
			}
		}

		for(OWLIndividual example : testPositiveExamples)
		{
			ArrayList<Boolean> testing = new ArrayList<Boolean>();
			{
				if(!reasoner.hasType(concept, example))
				{
					testing.add(true);
				}
			}

			if(testing.size() == 1)
			{
				false_negatives.add(example);
			}
		}

		for(OWLIndividual example : testNegativeExamples)
		{
			int matches = 0;
			{
				if(reasoner.hasType(concept, example))
				{
					matches++;

					if(print)
					{
						System.out.println("False positive: " + example);
						System.out.println(concept);
					}
				}
			}

			if(matches >= min_match)
			{
				false_positives.add(example);
			}
		}

		for(OWLIndividual example : testNegativeExamples)
		{
			ArrayList<Boolean> testing = new ArrayList<Boolean>();
			{
				if(!reasoner.hasType(concept, example))
				{
					testing.add(true);
				}
			}

			if(testing.size() == 1)
			{
				true_negatives.add(example);
			}
		}

		double TP = Double.valueOf(true_positives.size());
		double TN = Double.valueOf(true_negatives.size());
		double FP = Double.valueOf(false_positives.size());
		double FN  = Double.valueOf(false_negatives.size());

		double acc = (TP + TN) / (this.testPositiveExamples.size() + this.testNegativeExamples.size());
		double prec = TP / (TP + FP);
		double rec = TP / (TP + FN);
		double spec = TN / (FP + TN);
		double fpr = FP / (FP + TN);
		double fm = 2 / ((1 / prec) + (1/rec));

		if(print)
		{
			System.out.println("======================================================");
			System.out.println("Test evaluation.");
			System.out.println("True positives: " + TP);
			System.out.println("True negatives: " + TN);
			System.out.println("False positives: " + FP);
			System.out.println("False negatives: " + FN);
	
			System.out.println("Accuracy: " + acc);
			System.out.println("Precission: " + prec);
			System.out.println("Recall: " + rec);
			System.out.println("Specificity: " + spec);
			System.out.println("FP rate: " + fpr);
			System.out.println("F-measure: " + fm);
		}

		return acc;
	}
}