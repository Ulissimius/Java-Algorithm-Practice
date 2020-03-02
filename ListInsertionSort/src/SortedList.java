
public class SortedList {

//Largest (Array[0]) has highest priority
//Smallest (Array[MaxN] has lowest priority
//Book's code:
//	
//		int j;
//		
//		if(nItems==0) // if no items,
//		{		
//			queArray[nItems++] = item; // insert at 0
//		}
//		else // if items,
//		{
//		for(j=nItems-1; j>=0; j--) // start at end,
//		{
//			if( item > queArray[j] ) // if new item larger,
//			{
//				queArray[j+1] = queArray[j]; // shift upward
//			}
//			else // if smaller,
//			{
//				break; // done shifting
//			}
//		} // end for
//		queArray[j+1] = item; // insert it
//		nItems++;
//		} // end else (nItems > 0)
	
	//Declarations--------------------------------------------------
	
	private Link first; // ref to first item on list
	
	//Constructors--------------------------------------------------

	public SortedList()
	{
		first = null;
	} // initialize list
	
	public SortedList(Link[] linkArr)
	{
		first = null; // initialize list
		for (int j = 0; j < linkArr.length; j++) // copy array
			insert(linkArr[j]); // to list
	}

	//Method(s)--------------------------------------------------
	
	//Insert (in order)
	//Insert builds the new Link array sorted smallest to largest (0 --> max)
	public void insert(Link k)
	{
		Link previous = null; // start at first
		Link current = first;
		
		// until end of list,
		while (current != null && k.dData > current.dData) // or key > current,
		{
			previous = current;
			current = current.next; // go to next item
		}
		
		if (previous == null) // at beginning of list
		{
			first = k; // first --> k
		}
		else // not at beginning
		{
			previous.next = k; // old prev --> k
		}
		
		k.next = current; // k --> old current
	} // end insert()

	//return & delete first link
	public Link remove()
	{ // (assumes non-empty list)
		Link temp = first; // save first
		first = first.next; // delete first
		return temp; // return value
	}
	// -------------------------------------------------------------
}
