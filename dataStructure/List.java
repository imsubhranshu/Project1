package dataStructure;

public class List {

	Node head = null; //Head node created
	
	public void insert(int data) {
		
		//create a node
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		//check if the head is empty
		if(head == null) {
			
			head = node; //if head is empty add the node created
			
		} else {
			
			Node n = head; //create a reference to traverse the list
			
			while(n.next != null) { //check if it is the last node
				
				n = n.next; //if not the last node get the node linked to it
				
			}
			
			n.next = node;	//add the created node to the last node
		}
	}
	
	public void insertAt(int index, int data) {
		
		//create a node
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		Node n = head; //create a temporary node to iterate
		
		for(int i = 0; i < index; i++) {
			
			n = n.next;  //get the node where new node needs to be inserted
			
		}
		
		//swap the position of the nodes
		Node temp = n;
		n = node;
		n.next = temp;
	}
	
	public void show() {
		
		//To show the data
		while(head != null) { //check if the node is empty
			
			System.out.println(head.data); //if the node is not empty print its data
			head = head.next; //move to the node associated to it
			
		}
	}

}
