
public class CircularLinkedList {
	
	Node head;
	Node tail;

	public void add(int value) {
		Node nNode = new Node();
		nNode.data = value;
		nNode.next = null;
		if (head == null) {
			head = nNode;
			tail=nNode;
		} else {
			tail.next=nNode;
			tail=nNode;
			tail.next=head;
			/*
			 * Node tNode = head; while (tNode.next != null) { tNode = tNode.next; }
			 * tNode.next = nNode;
			 */
		}
	}
	
	public void display() {
		Node tNode = head;
		do {
			System.out.print(tNode.data + "\t");
			tNode = tNode.next;
		}
		while (tNode!= head);
		System.out.println();
	}
	public static void main(String[] args) {
		CircularLinkedList c=new CircularLinkedList();
		c.add(9);
		c.add(2);
		c.add(3);
		c.display();

	}

}