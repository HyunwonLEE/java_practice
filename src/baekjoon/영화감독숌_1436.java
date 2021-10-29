package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ¿µÈ­°¨µ¶¼ò_1436 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int i = 0;
		String temp = "666";
		int index = 666;
		while(N > i) {
			String str = String.valueOf(index);
			if(str.contains(temp)) {
				i++;
				if(N == i)break;
			}
			index++;
		}
		
		
		bw.write(index+"\n");
		bw.flush();
	}

}
