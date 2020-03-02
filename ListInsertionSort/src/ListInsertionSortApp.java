
public class ListInsertionSortApp {

	public static void main(String[] args) {
		
		int size = 10;
		
		// create array of links
		Link[] linkArray = new Link[size];
		
		for (int j = 0; j < size; j++) // fill array with links
		{ // random number
			int n = (int) (java.lang.Math.random() * 99); //picks a number ((0 <= N < 1) * 99) and converts it to an int (rounding it to a whole number)
			Link newLink = new Link(n); // make link
			linkArray[j] = newLink; // put in array
		}
		
		// display array contents
		System.out.print("Unsorted array: ");
		
		for (int j = 0; j < size; j++) 
		{
			System.out.print(linkArray[j].dData + " ");
		}
		
		System.out.println("");
		
		// create new list
		// initialized with array
		SortedList theSortedList = new SortedList(linkArray);
		
		for (int j = 0; j < size; j++) 
		{ // links from list to array
			//this for loop is using .remove to overwrite linkArray's Array with theSortedList's Link order (The Links are ordered smallest-->largest)
			linkArray[j] = theSortedList.remove();
		}
		
		// display array contents
		System.out.print("Sorted Array: ");
		
		for (int j = 0; j < size; j++) 
		{
			System.out.print(linkArray[j].dData + " ");
		}
		
		System.out.println("");
		
		
		
		
		//My Code 5.1 - Making a Priority Queue work - Priority is largest ---> smallest
		
		PriorityQueue priQue = new PriorityQueue(linkArray.length); //Length should be 10
		
		for (int i = 0; i < linkArray.length; i++) // fill array with links
		{ // random number
			priQue.qInsert(linkArray[i].dData); // put in array
		}
		
		System.out.println("Search 1: Full Que");
		priQue.queueSearchAlt(); //display the Queue
		
		priQue.qRemove(); //remove 3 items
		priQue.qRemove();
		priQue.qRemove();
		
		System.out.println("\nSearch 2: Not so full Que");
		priQue.queueSearchAlt();
	}

}
