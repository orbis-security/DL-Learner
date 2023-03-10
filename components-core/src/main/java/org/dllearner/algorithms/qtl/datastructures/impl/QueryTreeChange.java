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
package org.dllearner.algorithms.qtl.datastructures.impl;

public class QueryTreeChange {
	
	public enum ChangeType{
		REPLACE_LABEL,
		REMOVE_NODE
	}
	
	private int nodeId;
	
	private ChangeType type;
	
	private String object;
	private String edge;
	
	public QueryTreeChange(int nodeId, ChangeType type){
		this.nodeId = nodeId;
		this.type = type;
	}
	
	public int getNodeId() {
		return nodeId;
	}

	public ChangeType getType() {
		return type;
	}
	
	public String getObject() {
		return object;
	}

	public void setObject(String object) {
		this.object = object;
	}

	public String getEdge() {
		return edge;
	}

	public void setEdge(String edge) {
		this.edge = edge;
	}

	@Override
	public String toString() {
//		return "nodeId" + (type==ChangeType.REPLACE_LABEL ? "Replace" : "Remove");
		return nodeId + (type==ChangeType.REPLACE_LABEL ? "a" : "b");
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == this){
			return true;
		}
		if(obj == null || !(obj instanceof QueryTreeChange)){
			return false;
		}
		QueryTreeChange other = (QueryTreeChange)obj;
		return nodeId == other.getNodeId() && type == other.getType();
	}
	
	@Override
	public int hashCode() {
		return nodeId + type.hashCode() + 37;
	}

}
