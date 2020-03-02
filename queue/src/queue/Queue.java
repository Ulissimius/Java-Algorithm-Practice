package queue;

public class Queue {
	
	private int maxSize;
	private long[] queArray;
	private int front;
	private int rear;
	private int nItems;

	// --------------------------------------------------------------
	//My Code 4.1 - Final version, cleaned up and simplified.
	public void QueueSearchAlt()
	{
		if (nItems <= 0) //Prevents endless loops if all items in the array are removed.
		{
			System.out.println("The queue is empty.");
			return;
		}
		
		for (int front = this.front, spot = 1; spot <= nItems; front++, spot++) //spot marks the position in the queue (like a line for a movie, position 1 is buying tickets while 2+ are waiting)
		{		
			System.out.println("Queue position " + spot + ": " + queArray[front]);
			
			if (front == maxSize-1) //wraps front when necessary, runs after println so the final array position is added
			{
				front = -1; // -1 because it increments to 0 after setting
			}
		}
	}
	
	
	//My Code 4.1 - Display the live elements 
	//I abandoned QueueSearch() in favour of QueueSearchAlt()
//	public void QueueSearch()
//	{
//		for (int i = 0; i < queArray.length; i++) 
//		{
//			if (front > rear) //This means the que is wrapped
//			{ 
//				if (i >= front || i <= rear) 
//				{
//					System.out.println("Queue  ");
//				}
//			}
//			else if (front < rear) //This means the que is not wrapped
//			{
//				if (i >= front && i <= rear) 
//				{
//					System.out.println("Show me the things");
//				}
//			}
//
//		}
//	}
	
	//My Code 4.1 - Thought about using copies of rear/front while doing the above method.
	//This became my main QueueSearch method.
//	public void QueueSearchAlt()
//	{
//		if (nItems <= 0) //Prevents endless loops if all items in the array are removed.
//		{
//			System.out.println("The queue is empty.");
//			return;
//		}
//		
//		//selects one of two for loops to run depending if the array is wrapped or not
////		if (front > rear) //que is wrapped
////		{
//			for (int front = this.front, spot = 1; spot <=nItems; front++, spot++) //spot marks the position in the queue (like a line for a movie, position 1 is buying tickets while 2+ are waiting)
//			{				
//				System.out.println("Queue position " + spot + ": " + queArray[front]);
//				
//				//this happens second so the final array position is added, and sets -1 because it increments to 0 right after
//				if (front == maxSize-1) //resets front & i when it reaches the end of the array
//				{
//					front = -1;
//				}
//
//			}
////		}
////		else // (front < rear) not wrapped
////		{
////			for (int i = front, spot = 1; spot <= nItems; i++, front++, spot++) 
////			{
////				System.out.println("Queue position " + spot + ": " + queArray[i]);
////			}
////		}
//
//	} // End QueueSearchAlt()
	
	// --------------------------------------------------------------
	public Queue(int s) // constructor
	{
		maxSize = s;
		queArray = new long[maxSize];
		front = 0;
		rear = -1;
		nItems = 0;
	}

	// --------------------------------------------------------------
	public void insert(long j) // put item at rear of queue
	{
		if (rear == maxSize - 1) // deal with wraparound
			rear = -1;
		queArray[++rear] = j; // increment rear and insert
		nItems++; // one more item
	}

	// --------------------------------------------------------------
	public long remove() // take item from front of queue
	{
		long temp = queArray[front++]; // get value and incr front
		if (front == maxSize) // deal with wraparound
			front = 0;
		nItems--; // one less item
		return temp;
	}

	// --------------------------------------------------------------
	public long peekFront() // peek at front of queue
	{
		return queArray[front];
	}

	// --------------------------------------------------------------
	public boolean isEmpty() // true if queue is empty
	{
		return (nItems == 0);
	}

	// --------------------------------------------------------------
	public boolean isFull() // true if queue is full
	{
		return (nItems == maxSize);
	}

	// --------------------------------------------------------------
	public int size() // number of items in queue
	{
		return nItems;
	}
	// --------------------------------------------------------------
}
