package exam;

public class Kakao_02 {

	public static void main(String[] args) {
		int n = 1;
		int k = 3;
		int answer = solution(n, k);
		System.out.println(answer);
		System.out.println(Integer.MAX_VALUE);
		

	}
	
	public static int solution(int n, int k) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        while(n >=1) {
        	sb.insert(0, n%k);
        	n /= k;
        }
        String result = sb.toString();
        System.out.println(result);
        String[] arr = result.split("0");
        for(int i = 0; i < arr.length; i++) {
        	if(arr[i].length() > 0) {
        		boolean b = true;
        		long a = Long.parseLong(arr[i]);
        		for(int j = 2; j*j <= a; j++) {
        			if(a % j == 0) {
        				b = false;
        				break;
        			}
        				
        		}
        		if(b && a > 1) {
        			answer++;
        		}
        		
        	}
        		
        	
        }
        
        return answer;
    }
	
	

}
//2147483647
//1000000