package Number;

import java.util.Arrays;

public class Rakel {
	public static void main(String args[]) {
		
		String str[] = new String[] {"ab", "cd", "ef", "yz"};
		Arrays.sort(str);
		
		int index = Arrays.binarySearch(str, 0, 2, "cd");		//��ָ���ķ�Χ������Ԫ��"cd"������λ��
		System.out.println("cd������λ���ǣ� " + index);

	}

}
