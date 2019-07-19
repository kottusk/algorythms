package priv.robo.searchalg;

import java.util.Objects;
import java.util.Optional;

public class BinarySerach {

	public static Optional<Integer> binarySearch(int[] array, int wanted){
		if(Objects.isNull(array) || array.length == 0){
			return Optional.empty();
		}
		int startPosition =0;
		int endPosition = array.length - 1;
		int centrePosition;
		while(startPosition < endPosition){
			centrePosition = (endPosition - startPosition)/2;
			int candidate = array[centrePosition];
			if(candidate == wanted){
				return  Optional.of(centrePosition);
			}
			if(candidate <= wanted){
				startPosition = centrePosition;
			}else{
				endPosition = centrePosition;
			}
		}
		return Optional.empty();
	}
}
