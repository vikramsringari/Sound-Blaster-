//Vikram R. Sringari
//6/24/2017
//CSE373
//Assignment #1: Sound Blaster! 

//ListStackNodes are for the LinkedList implementation of a Stack
public class ListStackNode {
	public double data;
	public ListStackNode next;

	// Creates a ListStackNode with a double and the next node.
	public ListStackNode(double data, ListStackNode next) {
	   this.data = data;
	   this.next = next;
	}

	// Creates a ListStackNode with a double.
	public ListStackNode(double data) {
	   this(data, null);
	}

	// Creates ListStackNode with 0 as its double.
	public ListStackNode() {
	   this(0, null);
	}
}
