import java.util.ArrayList;
import java.util.List;

public class Gather {
	public static void main(String args[]) {
		List<String> list = new ArrayList<>();		//�������϶���
		list.add("a");								//�򼯺����Ԫ��
		list.add("b");
		list.add("c");
		int i = (int) (Math.random() * (list.size() - 1));		//���0~2֮��������
		System.out.println("�����ȡ�����е�Ԫ�أ� " + list.get(i));
		list.remove(2);								//��ָ������λ�õ�Ԫ�شӼ������Ƴ�
		System.out.println("��������'2'��Ԫ�ش������Ƴ���, �����е�Ԫ���ǣ� " );
		for(int j = 0; j < list.size(); j++) {		//ѭ����������
			System.out.println(list.get(j));
		}
	}

}
