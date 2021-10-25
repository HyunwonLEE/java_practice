package coding_Test_369;

public class BruteForce_07 {
	static FastReader scan = new FastReader();
	static StringBuilder sb = new StringBuilder();

	static void input() {
		N = scan.nextInt();
		S = scan.nextInt();
		nums = new int[N + 1];
		for (int i = 1; i <= N; i++)
			nums[i] = scan.nextInt();
	}

	static int N, S, ans;
	static int[] nums;

	// k��° ���Ҹ� ���Խ�ų �� ���ϴ� �Լ�
	// value:= k-1 ��° ���ұ��� ����� ���ҵ��� ��
	static void rec_func(int k, int value) {
		if (k == N + 1) {// �κ� ������ �ϳ� �ϼ� ��Ų ����
			// value�� S�� ������ Ȯ�� �ϱ�
			if (value == S)
				ans++;

		} else {
			// k��° ���Ҹ� ���Խ�ų �� �����ϰ� ���ȣ�����ֱ�
			// Include
			rec_func(k + 1, value + nums[k]);
			// Not Include
			rec_func(k + 1, value);
		}
	}

	public static void main(String[] args) {
		input();
		// 1 ��° ���Һ��� M ��° ���Ҹ� ���ǿ� �°� ���� ��� ����� Ž������
		rec_func(1, 0);
		// ans �� ���� "�� �κ�����"�� �ٷ�� �� Ȯ���ϱ�
		if (S == 0) {
			ans--;
		}
		System.out.println(ans);
	}

}
