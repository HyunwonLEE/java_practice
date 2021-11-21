package coding_Test_369;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
//import java.util.StringTokenizer;

public class SortApplication_01 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		Student[] student = new Student[N];
		for(int i = 0; i < N; i++) {			
			String[] arr = br.readLine().split(" ");
			String name = arr[0];
			int kor = Integer.parseInt(arr[1]);
			int eng = Integer.parseInt(arr[2]);
			int math = Integer.parseInt(arr[3]);			
			student[i] = new Student(name, kor, eng, math);

			
		}
		
		Arrays.sort(student, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				if(o1.kor == o2.kor) {
					if(o1.eng == o2.eng) {
						if(o1.math == o2.math) {
							return o1.name.compareTo(o2.name);
						}
						return o2.math - o1.math;
					}
					return o1.eng -o2.eng;
					
				}
				return o2.kor - o1.kor;
			}
		});
		
		for(int i = 0; i < student.length; i++) {
			sb.append(student[i].name).append('\n');
		}
		System.out.println(sb.toString());
		
	}
	
	

}

class Student {
	String name;
	int kor;
	int eng;
	int math;

	Student() {

	}

	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
}