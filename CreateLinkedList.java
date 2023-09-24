public class CreateLinkedList {

	Node head;

	public void add(int value) {
		Node nNode = new Node();
		nNode.data = value;
		nNode.next = null;
		if (head == null) {
			head = nNode;
		} else {
			Node tNode = head;
			while (tNode.next != null) {
				tNode = tNode.next;
			}
			tNode.next = nNode;
		}
	}

	public void remove(int element) {
		Node tNode = head;
		Node pNode = head;
		if (head.data == element) {
			head = head.next;
		} else {
			while (tNode.next != null) {
				if (tNode.data == element) {
					pNode.next = tNode.next;
					break;
				}
				pNode = tNode;
				tNode = tNode.next;
			}
		}
	}

	public boolean contains(int value) {
		Node tNode = head;
		while (tNode!= null) {
			if (tNode.data == value) {
				return true;
			}
			tNode = tNode.next;
		}
		return false;
	}

	public void display() {
		Node tNode = head;
		while (tNode != null) {
			System.out.print(tNode.data + "\t");
			tNode = tNode.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		CreateLinkedList l = new CreateLinkedList();
		l.add(5);
		l.add(2);
		l.add(8);
		l.add(9);
		l.add(1);
		l.display();
		l.remove(9);
		l.display();
		System.out.println(l.contains(1));
	}

}