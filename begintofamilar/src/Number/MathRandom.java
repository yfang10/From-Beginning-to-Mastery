package Number;

public class MathRandom {
	public static int GetEvenNum(double num1, double num2) {
		//产生num1~num2之间的随机数
		int s = (int)num1 + (int)(Math.random() * (num2 - num1));
		if(s % 2 == 0 ) {
			return s;
		}
		else {
			//如果是奇数
			return s + 1;
			
		}
		
	}
	public static void main(String args[]) {
		//调用产生随机数方法
		System.out.println("任意一个2~32之间的偶数： " + GetEvenNum(2, 32));
	}
		
	}


