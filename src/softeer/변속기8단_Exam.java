package softeer;

import java.util.Scanner;

public class 변속기8단_Exam {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String result = "";
		
		int temp = sc.nextInt();
		if(temp == 1) {
			result = "ascending";
		}else if(temp ==8) {
			result = "descending";
		}else {
			result = "mixed";
		}
		
		for (int i = 2; i < 9; i++) {
			temp = sc.nextInt();

			if (temp == i && result.equals("ascending")) {
				
			} else if (temp == (9 - i) && result.equals("descending")) {
				
			} else {
				result = "mixed";
				break;
			}
			
		}
		System.out.println(result);
	}

}
