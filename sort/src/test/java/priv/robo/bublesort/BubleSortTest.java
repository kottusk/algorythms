package priv.robo.bublesort;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

public class BubleSortTest {

	@Test
	public void testSortTableWithoutDuplicates(){
		int[] array ={7,2,3,9,1,0};
		int[] sortedArray = {7,2,3,9,1,0};
		Arrays.sort(sortedArray);
		System.out.println(Arrays.toString(array));
		BubleSort.sort(array);
		System.out.println(Arrays.toString(array));
		assertArrayEquals(sortedArray,array);
	}

	@Test
	public void testSortTableSorted(){
		int[] array ={10,13,11,14,15};
		int[] sortedArray = {10,11,13,14,15};
		Arrays.sort(sortedArray);
		System.out.println(Arrays.toString(array));
		BubleSort.sort(array);
		System.out.println(Arrays.toString(array));
		assertArrayEquals(sortedArray,array);
	}

}
