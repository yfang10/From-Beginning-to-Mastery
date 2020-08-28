package Number;

public class Tautog {
	public static void main(String args[]) {
		int arr2[][] =  {{4, 3}, {1, 2}};
		System.out.println("数组中的元素是： ");
		
		
		for(int x[]: arr2) {			//外层循环变量为一维数组
			for(int e: x) {				//循环遍历每一个数组元素
				if(e == x.length) {		//判断变量是否是二维数组中的最后一个元素
					System.out.print(e);
				}else {
					System.out.print(e + ", ");
					
				}
			}
		}
	}

}
