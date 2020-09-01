import java.awt.*;
import javax.swing.*;
public class BorderLayoutPosition extends JFrame{
	
	//定义组件摆放位置的按钮
	String[] border = {BorderLayout.CENTER, BorderLayout.NORTH, BorderLayout.SOUTH, BorderLayout.WEST, BorderLayout.EAST};
	String[] buttonName = {"center button", "north button", "south button", "west button", "east button"};
	public BorderLayoutPosition() {
		setTitle("这个窗体使用边界布局管理器");
		Container c = getContentPane();
		setLayout(new BorderLayout());
		for(int i = 0; i < border.length; i++) {
			
			//在容器中添加按钮, 并设置按钮布局
			c.add(border[i], new JButton(buttonName[i]));
		}
		setSize(350, 200);
		setVisible(true);
		
		//设置窗体关闭方式
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
	public static void main(String args[]) {
		new BorderLayoutPosition();
		}
	}
	
	


