package Practices;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Chuangti2 extends JFrame{
	private static final long serialVersionUID = 1L;
	private String[] content = {"�б�1", "�б�2", "�б�3", "�б�4", "�б�5"};
	private JComboBox<String> jc = new JComboBox<>();
	private JButton jb = new JButton("�ύ");
	
	int count = 0;
	public Chuangti2() {
		setSize(200, 100);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		cp.add(jc);
		cp.add(jb);
		jb.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0) {
			if(count < content.length) {
				jc.addItem(content[count++]);
			}
		}
	});
	
}
public static void main(String args[]) {
	new Chuangti2();
			}
		
	}

