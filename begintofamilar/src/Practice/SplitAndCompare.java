package Practice;

public class SplitAndCompare {
	public static void main(String args[]) {
		String str1 = "adababcadEFAGSG123";
		String str2 = "abcaddcdeEFAGSR123";
		
		String newstr = str1.substring(4, 15);
		String newstr2 = str2.substring(4, 15);
		if(newstr.equalsIgnoreCase(newstr2)) {
			System.out.println("�����ַ�����ͬ");
		}else {
			System.out.println("�����ַ�������ͬ");
		}
		
	}

}
