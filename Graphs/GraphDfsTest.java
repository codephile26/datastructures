package edu.ds.graphs;

import static org.junit.Assert.*;

import org.junit.Test;

public class GraphDfsTest {

	@Test
	public void testDfs() {
		Graph g = new Graph();
		g.addVertex('A');
		g.addVertex('B');
		g.addVertex('C');
		g.addVertex('D');
		g.addVertex('E');
		g.addVertex('F');
		g.addVertex('G');
		g.addVertex('H');
		g.addEdge(0, 1);
		g.addEdge(1, 2);
		g.addEdge(1, 6);
		g.addEdge(2, 3);
		g.addEdge(2, 4);
		g.addEdge(4, 5);
//		g.addEdge(4, 6);
		g.addEdge(4, 7);
		g.dfs();
		
	}
	
	@Test
	public void testBfs() {
		Graph g = new Graph();
		g.addVertex('A');
		g.addVertex('B');
		g.addVertex('C');
		g.addVertex('D');
		g.addVertex('E');
		g.addVertex('F');
		g.addVertex('G');
		g.addVertex('H');
		g.addEdge(0, 1);
		g.addEdge(1, 2);
		g.addEdge(1, 7);
		g.addEdge(2, 3);
		g.addEdge(2, 4);
		g.addEdge(4, 5);
		g.addEdge(4, 7);
		g.addEdge(4, 6);
		g.bfs();
		
	}

}
