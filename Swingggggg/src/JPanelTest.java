import java.awt.*;
import javax.swing.*;

public class JPanelTest extends JFrame{
	public JPanelTest() {
		Container c = getContentPane();
		
		//����������������Ϊ2��1�е����񲼾�
		
		c.setLayout(new GridLayout(2, 1, 10, 10));
		
		//��ʼ��һ�����, ����1��3�е����񲼾�
		
		JPanel p1 = new JPanel(new GridLayout(1, 3, 10, 10));
		JPanel p2 = new JPanel(new GridLayout(1, 2, 10, 10));
		JPanel p3 = new JPanel(new GridLayout(1, 2, 10, 10));
		JPanel p4 = new JPanel(new GridLayout(2, 1, 10, 10));
		JPanel p5 = new JPanel(new GridLayout(2, 1, 10, 10));
		JPanel p6 = new JPanel(new GridLayout(2, 1, 10, 10));
		JPanel p7 = new JPanel(new GridLayout(2, 1, 10, 10));
		JPanel p8 = new JPanel(new GridLayout(2, 1, 10, 10));
		JPanel p9 = new JPanel(new GridLayout(2, 1, 10, 10));
		
		
		p1.add(new Button("1"));		//���������Ӱ�ť
		p2.add(new Button("2"));
		p3.add(new Button("3"));
		p4.add(new Button("4"));
		p5.add(new Button("5"));
		p6.add(new Button("6"));
		p7.add(new Button("7"));
		p8.add(new Button("8"));
		p9.add(new Button("9"));
		
		c.add(p1);
		c.add(p2);
		c.add(p3);
		c.add(p4);
		c.add(p5);
		c.add(p6);
		c.add(p7);
		c.add(p8);
		c.add(p9);
	}
	
	public static void main(String args[]) {
		new JPanelTest();
		
		
	}
	

}
