package coding_Test_369;

import java.util.Arrays;
import java.util.Comparator;

public class CCsort {

	public static void main(String[] args) {

		Edge edge1 = new Edge(12, "A");
		Edge edge2 = new Edge(10, "A");
		Edge edge3 = new Edge(13, "A");
		Edge[] edges = new Edge[] { edge1, edge2, edge3 };

		Arrays.sort(edges, new Comparator<Edge>() {
			@Override
			public int compare(Edge objectItem1, Edge objectItem2) {
				return objectItem2.distance - objectItem1.distance;
			}
		});

		for (int index = 0; index < edges.length; index++) {
			System.out.println(edges[index].distance);
		}

	}
}

class Edge implements Comparable<Edge> {
	public Integer distance;
	public String vertex;

	public Edge(Integer distance, String vertex) {
		this.distance = distance;
		this.vertex = vertex;
	}

	@Override
	public int compareTo(Edge e) {
		return this.distance - e.distance;
	}

}
