public class Node {
	
	private int value;
	private Node next;
	
	public Node(int value) {
		this.value = value;
		this.next = null;
	}
	
	public void setValue(int newv) {
		value = newv;
	}
	
	public int getValue() {
		return value;
	}
	
	public void setNext(Node next) {
		this.next = next;
	}
	
	public Node getNext() {
		return next;
	}

}