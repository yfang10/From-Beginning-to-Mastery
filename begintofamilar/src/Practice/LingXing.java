package Practice;

public class LingXing {
	public static void main(String args[]) {
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5 - i; j++) {
				System.out.print(" ");		//打印空格
			}
			for(int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");		//打印星星
			}
			
			System.out.println();
		}
		
		for(int i = 1; i <= 4; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= 9 - 2 * i; j++) {    //第5行有9个星星
				System.out.print("*");
			}
			System.out.println();
			}
		}
	}


