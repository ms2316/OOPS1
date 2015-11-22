public class Stack {
	
	private Node head;
	private int size;
	
	public Stack() {
		head = null;
		size = 0;
	}
	
	public Stack(int newv) {
		head = new Node(newv);
		size = 1;
	}
	
	public void push(int newv) {
		Node tmp = new Node(newv);
		tmp.setNext(head);
		head = tmp;
		size++;
	}
	
	public int pop() {
		if (head == null) {
			System.out.println("Stack is empty already");
			return -1;
		}
		int tmp = head.getValue();
		head = head.getNext();
		size--;
		return tmp;
	}
	
	public int getSize() {
		return size;
	}
	
	public static void main(String[] args) {
		Stack s = new Stack(0);
		s.push(1);
		s.push(2);
		s.push(3);
	
		while ( s.getSize() > 0 )
			System.out.print(s.pop() + " ");
		System.out.println();
	}
}
