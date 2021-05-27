package practice_programmers;


public class Programmers_12916 {
    public boolean solution(String s) {
        boolean answer = true;
        s.toLowerCase();
        int p = 0;
        int y = 0;
        String[] array = s.split("");
        
        int a = 1234;
        
        for(int i = 0; i < array.length; i++) {
        	if(array[i].equals("p")) {
        		p++;
        	}else if(array[i].equals("y")) {
        		y++;
        	}
        }
        if(p == y) {
        	answer = true;
        }
        else {
        	answer = false;
        }
        
        

        return answer;
    }

}
