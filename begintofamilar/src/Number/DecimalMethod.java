package Number;

import java.text.DecimalFormat;

public class DecimalMethod {
	public static void main(String args[]) {
		DecimalFormat myFormat = new DecimalFormat();
		myFormat.setGroupingSize(2);
		String output = myFormat.format(123456.789);
		System.out.println("��������ÿ�������ַ��� " + output);
		myFormat.setGroupingUsed(false);
		String output2 = myFormat.format(123456.789);
		System.out.println("���������ַ��� " + output2);
		
	}

}
