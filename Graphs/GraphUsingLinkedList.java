package edu.ds.graphs;

import java.util.ArrayList;

public class GraphUsingLinkedList {
	
	private int vertexCount;
	private ArrayList<Integer> vertices;
	private ListNode[] edges;
	
	public GraphUsingLinkedList(int vertexCount) {
		this.vertexCount = vertexCount;
		this.vertices = new ArrayList<Integer>();
		this.edges = new ListNode [vertexCount];
		
		for (int i = 0 ; i < vertexCount; i++){
			vertices.add(i);
			edges[i] = new ListNode();
		 }
	}
	
	public void addEdge(int source, int destination){
		int i = vertices.indexOf(source);
		int j = vertices.indexOf(destination);
		if ( i != -1 || j != -1){
			edges[i].insertAtBegin(destination);
			edges[j].insertAtBegin(source);
		}
	}
	
	
	
	
	
	
	

}
