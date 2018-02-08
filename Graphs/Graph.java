package edu.ds.graphs;

import java.util.Stack;

public class Graph {
	private final int maxVertices = 20;
	private Vertex vertexList[];
	private int adjMatrix[][];
	private int vertexCount;
	
	public Graph() {
		//used to number the vertices - as they are added in a graph
		vertexList = new Vertex[maxVertices];
		//used to denote edges in between any two vertices in the graph.
		adjMatrix = new int[maxVertices][maxVertices];
		//used to keep track of the number of vertices added so far.
		vertexCount = 0;
	}
	
	public void addVertex(char label){
		vertexList[vertexCount++] = new Vertex(label);
	}
	
	public void addEdge(int i, int j){
		if (i >= 0 && i < maxVertices && j >=0 && j < maxVertices){
			adjMatrix[i][j] = 1;
			adjMatrix[j][i] = 1;
		}
	}
	
	//method to display vth vertex in a graph
	public void displayVertex(int v){
		System.out.print(vertexList[v].getLabel() + " ");
	}
	
	public void dfs(){
		Stack<Integer> stack = new Stack<Integer>();
		vertexList[0].setVisited(true);
		displayVertex(0);
		stack.push(0);
		while (!stack.isEmpty()){
			//get an unvisited adjacent vertex to stack top
			int v = getAdjUnvisitedVertex(stack.peek());
			if (v == -1){
				stack.pop();
			}
			else {
				vertexList[v].setVisited(true);
				displayVertex(v);
				stack.push(v);
			}
		}
	}

	private int getAdjUnvisitedVertex(int peek) {
		for (int j=0; j < vertexCount;j++){
			if (adjMatrix[peek][j] == 1 && vertexList[j].isVisited() == false){
				return j;
			}
		}
		return -1;
	}
	
	public void bfs(){
		Queue<Integer> q = new LinkedList<Integer>();
		vertexList[0].setVisited(true);
		displayVertex(0);
		q.offer(0);
		int v2;
		while (!q.isEmpty()){
			int v1 = q.remove();
			while ((v2 = getAdjUnvisitedVertex(v1)) != -1){
				vertexList[v2].setVisited(true);
				displayVertex(v2);
				q.offer(v2);
			}
		}
		
		for (int j = 0; j < vertexCount; j++){
			vertexList[j].setVisited(false);
		}
		
	}
}
