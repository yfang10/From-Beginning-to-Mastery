package Practice;

import java.util.*;

public class GetTheSixEvenNumber {
	public static int GetEvenNum(double num1, double num2) {
		int s = (int)num1 + (int)(Math.random() * (num2 - num1));
		if(s % 2 == 0) {			//�ж�������Ƿ�Ϊż��
			return s;
		}else {
			return s + 1;
		}
	}
	public static void main(String args[]) {
		int sum = 0;
		int arr[] = new int[6];
		for(int i = 0; i < 6; i++) {
			new GetTheSixEvenNumber();		//���ʼ��
			arr[i] = GetTheSixEvenNumber.GetEvenNum(2, 32);
			sum = sum + arr[i];
			System.out.println("��" + (i + 1) +"��ż��Ϊ: " + arr[i]);
		}
		System.out.println("�ܺ�Ϊ�� " + sum);
	}
}

