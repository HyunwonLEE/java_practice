package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class 신입사원_1946 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			int M = Integer.parseInt(br.readLine());
			Point[] point = new Point[M];
			for(int j = 0; j < M; j++) {
				String[] arr = br.readLine().split(" ");
				point[j] = new Point(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]));
			}
			
			Arrays.sort(point, new Comparator<Point>() {

				@Override
				public int compare(Point o1, Point o2) {
					// TODO Auto-generated method stub
					return o1.document - o2.document;
				}
				
			});
			
			int cutline_in = point[0].interview;
			
			
			
			int cutline_doc = point[0].document;
			
			int result = 0;
			for(int j = 0; j < point.length; j++) {
				if(point[j].interview <= cutline_in) {
					result++;
					cutline_in = point[j].interview;
				}
					
				
			}
			sb.append(result).append('\n');
			
		}
		System.out.println(sb.toString());
	}

}

class Point{
	int document;
	int interview;
	
	Point(){
		
	}
	
	Point (int document, int interview){
		this.document = document;
		this.interview = interview;
	}
}
