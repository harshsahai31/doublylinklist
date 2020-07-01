package Mainn;

public class Doublulinklist {
	private int size;
	private Node head; //holds first node of dll
	private Node tail; //holds last node of dll

	private static class Node{
		private int data;
		private Node next;
		private Node previous;

		public Node(int data){
			this.data=data;
		}
	}  public boolean isempty(){
		if(head==null){
			return true;
		} else{
			return false;
		}
	}  public int getSize(){
		return size;
	} public void printelements() {
		Node temp = head;
		if (isempty()) {
			return;
		}
			while (temp != null) {
				System.out.println(temp.data);
				temp = temp.next;
			}
		System.out.println("null");

	} public void printelementbackward(){
		if(tail==null){
			return;
		} Node temp = tail;
		while(temp!=null){
			System.out.println(temp.data);
			temp = temp.previous;
		}
		System.out.println("null");
	} public void insertatfirst(int data){
		Node n1 = new Node(data);
		if(isempty()){
			tail=n1;
		} else {
			head.previous = n1;
		}
			n1.next=head;
			head=n1;
			size++;
		} public void inerstatlast(int data){
		Node n1 =  new Node(data);
		if(isempty()){
			head =n1;

		} else {
			tail.next = n1;
		} n1.previous=tail;
		n1=tail;


	} public void deleteatfirst(int data){
		 if(isempty()){
			 System.out.println("list is empty");
		 } if(head==tail){

		 	tail=null;
		} else{
		 	Node temp =head;
		 	head.next.previous=null;
		 	head=head.next;
		 	temp.next=null;}


	}public void deleteatlast(int data){
		if(isempty()){
			System.out.println("list is empty");
		} if(head==tail){
			head=null;
		} else{
			Node temp =tail;
			tail.previous.next=null;
			tail=tail.previous;
			temp.previous=null;
		}
	}


	public static void main(String[] args) {
		Doublulinklist dll = new Doublulinklist();
		dll.insertatfirst(2);
		dll.inerstatlast(6);
		dll.insertatfirst(1);
		dll.insertatfirst(3 );
		dll.deleteatfirst(1);
		dll.printelements();




	}
}
