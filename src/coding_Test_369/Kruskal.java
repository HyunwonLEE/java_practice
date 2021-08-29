package coding_Test_369;
import java.util.Collections;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;

class Edge2 implements Comparable<Edge2>{
	public int weight;
	public String nodeV;
	public String nodeU;
	
	public Edge2(int weight, String nodeV, String nodeU) {
		this.weight = weight;
		this.nodeV = nodeV;
		this.nodeU = nodeU;
	}
	
	public String toString() {
		return "(" + this.weight + ", " + this.nodeV + ", " + this.nodeU + ")";
	}
	
	@Override
	public int compareTo(Edge2 Edge2) {
		return this.weight - Edge2.weight;
	}
	
}


public class Kruskal {

	public static void main(String[] args) {

		ArrayList<String> vetices = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E", "F", "G"));
		ArrayList<Edge2> Edges = new ArrayList<Edge2>();
		Edges.add(new Edge2(7, "A", "B"));
		Edges.add(new Edge2(5, "A", "D"));
		Edges.add(new Edge2(7, "B", "A"));
		Edges.add(new Edge2(8, "B", "C"));
		Edges.add(new Edge2(9, "B", "D"));
		Edges.add(new Edge2(7, "B", "E"));
		Edges.add(new Edge2(8, "C", "B"));
		Edges.add(new Edge2(5, "C", "E"));
		Edges.add(new Edge2(5, "D", "A"));
		Edges.add(new Edge2(9, "D", "B"));
		Edges.add(new Edge2(7, "D", "E"));
		Edges.add(new Edge2(6, "D", "F"));
		Edges.add(new Edge2(7, "E", "B"));
		Edges.add(new Edge2(5, "E", "C"));
		Edges.add(new Edge2(7, "E", "D"));
		Edges.add(new Edge2(8, "E", "F"));
		Edges.add(new Edge2(9, "E", "G"));
		Edges.add(new Edge2(6, "F", "D"));
		Edges.add(new Edge2(8, "F", "E"));
		Edges.add(new Edge2(11, "F", "G"));
		Edges.add(new Edge2(9, "G", "E"));
		Edges.add(new Edge2(11, "G", "F"));
		
		
		KruskalPath kObject = new KruskalPath();
		System.out.println(kObject.kruskalFunc(vetices, Edges));
	}	

}

class KruskalPath{
	
	HashMap<String, String> parent = new HashMap<String, String>();
	HashMap<String, Integer> rank = new HashMap<String, Integer>();
	
	public String find(String node) {
		//path comprestion 기법
		if(this.parent.get(node) != node) {
			this.parent.put(node,  this.find(this.parent.get(node)));
		}
		return this.parent.get(node);
	}
	
	public void union(String nodeV, String nodeU) {
		String root1 = this.find(nodeV);
		String root2 = this.find(nodeU);
		
		//union-by-rank 기법
		if(this.rank.get(root1) > this.rank.get(root2)) {
			this.parent.put(root2, root1);
		}else {
			this.parent.put(root1, root2);
			if(this.rank.get(root1) == this.rank.get(root2)) {
				this.rank.put(root2, this.rank.get(root2)+1);
			}
		}
	}
	public void makeSet(String node) {
		this.parent.put(node, node);
		this.rank.put(node, 0);
	}
	public ArrayList<Edge2> kruskalFunc(ArrayList<String> vertices, ArrayList<Edge2> Edges){
		ArrayList<Edge2> mst = new ArrayList<Edge2>();
		Edge2 currentEdge;
		
		// 1. 초기회
		for(int index = 0; index < vertices.size(); index++) {
			this.makeSet(vertices.get(index));
		}
		
		//2. 간선 weight 기반 sorting
		Collections.sort(Edges);
		
		for(int index = 0; index < Edges.size(); index++) {
			currentEdge = Edges.get(index);
			if(this.find(currentEdge.nodeV) != this.find(currentEdge.nodeU)) {
				this.union(currentEdge.nodeV, currentEdge.nodeU);
				mst.add(currentEdge);
			}
		}
		return mst;
	}
	
}
