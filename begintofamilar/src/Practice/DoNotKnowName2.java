package Practice;

public class DoNotKnowName2 {
	
	//�ڸ����д�����������
	public void doIt() {
	System.out.println("����.doIt()");
	}
	public void doAnything() {
		System.out.println("����.doAnything()");
	}
	public static void main(String args[]) {
		DoNotKnowName2 assa = new sub();
		assa.doIt();
		assa.doAnything();				
	}
}

	class sub extends DoNotKnowName2{
		public void doAnything() {				//�������и��ǵڶ�������
			System.out.println("����.doAnything");
		}
	}


