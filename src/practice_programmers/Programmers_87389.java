package practice_programmers;

public class Programmers_87389 {

	public static void main(String[] args) {

		int a = solution(30);
		System.out.println(a);
	}
	public static int solution(int n) {
        int answer = 0;
        int i = 1;
        int div_n = n;
        while(i < n){
            div_n = div_n % i;
            if(div_n == 1){
                return answer = i;
            }else{
                i++;
                div_n = n;
            }
            
        }
        return answer;
    }

}
