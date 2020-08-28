package Practice;

public class AddStringNumber {
	public static void main(String args[]) {
		
	String str = "abc";
	StringBuilder builder = new StringBuilder("abc");
	for(int j = 1; j <= 10; j++) {
		builder.append(j);
	}
	System.out.println(builder.toString());
	}

}
