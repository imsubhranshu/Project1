package dataStructure;

public class MainClass {

	public static void main(String[] args) {
		
		//Create object of the List class. That is the LinkedList Handler
		List list = new List();
		
		//insert method inside List class to add data to the LinkedList
		//insert(data) -----> Takes one argument that is inserted into the LinkedLIst
		list.insert(5);
		list.insert(4);
		list.insert(20);
		list.insert(2);
		list.insert(12);
		list.insert(25);
		
		//Insert a Node at desired position.
		//First Argument for Index position
		//Second Argument for the data that needs to be inserted into the LInkedlist
		list.insertAt(3, 10); //Index starts at 0. 
		
		//show() method inside List class to display the elements in the Linkedlist
		//							OR
		//Used to traverse the LinkedList
		list.show();
		
	

	}

}
