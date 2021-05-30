package self_study;

class Solution_07 {
	public int calc_penalty(int limit, int[] car_speed) {
		int penalty = 0;
		for (int i = 0; i < car_speed.length; i++) {
			double temp = car_speed[i] - limit;
			if (temp > 0) {
				double a = temp / limit;				
				if(a >= 0.3) penalty += 7;
				else if (a >= 0.2 && a < 0.3) penalty += 5;
				else if (a >= 0.1 && a < 0.2) penalty += 3;
				}
			}		
		return penalty;
	}
}

public class Day07 {
	public static void main(String[] args) {

		Solution_07 sol = new Solution_07();

		int speed = 100;
		int[] cars = { 110, 98, 125, 148, 120, 112, 89 };
		int ret = sol.calc_penalty(speed, cars);
		System.out.println(ret);

		speed = 110;
		cars = new int[] { 100, 110, 95, 130, 132, 120, 120, 90, 88 };
		ret = sol.calc_penalty(speed, cars);
		System.out.println(ret);

	}

}
