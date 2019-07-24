package priv.robo.searchalg;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Optional;

import org.junit.jupiter.api.Test;

public class BinarySerachTest {

	private int[] testArray = {1,2,3,4,5,6,7,8,9,10};


	@Test
	public void binarySearchTest() throws Exception{
		Arrays.sort(testArray);
		assertEquals(Optional.of(1),BinarySerach.binarySearch(testArray,2));
	}

	@Test
	public void binarySearchTestNotFound() throws Exception{
		Arrays.sort(testArray);
		assertEquals(Optional.empty(),BinarySerach.binarySearch(testArray,100));
	}

}
