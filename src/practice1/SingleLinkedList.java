package practice1;

public class SingleLinkedList {
public static void main(String[] args) {
	Node head = null;

	Node newNode = new Node(1);

	// Set the head to the new node
	head = newNode;

	// Create another node with data 2
	newNode = new Node(2);

	// Update the next reference of the previous node to the new node
	head.next = newNode;
	
	// Start from the head node
	Node currentNode = head;
	
	newNode.next=new Node(4);
	//currentNode
	
	Node cur1=currentNode;
	cur1.next=currentNode;

	// Traverse the list
	while (currentNode != null) {
	    // Access the data of the current node
	    int data = currentNode.data;
	    System.out.println("data >> "+data);
	    // Move to the next node
	    currentNode = currentNode.next;
	}
}
}
