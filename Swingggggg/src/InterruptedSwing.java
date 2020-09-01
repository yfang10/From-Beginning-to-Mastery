import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class InterruptedSwing extends JFrame{
	Thread thread;
	public static void main(String args[]) {
		init(new InterruptedSwing(), 100, 100);
	}
	
	public InterruptedSwing() {
		super();
		final JProgressBar progressBar = new JProgressBar();					//����������
		//�������������ڴ������λ��
		getContentPane().add(progressBar, BorderLayout.NORTH);
		progressBar.setStringPainted(true);										//���ý���������ʾ����
		thread = new Thread(new Runnable() {
			int count = 0;
			
			public void run() {
				while(true) {
					progressBar.setValue(++count);								//���ý������ĵ�ǰֵ
					try {
						thread.sleep(1000);										//ʹ�߳�����1000����
						//��׽InterruptedException�쳣
					}
					catch(InterruptedException e) {
						System.out.println("��ǰ�߳����ж�");
						break;
						
					}
				}
			}
		});
		
		thread.start();															//�����߳�
		
		thread.interrupt();														//�ж��߳�
	}
	public static void init(JFrame frame, int width, int height) {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(width, height);
		frame.setVisible(true);
	}

}