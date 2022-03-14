package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class 생일_5635 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		BirthDay[] birthday = new BirthDay[N];
		for(int i = 0; i < N; i++) {
			String[] arr = br.readLine().split(" ");
			String name = arr[0];
			int dd = Integer.parseInt(arr[1]);
			int mm = Integer.parseInt(arr[2]);
			int yyyy = Integer.parseInt(arr[3]);
			birthday[i] = new BirthDay(name, dd, mm, yyyy);
		}
		
		Arrays.sort(birthday, new Comparator<BirthDay>() {

			@Override
			public int compare(BirthDay o1, BirthDay o2) {
				if(o1.yyyy == o2.yyyy) {
				
					if(o1.mm == o2.mm) {
						
						return o1.dd - o2.dd;
					}
					return o1.mm - o2.mm;
				}
				return o1.yyyy - o2.yyyy;
			}
		});
		
		sb.append(birthday[N-1].name).append('\n');
		sb.append(birthday[0].name);
		
		System.out.println(sb.toString());

	}

}


class BirthDay{
	String name;
	int dd;
	int mm;
	int yyyy;
	
	BirthDay(){
		
	}
	
	BirthDay(String name, int dd, int mm, int yyyy){
		this.name = name;
		this.dd = dd;
		this.mm = mm;
		this.yyyy = yyyy;
	}
}