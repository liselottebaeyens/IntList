/**
 * 
 */
package integerslist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 */
class IntListTest {
	
	IntList myIntList = new IntList();

	@Test
	void TestConstructor() {
		assertArrayEquals(
				new int[] {},
				myIntList.getElementen()
		);
		assertEquals(0,myIntList.getLengte());
	}
	
	@Test 
	void testAdd() {
		myIntList.add(10);
		assertArrayEquals(
				new int[] {10},
				myIntList.getElementen()
		);
		assertEquals(1,myIntList.getLengte());
		assertEquals(10,myIntList.getElement(0));
		
		myIntList.add(20);
		assertArrayEquals(
				new int[] {10,20},
				myIntList.getElementen()
		);
		assertEquals(2,myIntList.getLengte());
		assertEquals(10,myIntList.getElement(0));
		assertEquals(20,myIntList.getElement(1));
	}
		@Test 
		void testRemoveLast() {
			myIntList.add(10);
			myIntList.add(20);
			myIntList.removeLast();
			assertArrayEquals(
					new int[] {10},
					myIntList.getElementen()
			);
			assertEquals(1,myIntList.getLengte());
			assertEquals(10,myIntList.getElement(0));
			
		}
		
		@Test
		void testRepresentationExposure() {
			myIntList.add(10);
			int[] elementen = myIntList.getElementen();
			elementen[0]=100;
			assertEquals(10,myIntList.getElement(0));
			
		}

}
