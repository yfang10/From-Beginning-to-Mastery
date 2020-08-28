package Number;

public class BubbleSort {
	public static void main(String args[]) {
		
		int[] array = {63, 4, 24, 1, 3, 15};
		
		BubbleSort sorter = new BubbleSort();		//创建冒泡排序类的对象
		
		sorter.sort(array);
	}
	
	//冒泡排序
	public void sort(int[] array) {
	for(int i = 1; i < array.length; i++) {
		for(int j = 0; j < array.length - i; j++) {		//最后一个数不用冒泡排序所以要减掉
			if(array[j] > array[j + 1]) {
				int temp = array[j];			//把第一个元素值保存到临时变量中
				array[j] = array[j + 1];		//把第二个元素值保存到第一个变量中
				array[j + 1] = temp;			//把临时变量（也就是第一个元素值）保存到第二个变量中
			}
		}
	}
	showArray(array);		//输出冒泡排序后的数组元素
}

public void showArray(int[] array) {
	for(int i: array) {						//遍历数组
		System.out.print(">" + i);		//输出每个数组元素值
			}
		System.out.println();
	
	}

}
