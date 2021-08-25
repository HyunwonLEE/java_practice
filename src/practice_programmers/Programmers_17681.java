package practice_programmers;

public class Programmers_17681 {

	public static void main(String[] args) {
		int n = 5;
		int[] arr1 = {9, 20, 28, 18, 11};
		int[] arr2 = {30, 1, 21, 17, 28};
		Solution_17681 s = new Solution_17681();
		for (String i : s.solution(n, arr1, arr2)) {
			System.out.println(i);
		}
		
	}

}
class Solution_17681{
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i = 0; i < n; i++) {
        	String arr1_str = String.format("%0" + n +"d", Long.parseLong(Integer.toBinaryString(arr1[i])));
        	String arr2_str = String.format("%0" + n +"d", Long.parseLong(Integer.toBinaryString(arr2[i])));
        	answer[i] = "";
        	for(int j = 0; j < arr1_str.length(); j++) {
        		
        		if(arr1_str.charAt(j) == '0' && arr2_str.charAt(j) == '0') {
        			 answer[i] += " ";
        		}else {
        			answer[i] += "#";
        		}
        	}
        	
        	
        	
        }
        return answer;
    }
}



// 다른 사람 풀이
//class Solution {
//  public String[] solution(int n, int[] arr1, int[] arr2) {
//        String[] result = new String[n];
//        for (int i = 0; i < n; i++) {
//            result[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
//        }
//
//        for (int i = 0; i < n; i++) {
//            result[i] = String.format("%" + n + "s", result[i]);
//            result[i] = result[i].replaceAll("1", "#");
//            result[i] = result[i].replaceAll("0", " ");
//        }
//
//        return result;
//    }
//}