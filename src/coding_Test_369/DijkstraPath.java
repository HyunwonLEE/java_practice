package coding_Test_369;

import java.util.PriorityQueue;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;

class Edge1 implements Comparable<Edge1> {
	public int distance;
	public String vertex;

	public Edge1(int distance, String vertex) {
		this.distance = distance;
		this.vertex = vertex;
	}

	public String toString() {
		return "vertex: " + this.vertex + ", distance: " + this.distance;
	}

	@Override
	public int compareTo(Edge1 Edge1) {
		return this.distance - Edge1.distance;
	}
}

public class DijkstraPath {

	public static void main(String[] args) {

		HashMap<String, ArrayList<Edge1>> graph = new HashMap<String, ArrayList<Edge1>>();
		graph.put("A", new ArrayList<Edge1>(Arrays.asList(new Edge1(8, "B"), new Edge1(1, "C"), new Edge1(2, "D"))));
		graph.put("B", new ArrayList<Edge1>());
		graph.put("C", new ArrayList<Edge1>(Arrays.asList(new Edge1(5, "B"), new Edge1(2, "D"))));
		graph.put("D", new ArrayList<Edge1>(Arrays.asList(new Edge1(3, "E"), new Edge1(5, "F"))));
		graph.put("E", new ArrayList<Edge1>(Arrays.asList(new Edge1(1, "F"))));
		graph.put("F", new ArrayList<Edge1>(Arrays.asList(new Edge1(5, "A"))));

		DijkstraPath dObject = new DijkstraPath();
//		dObject.dijkstraFunc(graph, "A");
		System.out.println(dObject.dijkstraFunc(graph, "A"));	

	}
	public HashMap<String, Integer> dijkstraFunc(HashMap<String, ArrayList<Edge1>> graph, String start) {
		Edge1 Edge1Node, adjacentNode;
		ArrayList<Edge1> nodeList;
		int currentDistance, weight, distance;
		String currentNode, adjacent;
		HashMap<String, Integer> distances = new HashMap<String, Integer>();
		for (String key : graph.keySet()) {
			distances.put(key, Integer.MAX_VALUE);
		}
		distances.put(start, 0);

		PriorityQueue<Edge1> priorityQueue = new PriorityQueue<Edge1>();
		priorityQueue.add(new Edge1(distances.get(start), start));

		while (priorityQueue.size() > 0) {
			Edge1Node = priorityQueue.poll();
			currentDistance = Edge1Node.distance;
			currentNode = Edge1Node.vertex;

			if (distances.get(currentNode) < currentDistance) {
				continue;
			}
			nodeList = graph.get(currentNode);
			for (int index = 0; index < nodeList.size(); index++) {
				adjacentNode = nodeList.get(index);
				adjacent = adjacentNode.vertex;
				weight = adjacentNode.distance;
				distance = currentDistance + weight;

				if (distance < distances.get(adjacent)) {
					distances.put(adjacent, distance);
					priorityQueue.add(new Edge1(distance, adjacent));
				}
			}
		}
		return distances;
	}

}
