public class Linklist {
	Node head; // Head of Linked List

	/**
	 * Append the data Value
	 * 
	 * @param int data
	 */
	public void insert(int data) {
		Node node = new Node();
		node.data = data;
		if (head == null) {
			head = node;
		} else {
			Node n = head;

			while (n.next != null) {
				n = n.next;
			}
			n.next = node;
		}
	}

	/**
	 * insert Data at start
	 * 
	 * @param data
	 */
	public void insertAtStart(int data) {
		Node node = new Node();
		node.data = data;
		node.next = head;
		head = node;
	}

	/**
	 * Insert Data at given index
	 * 
	 * @param index
	 * @param data
	 */
	public void insertAt(int index, int data) {
		Node node = new Node();
		node.data = data;
		if (index == 0) {
			insertAtStart(data);
		} else {
			Node n = head;
			for (int i = 0; i < index - 1; i++) {
				n = n.next;
			}
			node.next = n.next;
			n.next = node;
		}
	}

	/**
	 * Delete data from given index
	 * 
	 * @param index
	 */
	public void deleteAt(int index) {
		try {
			if (index == 0)
				head = head.next;
			else {
				Node n = head;
				Node n1 = null;
				for (int i = 0; i < index; i++) {
					n = n.next;
				}
				n1 = n.next;
				n.next = n1.next;
				System.out.println("n = " + n1.data);
				n1 = null;
			}
		} catch (Exception e) {
			System.err.println("List Out of Bond ->" + e);
		}
	}

	/**
	 * Show the data from List
	 */
	public void show() {
		if (head == null) {
			System.out.println("List is empty");
		} else {

			Node node = head;
			while (node.next != null) {
				System.out.print(node.data + "->");
				node = node.next;
			}
			System.out.println(node.data);
		}
	}
}