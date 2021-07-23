package coding_test_369;



public class BinaryTree02 {
	Node head = null;
	public boolean delete(int value) {
		boolean searched = false;
		
		Node currParentNode = this.head;
		Node currNode = this.head;

		// �ڳ� ���̽�1 : Node�� �ϳ��� ���� ��,
		if (this.head == null) {
			return false;
		} else {
			// �ڳ� ���̽�2 : Node�� ���� �ϳ��� �ְ�, �ش� Node�� ������ Node�� ��,
			if (this.head.value == value && this.head.left == null && this.head.right == null) {
				this.head = null;
				return true;
			}
			while (currNode != null) {
				if (currNode.value == value) {
					searched = true;
					break;
				} else if (value < currNode.value) {
					currParentNode = currNode;
					currNode = currNode.left;
				} else {
					currParentNode = currNode;
					currNode = currNode.right;
				}
			}
		}
		// Case1 : ������ Node�� Leaf Node�� ���
		if (currNode.left == null && currNode.right == null) {
			if (value < currParentNode.value) {
				currParentNode.left = null;
				currNode = null;
			} else {
				currParentNode.right = null;
				currNode = null;
			}
			return true;
			// Case 2-1 : ������ Node�� ChildNode�� �� �� ������ ���� ��� (���ʿ� ChildNode�� ���� ���)
		} else if (currNode.left != null && currNode.right == null) {
			if (value < currParentNode.value) {
				currParentNode.left = currNode.left;
				currNode = null;
			} else {
				currParentNode.right = currNode.left;
				currNode = null;
			}
			return true;
			// Case 2-2 ; ������ Node�� ChildNode�� �� �� ������ ���� ��� (�����ʿ� ChileNode�� ���� ���)
		} else if (currNode.left == null && currNode.right != null) {
			if (value < currParentNode.value) {
				currParentNode.left = currNode.right;
				currNode = null;
			} else {
				currParentNode.right = currNode.right;
				currNode = null;
			}
			return true;
			// Case3-1 : ������ Node�� ChileNode�� �� �� ������ �ְ�,
		} else {
			// ������ Node�� �θ� Node�� ���ʿ� ���� ��
			if (value < currParentNode.value) {
				Node changeNode = currNode.right;
				Node changeParentNode = currNode.right;
				while (changeNode.left != null) {
					changeParentNode = changeNode;
					changeNode = changeNode.left;
				}
				// ������� ����Ǹ�, ChangeNode���� ������ Node�� ������ Node�߿���,
				// ���� ���� ���� ���� Node�� ��� ����.
				if (changeNode.right != null) {
					// Case3-1-2 : changedNode�� ������ ChileNode�� ���� ��,
					changeParentNode.left = changeNode.right;
				} else {
					// Case3-1-1 :changeNode�� ChildNode�� ���� ��,
					changeParentNode.left = null;
				}

				// currParentNode�� ���� ChildNode�� ������ Node�� ������ �ڽ� ��,
				// ���� ���� ���� ���� changeNode�� ����.
				currParentNode.left = currNode;

				// parentNode �� ���� Child Node �� ����, changeNode �̰�,
				// changeNode �� ����/������ Child Node �� ���, ������ currNode ��
				// ���� ����/������ Node �� ����
				changeNode.right = currNode.right;
				changeNode.left = currNode.left;

				currNode = null;
				// Case3-2: ������ Node �� Child Node �� �� �� ������ �ְ�, (������ Node �� �θ� Node �� �����ʿ� ���� ��)
			} else {
				Node changeNode = currNode.right;
				Node changeParentNode = currNode.right;
				while (changeNode.left != null) {
					changeParentNode = changeNode;
					changeNode = changeNode.left;
				}
				// ������� ����Ǹ�, changeNode ���� ������ Node �� ������ Node �߿���,
				// ���� ���� ���� ���� Node �� �������

				if (changeNode.right != null) {
					// Case 3-2-2: changeNode �� ������ Child Node �� ���� ��
					changeParentNode.left = changeNode.right;
				} else {
					// Case 3-2-1: changeNode �� Child Node �� ���� ��
					changeParentNode.left = null;
				}

				// currParentNode �� ������ Child Node ��, ������ Node �� ������ �ڽ���,
				// ���� ���� ���� ���� changeNode �� ����
				currParentNode.right = changeNode;

				// parentNode �� ���� Child Node �� ����, changeNode �̰�,
				// changeNode �� ����/������ Child Node �� ���, ������ currNode ��
				// ���� ����/������ Node �� ����
				changeNode.right = currNode.right;
				changeNode.left = currNode.left;

				currNode = null;
			}
			return true;

		}

	}

}
