package Number;

import java.util.Arrays;

public class Example {
	public static void main(String args[]) {
		int ia[] = new int[] {1, 8, 9, 4, 5};
		Arrays.sort(ia);			//�ȶ����������ڽ��в���
		
		int index = Arrays.binarySearch(ia, 4);
		System.out.println("4������λ���ǣ� " +index);
	}
	}


