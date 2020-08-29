package Practices;

import java.io.FileInputStream;

import javax.swing.ProgressMonitorInputStream;

public class Student {
	public static void main(String args[]) {
		byte b[] = new byte[2];
		try {
			FileInputStream file = new FileInputStream("word.txt");
			ProgressMonitorInputStream in = new ProgressMonitorInputStream(null, "¶ÁÈ¡ÎÄ¼þ", file);
			while(in.read(b) != -1) {
				String s = new String(b);
				System.out.println(s);
				Thread.sleep(100);
			}
		}
			catch(Exception e) {
				e.printStackTrace();
			}
		
	}
}

