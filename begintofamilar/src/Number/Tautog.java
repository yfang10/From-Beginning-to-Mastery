package Number;

public class Tautog {
	public static void main(String args[]) {
		int arr2[][] =  {{4, 3}, {1, 2}};
		System.out.println("�����е�Ԫ���ǣ� ");
		
		
		for(int x[]: arr2) {			//���ѭ������Ϊһά����
			for(int e: x) {				//ѭ������ÿһ������Ԫ��
				if(e == x.length) {		//�жϱ����Ƿ��Ƕ�ά�����е����һ��Ԫ��
					System.out.print(e);
				}else {
					System.out.print(e + ", ");
					
				}
			}
		}
	}

}
