package Practices;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Chuangti3 extends JFrame{
	private static final long serialVersionUID = 1L;
	public Chuangti3() {
		setVisible(true);
		setTitle("��¼����");
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setBounds(300, 200, 300, 150);
		Container cp = getContentPane();
		cp.setLayout(null);
		
		JLabel jl = new JLabel("�û���");
		jl.setBounds(10, 10, 200, 20);
		
		final JTextField name = new JTextField();
		name.setBounds(90, 10, 150, 20);
		
		JLabel jl1 = new JLabel("����");
		jl1.setBounds(10, 50, 200, 20);
		
		final JPasswordField password = new JPasswordField();
		password.setBounds(80, 50, 150, 20);
		cp.add(jl);
		cp.add(name);
		cp.add(jl1);
		cp.add(password);
		JButton jb = new JButton("ȷ��");
		jb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(name.getText().trim().length() == 0 || new String(password.getPassword()).trim().length() == 0) {
					JOptionPane.showMessageDialog(null, "�û������벻��Ϊ��");
					return;
				}
				if(name.getText().trim().equals("mr")&&new String(password.getPassword()).trim().equals("mrsoft")) {
					JOptionPane.showMessageDialog(null, "��¼�ɹ�");
				}
				else {
					JOptionPane.showMessageDialog(null, "�û������������");
				}
			}
		});
		jb.setBounds(80, 80, 60, 20);
		cp.add(jb);
		
		final JButton button = new JButton();
		button.setText("����");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				name.setText("");
				password.setText("");
			}
		});
		button.setBounds(150, 80, 60, 20);
		getContentPane().add(button);
	}
	public static void main(String args[]) {
		new Chuangti3();
		
			}
		
		
	}


