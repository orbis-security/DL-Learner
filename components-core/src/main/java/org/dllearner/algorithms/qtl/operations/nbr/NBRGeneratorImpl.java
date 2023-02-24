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
package org.dllearner.algorithms.qtl.operations.nbr;

import java.util.Collections;
import java.util.List;

import org.dllearner.algorithms.qtl.datastructures.impl.RDFResourceTree;
import org.dllearner.algorithms.qtl.operations.nbr.strategy.BruteForceNBRStrategy;
import org.dllearner.algorithms.qtl.operations.nbr.strategy.NBRStrategy;

/**
 * 
 * @author Lorenz Bühmann
 *
 */
public class NBRGeneratorImpl implements NBRGenerator{
	
	NBRStrategy strategy;
	
	public NBRGeneratorImpl(){
		this.strategy = new BruteForceNBRStrategy();
	}
	
	public NBRGeneratorImpl(NBRStrategy strategy){
		this.strategy = strategy;
	}

	@Override
	public RDFResourceTree getNBR(RDFResourceTree posExampleTree,
			RDFResourceTree negExampleTree) {
		return strategy.computeNBR(posExampleTree, Collections.singletonList(negExampleTree));
	}

	@Override
	public RDFResourceTree getNBR(RDFResourceTree posExampleTree,
			List<RDFResourceTree> negExampleTrees) {
		return strategy.computeNBR(posExampleTree, negExampleTrees);
	}

	@Override
	public List<RDFResourceTree> getNBRs(RDFResourceTree posExampleTree,
			RDFResourceTree negExampleTree) {
		return strategy.computeNBRs(posExampleTree, Collections.singletonList(negExampleTree));
	}

	@Override
	public List<RDFResourceTree> getNBRs(RDFResourceTree posExampleTree,
			List<RDFResourceTree> negExampleTrees) {
		return strategy.computeNBRs(posExampleTree, negExampleTrees);
	}

	@Override
	public List<RDFResourceTree> getNBRs(RDFResourceTree posExampleTree,
			RDFResourceTree negExampleTree, int limit) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RDFResourceTree> getNBRs(RDFResourceTree posExampleTree,
			List<RDFResourceTree> negExampleTrees, int limit) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
