package coding_Test_369;

public class Dynamics {

	public static void main(String[] args) {

		DynamicFunc dy = new DynamicFunc();
		System.out.println(dy.Fibonacci(10));
	}

}

class DynamicFunc {
	public int Fibonacci(int data) {
		Integer[] cache = new Integer[data + 1];
		cache[0] = 0;
		cache[1] = 1;
		for (int index = 2; index < data + 1; index++) {
			cache[index] = cache[index - 1] + cache[index - 2];
		}
		return cache[data];
	}
}