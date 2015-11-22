
public class LinkedList {

	private Node head;
	
	public LinkedList() {
		head = null;
	}
	
	public LinkedList(int newv) {
		head = new Node(newv);
	}

	public void add(int newv) {
		Node tmp = new Node(newv);
		tmp.setNext(head);
		head = tmp;
	}
	
	public void add(int newv, int pos) {
		if (pos == 0) {
			add(newv);
			return;
		}
		
		Node cur = head; pos--;
		while ( pos != 0 && cur.getNext() != null ) {
			cur = cur.getNext();
			pos--;
		}
		
		Node tmp = new Node(newv);
		tmp.setNext(cur.getNext());
		cur.setNext(tmp);
	}
	
	public void delete() {
		if (head != null)
			head = head.getNext();
	}
	
	public void delete(int pos) {
		if (pos == 0)
			delete();
			
		Node cur = head; pos--;
		while ( pos != 0 && cur.getNext() != null ) {
			cur = cur.getNext();
			pos--;
		}
		
		if (cur.getNext() != null)
			cur.setNext( (cur.getNext()).getNext() );
	}
	
	public int getNth(int pos) {
		Node cur = head;
		while (pos > 0 && cur != null) {
			cur = cur.getNext();
			pos--;
		}
		
		if (cur != null) 
			return cur.getValue();
		else {
			System.out.println("Index out of bounds");
			return -1;
		}
	}
	
	public int length() {
		Node cur = head;
		int cnt = 0;
		while (cur != null) {
			cur = cur.getNext();
			cnt++;
		}
		
		return cnt;
	}
	
	public boolean isCycle() {
		if (head == null) 
			return false;
			
		Node slow = head;
		Node fast = head;
		while (fast.getNext() != null && (fast.getNext()).getNext() != null) {
			slow = slow.getNext();
			fast = (fast.getNext()).getNext();
			if (slow == fast)
				return true;
		}
		
		return false;
	}
	
	public void print() {
		Node it = head;
		while (it != null) {
			System.out.print(it.getValue() + " ");
			it = it.getNext();
		}		
		System.out.println();
	}
	
	public static void main(String[] args) {
		LinkedList a = new LinkedList();
		a.add(1);
		a.add(2);
		a.add(10,3);
		a.add(20,10);
		a.print();
		System.out.println(a.length());
		a.delete();
		a.delete(2);
		a.print();
		System.out.println(a.getNth(2));
		
		LinkedList b = new LinkedList(2);
		System.out.println(b.isCycle());
	}
	
	
	
}