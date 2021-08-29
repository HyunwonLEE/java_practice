package coding_Test_369;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;

class Edge3 implements Comparable<Edge3> {
	public int weight;
	public String node1;
	public String node2;

	public Edge3(int weight, String node1, String node2) {
		this.weight = weight;
		this.node1 = node1;
		this.node2 = node2;
	}

	public String toString() {
		return "(" + this.weight + ", " + this.node1 + ", " + this.node2 + ")";
	}

	@Override
	public int compareTo(Edge3 edge) {
		return this.weight - edge.weight;
	}

}

public class PrimPath {

	public static void main(String[] args) {
		ArrayList<Edge3> myedges = new ArrayList<Edge3>();
		myedges.add(new Edge3(7, "A", "B"));
		myedges.add(new Edge3(5, "A", "D"));
		myedges.add(new Edge3(8, "B", "C"));
		myedges.add(new Edge3(9, "B", "D"));
		myedges.add(new Edge3(7, "D", "E"));
		myedges.add(new Edge3(5, "C", "E"));
		myedges.add(new Edge3(7, "B", "E"));
		myedges.add(new Edge3(6, "D", "F"));
		myedges.add(new Edge3(8, "E", "F"));
		myedges.add(new Edge3(9, "E", "G"));
		myedges.add(new Edge3(11, "F", "G"));
		
		PrimPath pObject = new PrimPath();
		System.out.println(pObject.primFunc("A", myedges));
	}

	public ArrayList<Edge3> primFunc(String startNode, ArrayList<Edge3> edges) {
		Edge3 currentEdge, poppedEdge, adjacentEdgeNode;
		ArrayList<Edge3> currentEdgeList, candidateEdgeList, adjacentEdgeNodes;
		PriorityQueue<Edge3> priorityQueue;
		
		ArrayList<String> connectedNode = new ArrayList<String>();
		ArrayList<Edge3> mst = new ArrayList<Edge3>();
		HashMap<String, ArrayList<Edge3>> adjacentEdge = new HashMap<String, ArrayList<Edge3>>();
		
		for(int index = 0; index < edges.size(); index++) {
			currentEdge = edges.get(index);
			if(!adjacentEdge.containsKey(currentEdge.node1)) {
				adjacentEdge.put(currentEdge.node1, new ArrayList<Edge3>());
			}
			if(!adjacentEdge.containsKey(currentEdge.node2)) {
				adjacentEdge.put(currentEdge.node2, new ArrayList<Edge3>());
			}
		}
		
		for(int index = 0; index < edges.size(); index++) {
			currentEdge = edges.get(index);
			currentEdgeList = adjacentEdge.get(currentEdge.node1);
			currentEdgeList.add(new Edge3(currentEdge.weight, currentEdge.node1, currentEdge.node2));
			currentEdgeList = adjacentEdge.get(currentEdge.node2);
			currentEdgeList.add(new Edge3(currentEdge.weight, currentEdge.node2, currentEdge.node1));
		}
		connectedNode.add(startNode);
		candidateEdgeList = adjacentEdge.getOrDefault(startNode, new ArrayList<Edge3>());
		priorityQueue = new PriorityQueue<Edge3>();
		
		for(int index = 0; index < candidateEdgeList.size(); index++) {
			priorityQueue.add(candidateEdgeList.get(index));
		}
		
		while(priorityQueue.size() > 0) {
			poppedEdge = priorityQueue.poll();
			if(!connectedNode.contains(poppedEdge.node2)) {
				connectedNode.add(poppedEdge.node2);
				mst.add(new Edge3(poppedEdge.weight, poppedEdge.node1, poppedEdge.node2));
				
				adjacentEdgeNodes = adjacentEdge.getOrDefault(poppedEdge.node2, new ArrayList<Edge3>());
				for(int index = 0; index < adjacentEdgeNodes.size(); index++) {
					adjacentEdgeNode = adjacentEdgeNodes.get(index);
					if(!connectedNode.contains(adjacentEdgeNode.node2)) {
						priorityQueue.add(adjacentEdgeNode);
					}
				}
			}
		}
		return mst;

	}

}
