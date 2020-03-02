package queue;

public class QueApp {

	public static void main(String[] args) {
		
		//This run tests my method with a non-wrapping queue
		
		Queue theQueue = new Queue(15); // queue holds 5 items
		
		System.out.println("----------The que is not wrapped this run----------\n\n");
		
		theQueue.insert(10); // 10 is now in the front
		theQueue.insert(20);
		theQueue.insert(30);
		theQueue.insert(40);
		theQueue.insert(99);
		theQueue.insert(155);
		theQueue.insert(43);
		theQueue.insert(81);
		theQueue.insert(76);
		theQueue.insert(101);
		
		theQueue.remove(); // remove 3 items
		theQueue.remove(); // (10, 20, 30)
		theQueue.remove(); // 40 is now in the front
		
		theQueue.insert(50);
		theQueue.insert(60); 
		theQueue.insert(70);
		theQueue.insert(80); // 80 is now in the rear
		
		//40 should show up as position 1, and 80 should be in the last position.
		theQueue.QueueSearchAlt();
		
		System.out.println("");
		
		while (!theQueue.isEmpty()) // remove and display
		{ // all items
			long n = theQueue.remove();
			System.out.print(n);
			System.out.print(" ");
		}
		System.out.print("- Have been removed.");
		System.out.println("\nThe Queue has been emptied, all numbers above are no longer in the que. \nThe above numbers remain in the array (This caused my first test-run to run forever when putting the method QueSearchAlt in after the isEmpty while).");
		System.out.println("");
		
		theQueue.QueueSearchAlt();
		
		//-----End of No Wrap Queue----- 
		
		
		
		
		
		//-----Start of Wrapping Queue-----
		
		//this run tests my method with a wrapping que
		Queue theQueue2 = new Queue(9); // queue holds 5 items
		
		System.out.println("\n\n----------The queue is wrapped this run----------\n\n");
		
		theQueue2.insert(10); // 10 is now in the front
		theQueue2.insert(20);
		theQueue2.insert(30);
		theQueue2.insert(40);
		theQueue2.insert(99);
		theQueue2.insert(155);
		//front = Array[0]
		//rear = Array[5]
		
		theQueue2.remove(); // remove 2 items
		theQueue2.remove(); // (10, 20)
		//front = Array[2] 
		
		theQueue2.insert(50); // 30 is now in the front
		theQueue2.insert(60); 
		theQueue2.insert(70);
		theQueue2.insert(91); // 91 is now in the rear
		//rear = Array[0]
		
		//30 should show up as position 1, and 91 should be in the last position.
		theQueue2.QueueSearchAlt();
		
		System.out.println("");
		
		while (!theQueue2.isEmpty()) // remove and display
		{ // all items
			long n = theQueue2.remove();
			System.out.print(n);
			System.out.print(" ");
		}
		System.out.print("- Have been removed.");
		System.out.println("\nThe Queue has been emptied, all numbers above are no longer in the que. \nThe above numbers remain in the array.");
		System.out.println("");
		
		theQueue2.QueueSearchAlt();
	}
}
