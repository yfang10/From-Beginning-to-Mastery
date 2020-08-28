package Number;

public class Division {
	public static void main(String args[]) {
		String str = new String("abc, def, ghi, gkl");
		
		//使用split()方法对字符进行拆分，返回字符串数组
		
		String[] newstr = str.split(",");
		
		for(int i = 0; i < newstr.length; i++) {
			System.out.println(newstr[i]);
		}
		System.out.println();
		//对字符串进行拆分，并限定拆分次数，返回字符数组
		
		String[] newstr2 = str.split(",", 2);
		
		for(int j = 0; j < newstr2.length; j++) {
			System.out.println(newstr2[j]);
			
		}
	}

}
