package practice_programmers;

public class Days {

	public static void main(String[] args) {
		int a = 1;
		int b = 14;
		int days = 0;
		String answer = "";

		String[] weeks = { "FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU" };

		for (int i = 1; i < a; i++) {
			switch (i) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12: {

				days += 31;
				break;
			}
			case 2: {
				days += 29;
				break;
			}
			case 4:
			case 6:
			case 9:
			case 11: {
				days += 30;
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + a);
			}

		}
        int index = (days + b ) % weeks.length == 0 ? 6 :  (days + b ) % weeks.length -1;
		answer = weeks[index];
		System.out.println(answer);

	}

}
