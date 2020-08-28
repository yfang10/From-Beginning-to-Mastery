package Practice;

public class Computer {
	public static int getMaxCom(int m, int n) throws MyException1{
		if(m < 0 || n < 0) {
			throw new MyException1("传递的参数不是正整数");
		}
		if(m < n) {
			int temp = 0;
			temp = m;
			m = n;
			n = temp;
		}
		int r = m % n;
		while(r != 0) {
			m = n;
			n = r;
			r = m % n;		//欧几里得算法
		}
		return n;
		}
	public static void main(String args[]) {
		try {
			int m = 120, n = 10;
			int result = getMaxCom(m, n);
			System.out.println(m+" 和  "+n+" 的最大公约数是：" +result);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}


}
