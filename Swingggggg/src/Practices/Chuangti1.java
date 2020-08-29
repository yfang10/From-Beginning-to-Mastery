package Practices;

import java.awt.BorderLayout;
import java.awt.Checkbox;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class Chuangti1  extends JFrame{
	private static final long serialVersionUID = 1L;
	private JComboBox<String> comboBox;
	public static void main(String args[]) {
		new Chuangti1();
	}
	public Chuangti1() {
		super();
		setVisible(true);
		setSize(200, 150);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		comboBox = new JComboBox<>();
		comboBox.addItem("红");
		comboBox.addItem("黄");
		comboBox.addItem("蓝");
		comboBox.addItem("绿");
		getContentPane().add(comboBox, BorderLayout.NORTH);
		
		final JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		
		final JCheckBox checkbox = new JCheckBox();
		checkbox.setText("男");
		panel.add(checkbox);
		
		final JCheckBox checkbox1 = new JCheckBox();
		checkbox1.setText("女");
		panel.add(checkbox1);
		
		final JPanel panel1 = new JPanel();
		getContentPane().add(panel1, BorderLayout.SOUTH);
		
		final JButton button = new JButton();
		button.setText("确定");
		button.add(button);
		
		final JButton button1 = new JButton();
		button1.setText("取消");
		button1.add(button1);
		
	}

}
