import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

public class JTextAreaTest  extends JFrame{
	public JTextAreaTest() {
		setSize(300, 300);
		setTitle("�����Զ����е��ı���");
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Container cp = getContentPane();
		JTextArea jt = new JTextArea("�ı���", 6, 6);
		jt.setLineWrap(true); 				//�����Զ�����
		cp.add(jt);
		setVisible(true);
	}
	
	public static void main(String args[]) {
		new JTextAreaTest();
	}

}
