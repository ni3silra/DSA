package com.datastructure.graph;

public class AdjacencyList implements Graph {

	Edge edge;

	AdjacencyList() {
		super();
		edge = new Edge();
	}

	@Override
	public void addVertex(int value) {

		if (edge == null)
			edge.setValue(value);
		else {
			Edge edge = this.edge;
			while (edge.getEdge() != null) {
				edge = edge.getEdge();
			}
			edge.setValue(value);
		}
	}

	@Override
	public void addEdge(int value1, int value2) {
		Edge edge1 = this.edge;
		Edge edge2 = this.edge;

		while (edge1.getValue().equals(value1)) {
			edge1 = edge1.getEdge();
		}

		while (edge2.getValue().equals(value1)) {
			edge2 = edge2.getEdge();
		}

		edge1.setEdge(edge2);

	}

	@Override
	public String showConnection() {
		// TODO Auto-generated method stub
		return null;
	}

}
