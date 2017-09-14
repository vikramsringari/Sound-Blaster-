1.How did you test that your stack implementations were correct?
	I was able to test and demonstrate that both implmentations of Stack (ArrayStack and ListStack)
	were correct since both took the .dat files and converted them new .dat files that resembled 
	actual sound data. Taking these reversed .dat files and producing .wav files, demonstrated qualitatively 
	that the audio was totally reversed. This process worked equally for both implementations since both
	produced .dat files of equal size. 
2.The file secret.wav is a backwards recording of a word or short phrase. Use sox (or another converter) and your program to reverse it, and write that as the answer to this question.
	The scent of bitter almonds always reminded him of the fate of unrequited love.
3.Your array stacks start with a small array and double in size if they become full. For a .dat file with 1 million lines, how many times would this resizing occur? What about with 1 billion lines or 1 trillion lines (assuming the computer had enough memory)? Explain your answer.
	Assuming each line is fills each new index it would take 20 times of resizing for a .dat file with
	1 million lines since 2^20 ~ 1 million. The number of resizes for a .dat file with 1 billion lines is 
	30 times of resizing since 2^30 ~ 1 billion. The number of resizes for a .dat file with 1 trillion 
	lines is 30 times of resizing since 2^40 ~ 1 trillion. This is because my array starts out with a size
	of 1 and each resize is *2 of this size so  resizing is a function of 2^n where n=0 initially.  
4.Suppose that, instead of a DStack interface, you were given a fully-functional FIFO Queue class. How might you implement this project (i.e., simulate a Stack) with one or more instances of a FIFO Queue? 
  Write pseudocode for your push and pop operations. Refer to the Written-Homework Guidelines for instructions on writing pseudocode. Assume your Queue class provides the operations enqueue, dequeue, isEmpty, and size.
	Original Queque is declared in the constructor
	function pop
		Create: Temporary Queque
		Declare: final value 
		for every index i to i less than size-1
			Set: Temporary Queque equal to Original Queque that is dequequed once
		(This is to get all values expect the final value of the original queque into the temporary queque)
		Set: final value equal to the Original Queque that is dequequed once
		(This is to  get the the final value of the Original Queque)
		Set: Original Queque equal to Temporary Queque
		(This is to have all values except for the popped value in the original queque)
		Return: final value
	
	function push
		Original Queque is enquequed once
			
5.In the previous question, what trade-offs did you notice between a Queue implementation of a Stack and your original array-based implementation? Which implementation would you choose, and why?
	In The ArrayStack, which used arrays, the arrays that were resized to accomodate more values were often 
	not filled and so the creation of larger arrays produces an unessasary waste of a bit of extra data structure storage.
	The Queque implementation on the other hand did not have this problem since Queques automatically a data structure 
	storage. The trade-off with the Queque implementation is the fact that production of new ListNodes (since Queques use them)
	is more expensive of storage system for any bit of data than an indicie in an array. Ultimately, since in the real world there
	is a lot of data being stored, it is important that data structure is not too expensive. Since Queques are better at incrementally
	adding data (into a new connected data structure storage unit) as apposed to arrays that effectively double in size, the Queque 
	implementation is better. This is because with large amounts of data, the doubling the size of the array may too costly and 
	wasteful.
6. Include a description of how your project goes "above and beyond" the basic requirements (if it does).
	It does not go above and beyond.
7. How many hours did this assignment take to complete?
	3 hours ( with commenting and README.txt file )
8.What did you enjoy about this assignment? What did you not enjoy? What could you have done better?
	I like the concepts used for this assignment since it deals with signal processing which i am interested in. I did not enjoy the
	fact that I my .wav files couldn't be properly read initially for no reason. Teaching students how to fix this problem could
	have been done better.
9.What else, if anything, would you would like to include related to this homework?
	Include more information from EE 235 and EE 341 since those classes deal with 
	continuous linear system to discrete systems which is exactly what this homework deals with.