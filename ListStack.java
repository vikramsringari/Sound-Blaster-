//Vikram R. Sringari
//6/24/2017
//CSE373
//Assignment #1: Sound Blaster! 

//Uses LinkedList for a stack implementation

import java.util.EmptyStackException;

public class ListStack implements DStack {

	private ListStackNode front;
	
	// Creates a ListStack object.
	public ListStack() {
		front = null;
	}	

	// Determines if the ListStack object is empty
	// or if the ListStack object has values.
	// Returns a boolean for true if the object is
	// empty.
    public boolean isEmpty(){
    	boolean value = false;
    	if(front == null){
    		value = true;
    	}
    	return value;
    }

    // Puts a value in the ListStack object.
    // This double d value is now at the top  
    // of the stack right after this method is 
    // called.
    public void push(double d){
    	if(front == null){
    		front = new ListStackNode(d);
    	}else{
    		ListStackNode top = new ListStackNode(d, front);
			front = top;
    	}
    }

    // Takes of the top double value of the ListStack.
    // It returns this value which is a double.
    // Throws an EmptyStackException if the stack
    // is empty.
    public double pop(){
    	if(front == null){
    		throw new EmptyStackException();
    	}
    	double give = front.data;
    	front = front.next;
    	return give;
    }

    // Looks at the top double value of the ListStack.
    // It returns this value which is a double.
    // Throws an EmptyStackException if the ListStack
    // is empty.
    public double peek(){
    	if(front == null){
    		throw new EmptyStackException();
    	}
    	return front.data;
    }

}
