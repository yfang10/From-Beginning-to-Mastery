package Practice;

public class LingXing {
	public static void main(String args[]) {
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5 - i; j++) {
				System.out.print(" ");		//��ӡ�ո�
			}
			for(int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");		//��ӡ����
			}
			
			System.out.println();
		}
		
		for(int i = 1; i <= 4; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= 9 - 2 * i; j++) {    //��5����9������
				System.out.print("*");
			}
			System.out.println();
			}
		}
	}


