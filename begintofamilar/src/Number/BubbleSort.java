package Number;

public class BubbleSort {
	public static void main(String args[]) {
		
		int[] array = {63, 4, 24, 1, 3, 15};
		
		BubbleSort sorter = new BubbleSort();		//����ð��������Ķ���
		
		sorter.sort(array);
	}
	
	//ð������
	public void sort(int[] array) {
	for(int i = 1; i < array.length; i++) {
		for(int j = 0; j < array.length - i; j++) {		//���һ��������ð����������Ҫ����
			if(array[j] > array[j + 1]) {
				int temp = array[j];			//�ѵ�һ��Ԫ��ֵ���浽��ʱ������
				array[j] = array[j + 1];		//�ѵڶ���Ԫ��ֵ���浽��һ��������
				array[j + 1] = temp;			//����ʱ������Ҳ���ǵ�һ��Ԫ��ֵ�����浽�ڶ���������
			}
		}
	}
	showArray(array);		//���ð������������Ԫ��
}

public void showArray(int[] array) {
	for(int i: array) {						//��������
		System.out.print(">" + i);		//���ÿ������Ԫ��ֵ
			}
		System.out.println();
	
	}

}
