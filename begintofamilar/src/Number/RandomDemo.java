package Number;

import java.util.Random;

public class RandomDemo {
	public static void main(String args[]) {
		Random r = new Random();
		
		//�������һ������
		System.out.println("�������һ�������� " + r.nextInt());
		
		//�������һ�����ڵ���0С��10������
		System.out.println("�������һ������0С��10�������� " + r.nextInt(10));
		
		//�������һ������ֵ
		System.out.println("�������һ������ֵ�� " + r.nextBoolean());
				
		//�������һ��˫���ȵ�ֵ
		System.out.println("�������һ��˫���ȵ�ֵ�� " + r.nextDouble());
	
		//�������һ�������͵�ֵ
		System.out.println("�������һ�������͵�ֵ�� " + r.nextFloat());
				
		//�������һ�������ܶ�Ϊ��˹�ֲ���˫���ȵ�ֵ
		System.out.println("�������һ�������ܶ�Ϊ��˹�ֲ���˫���ȵ�ֵ�� " + r.nextGaussian());
	}

}
