package Number;

import java.util.Date;

public class DateAndTime {
	public static void main(String args[]) {
		Date date = new Date();
		
		String time = String.format("%tc", date);
		String form = String.format("%tF", date);
		
		System.out.println("ȫ����ʱ����Ϣ�� ��" + time);
		System.out.println("��-��-�ո�ʽ ��" + form);
		
		
	}

}
