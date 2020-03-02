package Tree234;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Tree234Test {

	@Test
	void testFindMin() {
		Tree234 t = new Tree234();
		
		t.insert(10);
		t.insert(50);
		t.insert(100);
		t.insert(90);
		t.insert(40);
		
		System.out.println(t.findMin());
		
		assertTrue(t.findMin() == 10);
	}

}
