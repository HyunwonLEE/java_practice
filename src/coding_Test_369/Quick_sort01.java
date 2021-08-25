package coding_Test_369;

public class Quick_sort01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


class QuickSort {
	
	public static void sort(int[] a) {
		m_pivot_sort(a, 0, a.length - 1);
	}
	
	/**
	 *  �߰� �ǹ� ���� ���
	 * @param a		������ �迭
	 * @param lo	���� �κй迭�� ����
	 * @param hi	���� �κй迭�� ������
	 */
	private static void m_pivot_sort(int[] a, int lo, int hi) {
		
		/*
		 *  lo�� hi���� ũ�ų� ���ٸ� ���� �� ���Ұ� 
		 *  1�� �����̹Ƿ� �������� �ʰ� return�Ѵ�.
		 */
		if(lo >= hi) {
			return;
		}
		
		/*
		 * �ǹ��� �������� ��ҵ��� ���ʰ� ���������� ���ϰ� ���� �� ���·�
		 * ����� �� ��, ���������� pivot�� ��ġ�� ��´�.
		 * 
		 * �׸����� �ش� �ǹ��� �������� ���� �κи���Ʈ�� ������ �κи���Ʈ�� ������
		 * ���� ������ ���ش�.
		 * 
		 * [����]
		 * 
		 * Partitioning:
		 *
		 *      left part      a[(right + left)/2]      right part      
		 * +---------------------------------------------------------+
		 * |    element < pivot    |  pivot  |    element >= pivot   |
		 * +---------------------------------------------------------+
		 *    
		 *    
		 *  result After Partitioning:
		 *  
		 *         left part         a[hi]          right part
		 * +---------------------------------------------------------+
		 * |   element < pivot    |  pivot  |    element >= pivot    |
		 * +---------------------------------------------------------+
		 *       
		 *       
		 *  result : pivot = hi     
		 *       
		 *
		 *  Recursion:
		 *  
		 * m_pivot_sort(a, lo, pivot)         m_pivot_sort(a, pivot + 1, hi)
		 *  
		 *         left part                           right part
		 * +-----------------------+             +-----------------------+
		 * |   element <= pivot    |             |    element > pivot    |
		 * +-----------------------+             +-----------------------+
		 * lo                pivot          pivot + 1                   hi
		 * 
		 */
		int pivot = partition(a, lo, hi);	
		
		m_pivot_sort(a, lo, pivot);
		m_pivot_sort(a, pivot + 1, hi);
	}
	
	
	
	/**
	 * pivot�� �������� ��Ƽ���� ������ ���� ���� ���� �޼ҵ�
	 * 
	 * @param a		���� �� �迭 
	 * @param left	���� �迭�� ���� ���� �κ�
	 * @param right	���� �迭�� ���� ������ �κ�
	 * @return		���������� ��ġ�� �ǹ��� ��ġ(hi)�� ��ȯ
	 */
	private static int partition(int[] a, int left, int right) {
		
		// lo�� hi�� ���� �迭�� ������ 1 ��� ��ġ���� �����Ѵ�.
		int lo = left - 1;
		int hi = right + 1;
		int pivot = a[(left + right) / 2];		// �κи���Ʈ�� �߰� ��Ҹ� �ǹ����� ����
		
 
		while(true) {
			
			/*
			 * 1 ������Ű�� �� ���� lo ��ġ�� ��Ұ� pivot���� ū ��Ҹ�
			 * ã�� �� ���� �ݺ��Ѵ�.
			 */
			do { 
				lo++; 
			} while(a[lo] < pivot);
 
			
			/*
			 * 1 ���ҽ�Ű�� �� ���� hi ��ġ�� lo���� ũ�ų� ���� ��ġ�̸鼭
			 * hi��ġ�� ��Ұ� pivot���� ���� ��Ҹ� ã�� �� ���� �ݺ��Ѵ�.
			 */
			do {
				hi--;
			} while(a[hi] > pivot && lo <= hi);
			
			
			/*
			 * ���� hi�� lo���� ũ�� �ʴٸ�(�������ٸ�) swap���� �ʰ� hi�� �����Ѵ�.
			 */
			if(lo >= hi) {
				return hi;
			}
			
			
			// ��ȯ �� �� ��Ҹ� ã������ �� ��Ҹ� �ٲ۴�.
			swap(a, lo, hi);
		}
		
	}
	
	
	
	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
}