package Practice;

public class UserCase1 {
	enum Constants2{						//������������ö��������
		Constants_A, Constants_B}
	
	//ʹ�ýӿڶ��峣��
	
	public static void doit2(Constants2 c) {			//����һ������������ö�����͵ķ���
		switch(c) {										//����ö�����Ͷ�������ͬ����
		case Constants_A:
		System.out.println("doit2() Constants_A");
		break;
		
		case Constants_B:
			System.out.println("doit2() Constants_B");
			break;
		
		}
	
	}
	
	public static void main(String args[]) {
		UserCase1.doit2(Constants2.Constants_A);
		UserCase1.doit2(Constants2.Constants_B);
	}

}
