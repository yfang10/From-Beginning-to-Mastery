import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class FlowLayoutPosition extends JFrame{
	public FlowLayoutPosition() {
		setTitle("������ʹ�������ֹ�����");			//���ô������
		Container c = getContentPane();
		
		//���ô���ʹ�������ֹ�����, ʹ����Ҷ���, �����������֮���ˮƽ����ʹ�ֱ���
		setLayout(new FlowLayout(0, 2, 1));
		for(int i = 0; i < 10; i++) {			//��������ѭ�����10����ť
			c.add(new JButton("button" + i));
		}
		setSize(300, 200);		//���ô����С
		setVisible(true);		//���ô���ɼ�
		
		//���ô���رշ�ʽ
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
	public static void main(String args[]) {
		new FlowLayoutPosition();
	}

}
