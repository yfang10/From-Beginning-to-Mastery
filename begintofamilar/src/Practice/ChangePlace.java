package Practice;

public class ChangePlace {
	public static void main(String args[]) {
		int arr[][] = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		System.out.println("ԭ�����飺 ");
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		System.out.println("���л�����");
		for(int j = 0; j < arr.length; j++) {
			for(int i = 0; i < arr.length; i++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}

}
