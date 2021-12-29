package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class 점수계산_2822 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		Point_cal[] arr = new Point_cal[8];
		int total = 0;
		for(int i = 0; i < arr.length; i++) {
			int temp = Integer.parseInt(br.readLine());
			arr[i] = new Point_cal(temp, i + 1);
			
		}
		Arrays.sort(arr, new Comparator<Point_cal>() {

			@Override
			public int compare(Point_cal o1,Point_cal o2) {				
				return o2.point - o1.point;
			}
		});
		
		int[] index = new int[5];
		
		for(int i = 0; i < 5; i++) {
			index[i] = arr[i].index;
			total += arr[i].point;
		}
		
		Arrays.sort(index);
		sb.append(total).append('\n');
		for (int i : index) {
			sb.append(i).append(' ');
		}
		System.out.println(sb.toString());
		
	}

}

class Point_cal{
	int point;
	int index;
	
	Point_cal(){
		
	}
	
	Point_cal(int point, int index){
		this.point = point;
		this.index = index;
	}
}
