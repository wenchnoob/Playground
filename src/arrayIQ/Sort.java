package arrayIQ;
import java.util.Arrays;

public class Sort {
	public Sort() {}
	
	public int[] bubbleSort(int[] a) {
		for(int i = 0; i < a.length - 1; i ++) {
			for(int j = 0; j < a.length - 1; j ++) {
				if(a[j] > a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		return a;
	}
	
	public int[] selectionSort(int[] a) {
		int smallest = Integer.MAX_VALUE;
		int index = 0;
		
		for(int i = 0; i < a.length; i++) {
			for(int j = i; j < a.length; j++) {
				if(a[j] < smallest) {
					smallest = a[j];
					index = j;
				}
			}
			int temp = a[i];
			a[i] = smallest;
			a[index] = temp;
			smallest = Integer.MAX_VALUE;
		}
		return a;
	}
	
	public int[] mergeSort(int[] a) {
		
		
		System.out.println(Arrays.toString(a));
		
		
		return a;
	}
	
	public int[] merge(int[]a, int[] b) {
		return a;
	}
	
	public void printArr(int[] a) {
		System.out.println(Arrays.toString(a));
	}
}
