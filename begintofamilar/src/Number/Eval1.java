package Number;

import java.util.Date;

public class Eval1 {
	public static void main(String args[]) {
		Date date = new Date();			//����Date����date
		
		String year = String .format("%tY", date);
		String month = String .format("%tB", date);
		String day = String .format("%td", date);
		
		System.out.println("�����ǣ� " + year + "��");
		System.out.println("�����ǣ� " + month);
		System.out.println("�����ǣ� " + day + "��");
	}

}
