package Practice;

import java.text.DecimalFormat;

public class RoundAreaPI {
	static public void SimpleFormat(String pattern, double value) {		
		
		//ʵ����DecimalFormat����
		DecimalFormat myFormat = new DecimalFormat(pattern);
		String output = myFormat.format(value);
		System.out.println(value + "" + pattern + "" + output);
	}
	public static double GetRoundArea(double r) {
		 return Math.PI * Math.pow(r, 2);
	}
	public static void main(String args[]) {
		System.out.print("Բ�����Ϊ�� ");
		SimpleFormat(" #.#####", GetRoundArea(2));
		
		
		
	}

}
