package Practice;

import java.math.*;

public class DifferentCal {
	public BigDecimal div(double value1, double value2, int b, int r) {
		if(b < 0) {
			System.out.println("b值必须大于等于0");
		}
		
		BigDecimal b1 = new BigDecimal(Double.toString(value1));
		BigDecimal b2 = new BigDecimal(Double.toString(value2));
		return b1.divide(b2, b, r);
		}
	public static void main(String args[]) {
		DifferentCal demo = new DifferentCal();
		System.out.println(demo.div(-7.5,  8.9, 5, BigDecimal.ROUND_UP));
		System.out.println(demo.div(-7.5,  8.9, 5, BigDecimal.ROUND_DOWN));
		System.out.println(demo.div(-7.5,  8.9, 5, BigDecimal.ROUND_CEILING));
		System.out.println(demo.div(-7.5,  8.9, 5, BigDecimal.ROUND_FLOOR));
		System.out.println(demo.div(-7.5,  8.9, 5, BigDecimal.ROUND_HALF_DOWN));
		System.out.println(demo.div(-7.5,  8.9, 5, BigDecimal.ROUND_HALF_UP));
		System.out.println(demo.div(-7.5,  8.9, 5, BigDecimal.ROUND_HALF_EVEN));
	}

}
