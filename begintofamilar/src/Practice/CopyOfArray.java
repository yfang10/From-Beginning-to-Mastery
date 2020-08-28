package Practice;

import java.util.Arrays;

public class CopyOfArray {
	public static void main(String args[]) {
		int arr1[] = new int[]{6, 4, 15, 20, 143, 80};
		int arr2[] = Arrays.copyOf(arr1, 3);
		for(int i = 0; i < arr1.length; i++) {
			System.out.printf("%d ", arr1[i]);
		}
		
		System.out.println();
		
		for(int j = 0; j < arr2.length; j++) {
			System.out.printf("%d ", arr2[j]);
		}
		
		}
		

}
