package Number;

public class MathRandomChar {
	public static char GetRandomChar(char char1, char char2) {
		return (char)(char1 + Math.random() * (char2 - char1 + 1));
	}
	public static void main(String args[]) {
		//��ȡa~z֮�������ַ�
		System.out.println("����Сд�ַ�: " + GetRandomChar('a', 'z'));
		//��ȡA~Z֮�������ַ�
		System.out.println("�����д�ַ�: " + GetRandomChar('A', 'Z'));
		//��ȡ0~9֮�������ַ�
		System.out.println("0��9���������ַ�: " + GetRandomChar('0', '9'));
		
	}

}
