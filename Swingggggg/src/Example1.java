
import javax.swing.*;			//����Swing��
import java.awt.*;				//����AWT��
public class Example1 extends JFrame {				//����һ����̳�JFrame��
		public void CreateJFrame(String title) {	//����һ��CreateJFrame()����
			JFrame jf = new JFrame(title);			//ʵ����һ��JFrame����
			Container container = jf.getContentPane();		//��ȡһ������
			JLabel jl = new JLabel("����һ��JFrame����");		//����һ��JLabel��ǩ
			
			//ʹ��ǩ�ϵ����־���
			
			jl.setHorizontalAlignment(SwingConstants.CENTER);
			container.add(jl);			//����ǩ��ӵ�������
			container.setBackground(Color.white);		//���������ı�����ɫ
			jf.setVisible(true);						//�Ǵ������
			jf.setSize(300, 300);						//����һ�������С
			
			//���ô���رշ�ʽ
			jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		}
		
		public static void main(String args[]) {		//���������е���CreateJFrame()����
			new Example1().CreateJFrame("����һ��JFrame����");
		}

	}



