package practice_programmers;

public class Programmers_81301 {

	public static void main(String[] args) {

		Solution_81301 sol = new Solution_81301();
		String s = "one4seveneight";
		System.out.println(sol.solution(s));
	}

}


class Solution_81301 {
    public long solution(String s) {
    	long answer = 0;
        s = s.replaceAll("one", "1").replaceAll("two", "2").replaceAll("three", "3").replaceAll("four", "4").replaceAll("five", "5")
        		.replaceAll("six", "6").replaceAll("seven", "7").replaceAll("eight", "8").replaceAll("nine", "9").replaceAll("zero", "0");
        answer = Long.parseLong(s);
        return answer;
    }
}




//class Solution {
//    public int solution(String s) {
//        String[] strArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
//        for(int i = 0; i < strArr.length; i++) {
//            s = s.replaceAll(strArr[i], Integer.toString(i));
//        }
//        return Integer.parseInt(s);
//    }
//}