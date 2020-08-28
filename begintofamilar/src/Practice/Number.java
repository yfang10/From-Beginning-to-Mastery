package Practice;

public class Number {
	public static int count(int x, int y) {
		return x * y;
	}
	public static void main(String args[]) {
		try {
			int result = count(12345, 233475687);
			System.out.println(result);
		}catch(Exception e) {
			e.printStackTrace();
			
		}
	}

}
