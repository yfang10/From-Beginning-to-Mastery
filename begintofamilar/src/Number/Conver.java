package Number;

public class Conver {
	public static void main(String args[]) {
		
		byte mybyte = 127;
		int myint = 150;
		float myfloat = 452.12f;
		char mychar = 10;
		double mydouble = 45.46546;

		System.out.println("byte����float�����ݽ���������Ϊ�� " + (mybyte + myfloat));
		System.out.println("byte����int�����ݽ���������Ϊ�� " + mybyte * myint);
		System.out.println("byte����char�����ݽ���������Ϊ�� " + mybyte / mychar);
		System.out.println("double����char�����ݽ���������Ϊ�� " +(mydouble + mychar));
		
	}

}
