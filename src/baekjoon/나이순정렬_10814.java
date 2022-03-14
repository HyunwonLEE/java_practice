package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

public class 나이순정렬_10814 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		Consumer[] consumer = new Consumer[N];
		
		for(int i = 0; i < N; i++) {
			String[] arr = br.readLine().split(" ");
			int age = Integer.parseInt(arr[0]);
			String name = arr[1];
			consumer[i] = new Consumer(i, age, name);
		}
		
		Arrays.sort(consumer, new Comparator<Consumer>() {

			@Override
			public int compare(Consumer o1, Consumer o2) {
				if(o1.age == o2.age) {
					return o1.index - o2.index;
				}
				return o1.age - o2.age;
			}
		});
		
		for(int i = 0; i < consumer.length; i++) {
			bw.append(consumer[i].age + " " + consumer[i].name + "\n");
		}
		bw.flush();

	}

}

class Consumer{
	
	int index;
	int age;
	String name;
	public Consumer() {
		
	}
	public Consumer(int index, int age, String name) {
		this.index = index;
		this.age = age;
		this.name = name;
	}
}