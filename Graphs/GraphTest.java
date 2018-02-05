package edu.ds.graphs;

import static org.junit.Assert.*;

import org.junit.Test;

public class GraphTest {

	@Test
	public void testGraphAdjacencyMatrix() {
		Graph g = new Graph(4);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(0, 3);
		g.addEdge(1, 2);
		g.addEdge(1, 3);
		g.addEdge(2, 3);
		assertTrue(g.isEdge(0, 1));
		assertTrue(g.isEdge(0, 2));
		assertTrue(g.isEdge(0, 3));
		assertTrue(g.isEdge(1, 2));
		assertTrue(g.isEdge(1, 3));
		assertTrue(g.isEdge(2, 3));
	}

}
