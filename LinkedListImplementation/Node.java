package DataStructures;

public class Node {
	
	
	int data;
	Node next;
	
	public Node(int data)
	{
		this.data=data;
		next=null;
	}
	
	public static void main(String[] args) {
		
		Node n1=new Node(2);
		Node n2=new Node(3);
		Node n3=new Node(7);
		
		n1.next=n2;
		n2.next=n3;
		
		System.out.println(n1.data);
		System.out.println(n1.next.data);
		System.out.println(n2.data);
		System.out.println(n2.next.data);
		
		
		
		
	}

}
