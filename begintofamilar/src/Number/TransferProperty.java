package Number;

public class TransferProperty {
	int i = 47;
	public void call() {
		System.out.println("����call()����");
		for(int i = 0; i < 3; i++) {
			System.out.print(i + " ");
			if(i == 2) {
				System.out.println("\n");
			}
		}
	}
	public TransferProperty() {
	}
	public static void main(String args[]) {
		TransferProperty t1 = new TransferProperty();
		TransferProperty t2 = new TransferProperty();
		t2.i = 60;
		
		//ʹ�õ�һ������������Ա����
		System.out.println("��һ��ʵ��������ñ���i�Ľ���ǣ� " +t1.i++);
		t1.call();
		
		//ʹ�õڶ�������������Ա����
		System.out.println("�ڶ���ʵ��������ñ���i�Ľ���ǣ� " +t2.i);
		t2.call();
			}
		
	}


