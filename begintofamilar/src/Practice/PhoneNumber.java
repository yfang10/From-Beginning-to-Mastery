package Practice;

public class PhoneNumber {
	public static void main(String args[]) {
		String regex = "199\\d{9}";
		
		String text = "19970198767";
		if(text.matches(regex)) {
			System.out.println(text + "��һ���Ϸ����ֻ�����");
		}else {
			System.out.println(text + "����һ���Ϸ����ֻ�����");
			
			
		}
	}

}
