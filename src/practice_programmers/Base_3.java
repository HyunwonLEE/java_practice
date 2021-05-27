package practice_programmers;

public class Base_3 {

	public static void main(String[] args) {

		Solution_3 solution = new Solution_3();
		solution.solution(45);
	}

}

class Solution_3 {
    public int solution(int n) {
        int answer = 0;
        String str = "";
        while(n > 0){
            str = (n % 3) + str;
            n /= 3;
        }
        String[] array = str.split("");        

        for(int i = array.length -1; i >= 0; i --){
            answer += Integer.parseInt(array[i]) * (Math.pow(3, i));

        }
        
         

        return answer;
    }
}