package Number;

public class AccessProperty {
	static int i = 47;
	public void call() {
		System.out.println("����call()����");
		for(i = 0; i < 3; i++) {
			System.out.print(i + " ");
			if(i == 2) {
				System.out.println("\n");
				
			}
		}
		
	}
	public AccessProperty() {
	}
	public static void main(String args[]) {
		AccessProperty t1 = new AccessProperty();
		AccessProperty t2 = new AccessProperty();
		t2.i = 60;
		
		//ʹ�õ�һ������������Ա����
		
		System.out.println("��һ��ʵ��������ñ���i�Ľ���ǣ� " + t1.i++);
		t1.call();
		
		
		//ʹ�õڶ�������������Ա����
		
		System.out.println("�ڶ���ʵ��������ñ���i�Ľ���� " + t2.i);
		t2.call();   
	}

}
