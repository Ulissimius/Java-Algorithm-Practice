
//search: 3.1, 3.2, 3.3, 3.4, 3.5, 3.6
public class ArrayBub {
	
	private long[] a; // ref to array a
	private int nElems; // number of data items
	
	// --------------------------------------------------------------

	public ArrayBub(int max) // constructor
	{
		a = new long[max]; // create the array
		nElems = 0; // no items yet
	}
	
	// --------------------------------------------------------------
	
	public void insert(long value) // put element into array
	{
		a[nElems] = value; // insert it
		nElems++; // increment size
	}
	
	// --------------------------------------------------------------
	
	public void display() // displays array contents
	{
	for(int j=0; j<nElems; j++) // for each element,
	System.out.print(a[j] + " "); // display it
	System.out.println("");
	}
	
	// --------------------------------------------------------------
	
	//Old code
	/*public void bubbleSort() {
		int out, in;
		for (out = nElems - 1; out > 1; out--) // outer loop (backward)
			for (in = 0; in < out; in++) // inner loop (forward)
				if (a[in] > a[in + 1]) // out of order?
					swap(in, in + 1); // swap them
	}*/
	
	//3.1 code
	public void biBubbleSort() 
	{
		int in;
		int out2 = 0;
		
		//Controlling for loop - controls the run time
		for (int out = nElems - 1; out2 < (nElems-1); out2++) 
		{
			//Right-->Left
			for (in = 0; in < out; in++) // inner loop (forward)
			{
				if (a[in] > a[in + 1]) // out of order?
				{
					System.out.println("Left-->Right: " + a[in] + " swaped with " + a[in+1]);
					swap(in, in + 1); // swap them
				}
			}
			//-----Switch-----
			//Left-->Right
			for (in = nElems-1; in > 0; in--) 
			{
				if (a[in] < a[in - 1]) 
				{
					System.out.println("Right-->Left: " + a[in] + " swaped with " + a[in-1]);
					swap(in, in - 1);
				}
			}
		}
	}
	
	//Original Code - I shortened this up to the code above after taking a second look - It had a lot of unnecessary code
	/*public void biBubbleSort() 
	{
		int in;
		int in2 = 0;
		int out = nElems - 1;
		int out2 = 0;
		boolean onOff = true; //Switches between functions from Left-->Right to Right-->Left
		
		while (out > 1 && out2 < (nElems - 1)) //Over-arching while loop controls the run-time of the split method
		{
			if (onOff == true) //If onOff is True, Left-->Right. If onOff is false, Right-->Left.
			{
				for (in = 0; in < out; in++) // inner loop (forward)
				{
					if (a[in] > a[in + 1]) // out of order?
					{
						System.out.println("Left-->Right: " + a[in] + " swaped with " + a[in+1]);
						swap(in, in + 1); // swap them
					}
				}
				onOff = false; //Switching over to Right-->Left
				out--;
			}
			else //---------------Split Point--------------
			{
				for (in2 = nElems - 1; in2 > 1; in2--) 
				{
					if (a[in2] < a[in2 - 1]) 
					{
						System.out.println("Right-->Left: " + a[in2] + " swaped with " + a[in2-1]);
						swap(in2, in2 - 1);
					}
				}
				onOff = true; //Switching over to Left-->Right
				out2++;
			}

		}

	}*/
	
	// --------------------------------------------------------------

	private void swap(int one, int two) {
		long temp = a[one];
		a[one] = a[two];
		a[two] = temp;
	}
	
	// --------------------------------------------------------------
	
	//3.2 code
	public void median()
	{
		double median;
		
		if (nElems % 2 == 0) //even
		{
			median = (nElems-1)/2;
			median = (a[(int) Math.round(median)] + a[((int) Math.round(median)) + 1]) / 2f;
			
			System.out.println("The even median is: " + median);
		}
		else //odd
		{
			median = (nElems-1)/2;
			//median = (Math.ceil(median) + Math.floor(median) / 2);
			median = a[(int) (Math.round(median))];
			
			System.out.println("The odd median is: " + median);
		}
	}
}
