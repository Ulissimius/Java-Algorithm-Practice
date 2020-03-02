package heap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

class HeapTest {

	@Test
	void testHeap() {
		
		Heap theHeap = new Heap(31);
		theHeap.insert(70);
		theHeap.insert(40);
		theHeap.insert(50);

		
		assertEquals(40, theHeap.remove().getKey());

		assertEquals(50, theHeap.remove().getKey());

		assertEquals(70, theHeap.remove().getKey());

//		fail("Not yet implemented");
	}

}
