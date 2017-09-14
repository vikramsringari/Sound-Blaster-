//Vikram R. Sringari
//6/24/2017
//CSE373
//Assignment #1: Sound Blaster! 

// Uses Arrays for a stack implementation
import java.util.EmptyStackException;

public class ArrayStack implements DStack {

	private int current;
	private double[] array;
	 
	// Creates a ArrayStack object with size of 1.
	public ArrayStack(){
		current = 0; 
		array = new double[1];
	}
	
	// Determines if the ArrayStack object is empty
	// or if the ArrayStack object has values stored.
	// Returns a boolean true if the object is
	// empty.
    public boolean isEmpty(){
    	boolean value = false;
    	if(current == 0){
    		value = true;
    	}
    	return value;
    }

    // Puts a value in the ArrayStack object.
    // This double d value is now at the top  
    // of the stack right after this method is 
    // called.
    public void push(double d){
    	double temp_array[];
    	if(current == array.length){
    		temp_array = new double[array.length*2];
    		for(int i = 0; i < array.length; i++){
    			temp_array[i] = array[i];
    		}
    		array = temp_array;
    	}
    	array[current] = d;
    	current++;
    }

    // Takes off the top double value of the ArrayStack.
    // It returns this value which is a double.
    // Throws an EmptyStackException if the ArrayStack
    // is empty and this method is called.
    public double pop(){
    	if(current == 0){
    		throw new EmptyStackException();
    	}
    	double give = array[current];
    	array[current] = 0;
    	current--;
    	return give;
    }

    // Looks at the top double value of the ArrayStack.
    // It returns this value which is a double.
    // Throws an EmptyStackException if the ArrayStack
    // is empty and this method is called.
    public double peek(){
    	if(current == 0){
    		throw new EmptyStackException();
    	}
    	return array[current];
    }
}
