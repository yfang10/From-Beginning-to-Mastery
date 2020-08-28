package Practice;

import java.text.DecimalFormat;

public class RoundAreaPI {
	static public void SimpleFormat(String pattern, double value) {		
		
		//实例化DecimalFormat对象
		DecimalFormat myFormat = new DecimalFormat(pattern);
		String output = myFormat.format(value);
		System.out.println(value + "" + pattern + "" + output);
	}
	public static double GetRoundArea(double r) {
		 return Math.PI * Math.pow(r, 2);
	}
	public static void main(String args[]) {
		System.out.print("圆的面积为： ");
		SimpleFormat(" #.#####", GetRoundArea(2));
		
		
		
	}

}
