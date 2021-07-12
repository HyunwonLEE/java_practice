package cos;
// You may use import as below.
//import java.util.*;

class A_1_initial_code{
    public long solution(long num) {
        // Write code here.
        long answer = 0;
        num++;
        char[] array = Long.toString(num).toCharArray();
        String str = "";
        for(int i = 0; i < array.length; i++) {
        	if(array[i] == '0') array[i] = '1';
        	str += array[i];
        }
        answer = Long.parseLong(str);
        return answer;
    }    
    
/* Á¤´ä
class A_1_initial_code {
    public long solution(long num) {
        num++;
        long digit = 1;
        while (num / digit % 10 == 0) {
            num += digit;
            digit *= 10;
        }
        return num;
    }
}

*/

    // The following is main method to output testcase.
    public static void main(String[] args) {
    	A_1_initial_code sol = new A_1_initial_code();
        long num = 9949999;
        long ret = sol.solution(num);

        // Press Run button to receive output. 
        System.out.println("Solution: return value of the method is " + ret + " .");
    }
}