package Number;

public class StartOrEnd {
	public static void main(String args[]) {
		String num1 = "22045612";
		String num2 = "213-4578";
		boolean b = num1.startsWith("22");
		boolean b2 = num1.endsWith("78");
		boolean b3 = num2.startsWith("22");
		boolean b4 = num2.endsWith("78");
		
		System.out.println("�ַ���num1����'22'��ʼ����" + b);
		System.out.println("�ַ���num1����'78'��������" + b2);
		System.out.println("�ַ���num2����'22'��ʼ����" + b3);
		System.out.println("�ַ���num2����'78'��������" + b4);
	}

}
