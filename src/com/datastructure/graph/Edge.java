package com.datastructure.graph;

public class Edge {

	Object value;
	Edge edge;

	public Edge(Object value, Edge edge) {
		super();
		this.value = value;
		this.edge = edge;
	}

	public Edge() {
		this(null, null);
	}

	public Object getValue() {
		return value;
	}

	public Edge setValue(Object value) {
		this.value = value;
		return this;
	}

	public Edge getEdge() {
		return edge;
	}

	public Edge setEdge(Edge edge) {
		this.edge = edge;
		return this;
	}

}
