package Number;

public class MathRandomChar {
	public static char GetRandomChar(char char1, char char2) {
		return (char)(char1 + Math.random() * (char2 - char1 + 1));
	}
	public static void main(String args[]) {
		//获取a~z之间的随机字符
		System.out.println("任意小写字符: " + GetRandomChar('a', 'z'));
		//获取A~Z之间的随机字符
		System.out.println("任意大写字符: " + GetRandomChar('A', 'Z'));
		//获取0~9之间的随机字符
		System.out.println("0到9任意数字字符: " + GetRandomChar('0', '9'));
		
	}

}
