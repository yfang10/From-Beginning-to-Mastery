import java.awt.Container;

import javax.swing.*;


public class JScrollPaneTest extends JFrame{
	public JScrollPaneTest() {
		Container c = getContentPane();				//��������
		JTextArea ta = new JTextArea(20, 50);		//�����ı��������
		JScrollPane sp = new JScrollPane(ta);		//����JScrollPane������
		c.add(sp);									//���������ӵ���������
		setTitle("�������������ֱ�����");
		setSize(200, 200);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new JScrollPaneTest();
	}

}

                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      