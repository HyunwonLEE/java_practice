package softeer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
//import java.util.Arrays;
//import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
//import java.util.PriorityQueue;
import java.util.TreeSet;


public class 강의실배정_Exam {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
//		Lectures[] arr = new Lectures[N];
		TreeSet<Integer> set = new TreeSet<Integer>();
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < N; i++) {
			String[] sarr = br.readLine().split(" ");
			int start = Integer.parseInt(sarr[0]);
			int end = Integer.parseInt(sarr[1]);
			set.add(start);
			if(map.containsKey(start)) {
				if(map.get(start) > end) {
					map.put(start, end);
				}
			}else {
				map.put(start, end);
			}
		}
//		Arrays.sort(arr, new Comparator<Lectures>() {
//
//			@Override
//			public int compare(Lectures o1, Lectures o2) {
//				
//				if (o1.start == o2.start) {
//					return (o1.end - o1.start) - (o2.end - o2.start);
//				}
//				return o1.start - o2.start;
//			}
//		});
		int answer = 1;
		Iterator<Integer> ir = set.iterator();
		int prevEnd = map.get(ir.next());
		while(ir.hasNext()) {
			int start = ir.next();
			int end = map.get(start);
			if(prevEnd <= start) {
				prevEnd = end;
				answer++;
			}
			
		}
		bw.write(answer + "\n");
		bw.flush();

	}

}

//class Lectures {
//
//	public int start;
//	public int end;
//
//	Lectures() {
//
//	}
//
//	public Lectures(int start, int end) {
//		this.start = start;
//		this.end = end;
//
//	}
//
//}
