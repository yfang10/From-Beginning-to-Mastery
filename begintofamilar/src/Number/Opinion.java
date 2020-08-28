package Number;

public class Opinion {
	public static void main(String args[]) {
		String s1 = new String("abc");
		String s2 = new String("ABC");
		String s3 = new String("abc");
		
		boolean b = s1.equals(s2);
		
		boolean b2 = s2.equalsIgnoreCase(s3);
		
		System.out.println(s1 + " equals " + s2 + " :" + b);
		
		System.out.println(s2 + " equalsIgnoreCase " + s3 + " :" + b2);
		
	}

}
