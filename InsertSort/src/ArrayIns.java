//Search 3.2

public class ArrayIns {
	private long[] a; // ref to array a
	private int nElems; // number of data items
	// --------------------------------------------------------------

	public ArrayIns(int max) // constructor
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
		for (int j = 0; j < nElems; j++) // for each element,
			System.out.print(a[j] + " "); // display it
		System.out.println("");
	}

	// --------------------------------------------------------------
	public void insertionSort() {
		
		int in, out;
		
		for (out = 1; out < nElems; out++) // out is dividing line
		{
			long temp = a[out]; // remove marked item
			in = out; // start shifts at out
			
			while (in > 0 && a[in - 1] >= temp) // until one is smaller,
			{
				a[in] = a[in - 1]; // shift item to right
				--in; // go left one position
			}
			a[in] = temp; // insert marked item
		} // end for
		
		
	} // end insertionSort()
	
	//3.2 code - Made this in the wrong sort program, copied it over
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
	// --------------------------------------------------------------

}
