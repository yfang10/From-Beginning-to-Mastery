import java.awt.*;
import javax.swing.*;
public class BorderLayoutPosition extends JFrame{
	
	//��������ڷ�λ�õİ�ť
	String[] border = {BorderLayout.CENTER, BorderLayout.NORTH, BorderLayout.SOUTH, BorderLayout.WEST, BorderLayout.EAST};
	String[] buttonName = {"center button", "north button", "south button", "west button", "east button"};
	public BorderLayoutPosition() {
		setTitle("�������ʹ�ñ߽粼�ֹ�����");
		Container c = getContentPane();
		setLayout(new BorderLayout());
		for(int i = 0; i < border.length; i++) {
			
			//����������Ӱ�ť, �����ð�ť����
			c.add(border[i], new JButton(buttonName[i]));
		}
		setSize(350, 200);
		setVisible(true);
		
		//���ô���رշ�ʽ
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
	public static void main(String args[]) {
		new BorderLayoutPosition();
		}
	}
	
	


