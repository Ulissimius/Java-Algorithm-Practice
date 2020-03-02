
public class PriorityQueue {
	//My Code 5.1 - Adding some extra features, I guess.
	
	//Declarations
	private int maxSize;
	private long[] queArray;
	private int nItems;
	
	//constructor
	public PriorityQueue(int Q)
	{
	maxSize = Q;
	queArray = new long[maxSize];
	nItems = 0;
	}
	
	//Methods
	public void qInsert(long item) // insert item
	{
		int j;
		
		if (nItems == 0) // if no items,
		{
			queArray[nItems++] = item; // insert at 0
		}
		else // if items,
		{
			for (j = nItems - 1; j >= 0; j--) // start at end,
			{
				if (item > queArray[j]) // if new item larger,
					queArray[j + 1] = queArray[j]; // shift upward
				else // if smaller,
					break; // done shifting
			} // end for
			
			queArray[j + 1] = item; // insert it
			nItems++;
		} // end else (nItems > 0)
	} // end insert()
	
	//My Code 4.1 - Final version, cleaned up and simplified.
	public void queueSearchAlt()
	{		
		for (int spot = 0; spot <= nItems-1; spot++)
		{		
			System.out.println("Queue position " + spot + ": " + queArray[spot]);
		}
	}
	
	public long qRemove() // remove minimum item
	{ return queArray[--nItems]; }
	
	public long qPeekMin() // peek at minimum item
	{ return queArray[nItems-1]; }

	public boolean qIsEmpty() // true if queue is empty
	{ return (nItems==0); }

	public boolean qIsFull() // true if queue is full
	{ return (nItems == maxSize); }
}
