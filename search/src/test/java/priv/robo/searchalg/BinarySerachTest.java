package priv.robo.searchalg;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Optional;

import org.junit.jupiter.api.Test;

public class BinarySerachTest {

	@Test
	public void binarySearchTest() throws Exception{
		int[] array = {1,2,3,4,5,6,7,8,9};
		Arrays.sort(array);
		assertEquals(Optional.of(1),BinarySerach.binarySearch(array,2));
	}
}
