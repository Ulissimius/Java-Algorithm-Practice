
//Search 2.1, 2.2, or 2.6
public class HighArray {

	private long[] a; // ref to array a
	private int nElems; // number of data items
	private int max = 0;

	// -----------------------------------------------------------

	public HighArray(int max) // constructor
	{
		a = new long[max]; // create the array
		nElems = 0; // no items yet
	}
	// -----------------------------------------------------------

	public boolean find(long searchKey) { // find specified value
		int j;

		for (j = 0; j < nElems; j++) // for each element,
			if (a[j] == searchKey) // found item?
				break; // exit loop before end
		
		if (j == nElems) // gone to end?
			return false; // yes, can’t find it
		else
			return true; // no, found it
		
	} // end find()
		// -----------------------------------------------------------

	public void insert(long value) // put element into array
	{
		//Mathew's code - 2.6 - Added a for loop to the insert method, now it blocks duplicates upon insertion.
		for (int i = 0; i < a.length; i++) {
			if (a[i] == value && a[i] != 0) {
				System.out.println("Sorry! No duplicates! " + a[i] + "(2) was not added.");
				break;
			}
			else if (i == a.length-1) {
				a[nElems] = value; // insert it
				nElems++; // increment size
			}
		}
	}
	
	// -----------------------------------------------------------

	public boolean delete(long value) {
		
		int j;
		
		for (j = 0; j < nElems; j++) // look for it
			if (value == a[j])
				break;
		if (j == nElems) // can’t find it
			return false;
		else // found it
		{
			for (int k = j; k < nElems; k++) // move higher ones down
				a[k] = a[k + 1];
			nElems--; // decrement size
			System.out.println(value + " Deleted!");
			return true;
		}
	} // end delete()
	
		// -----------------------------------------------------------

	public void display() // displays array contents
	{
		for (int j = 0; j < nElems; j++) // for each element,
			System.out.print(a[j] + " "); // display it
		System.out.println("");
	}
	
	// Mathew's Code - 2.1 - The for finds the largest key.
	public void getMax() // finds the highest key
	{	
		max = 0;
		
		for (int i = 0; i < nElems; i++) {
			if (a[i] > max) {
				max = (int) a[i];
			}
		}
		
		//if max never changes, it equals -1
		if (max == 0) {
			max = -1;
		}
		
		System.out.println("Highest Key: " + max);
		delete(max); //2.2 - This deletes the highest key
	}
	// -----------------------------------------------------------
} // end class HighArray
	////////////////////////////////////////////////////////////////
