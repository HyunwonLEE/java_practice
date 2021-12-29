package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.TreeMap;

public class º£½ºÆ®¼¿·¯_1302 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
		
		for(int i = 0; i < N; i++) {
			String str = br.readLine();
			if(map.containsKey(str)) {
				int temp = map.get(str) + 1;
				map.put(str, temp);
			}else {
				map.put(str, 1);
			}
		}
		
		Iterator<String> it = map.keySet().iterator();
		int max = 0;
		String str = "";
		while(it.hasNext()) {
			String key = it.next();			
			
			if(max < map.get(key)) {
				max = map.get(key);
				str = key;
			}
		}
		System.out.println(str);
	}

}

