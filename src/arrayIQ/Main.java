package arrayIQ;

public class Main {

	public static void main(String[] args) {
		Sort sorter = new Sort();
		
		int[] arr1 = {5, 12, 15, 16, 17, 1, 0, 2, 3,  6, 7, 8, 9, 10};
		int[] arr2 = sorter.bubbleSort(arr1);
		sorter.printArr(arr2);
		
		
		
		int[] arr3 = {5, 12, 15, 16, 17, 1, 0, 2, 3,  6, 7, 8, 9, 10};
		int[] arr4 = sorter.selectionSort(arr3);
		sorter.printArr(arr4);
		
		int[] arr5 = {5, 12, 15, 16, 17, 1, 0, 2, 3,  6, 7, 8, 9, 10};
		int[] arr6 = sorter.mergeSort(arr5);
		sorter.printArr(arr6);
		
	}

}
