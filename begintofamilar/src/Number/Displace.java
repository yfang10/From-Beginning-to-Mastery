package Number;

import java.util.Arrays;

public class Displace {
	public static void main(String args[]) {
		int arr[] = new int[] {45, 12, 2, 10};
		Arrays.fill(arr, 1, 2, 8);		//ʹ��fill()������������г�ʼ��
		for(int i = 0; i < arr.length; i++) {
			System.out.println("��" + i + "��Ԫ���ǣ� " + arr[i]);
		}
	}

}
