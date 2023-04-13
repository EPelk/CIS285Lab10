package lab10;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

public class testSelectionSort {
	SelectionSort sorter;
	
	@Before
	public void setup() {
		sorter = new SelectionSort();
	}
	
	@Test
	public void testPositives() {
		int input[] = {3, 7, 4, 2, 8};
		int expected[] = {2, 3, 4, 7, 8};
		assertArrayEquals(expected, sorter.basicSelectionSort(input));
	}
	
	@Test
	public void testNegatives() {
		int input[] = {-3, -6, -2, -1, -9};
		int expected[] = {-9, -6, -3, -2, -1};
		assertArrayEquals(expected, sorter.basicSelectionSort(input));
	}
	
	@Test
	public void testMixed() {
		int input[] = {3, 0, 4, -5, 8, -2};
		int expected[] = {-5, -2, 0, 3, 4, 8};
		assertArrayEquals(expected, sorter.basicSelectionSort(input));
	}
	
	@Test
	public void testDuplicatesPositive() {
		int input[] = {3, 4, 7, 2, 4, 8, 2, 8};
		int expected[] = {2, 2, 3, 4, 4, 7, 8, 8};
		assertArrayEquals(expected, sorter.basicSelectionSort(input));
	}
	
	@Test
	public void testDuplicatesNegative() {
		int input[] = {-6, -9, -3, -1, -6, -2, -1, -9};
		int expected[] = {-9, -9, -6, -6, -3, -2, -1, -1};
		assertArrayEquals(expected, sorter.basicSelectionSort(input));
	}

}
