package coding_Test_369;

public class Recursive {

	public static void main(String[] args) {
		Factorial fObject = new Factorial();
		System.out.println(fObject.factorialFunc(6));

	}

}

class Factorial {
	public int factorialFunc(int data) {
		if (data == 1) {
			return 1;
		} else if (data == 2) {
			return 2;
		} else if (data == 3) {
			return 4;
		}
		return this.factorialFunc(data - 1) + this.factorialFunc(data - 2) + this.factorialFunc(data - 3);
	}
}