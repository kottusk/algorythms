package priv.robo.bublesort;

public class BubleSort {
	public  static void sort(int[] array){
		for(int i =0;i<array.length -1;i++){
			boolean changed=false;
			for(int j =0; j < array.length - i-1;j++){
			 int selected = array[j];
			 if(selected > array[j+1]){
				switchPosition(j,j+1,array);
				changed = true;
			 }
			}
			if(!changed){
				System.out.println("Break with step "  + i);
				break;
			}
		}

	}

	private static void switchPosition(final int i, final int i1, final int[] array) {
		array[i] = array[i] + array[i+1];
		array[i+1] = array[i] - array[i+1];
		array[i] = array[i] - array[i+1];
	}
}
