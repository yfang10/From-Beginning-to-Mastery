package Practices;

import java.io.FileOutputStream;
import java.io.IOException;

public class Practise2 {
	static final int lineLength = 81;
	
	public static void main(String args[]) {
		FileOutputStream fos;
		
		byte[] phone = new byte[lineLength];
		byte[] name = new byte[lineLength];
		
		try {
			fos = new FileOutputStream("word.txt");
			while(true) {
				System.out.println("������һ������");
				if("done".equalsIgnoreCase(new String(name, 0, 0, 4))) {
					System.out.println("¼�����");
					break;
				}
				System.err.println("������绰���룺 ");
				readLine(phone);
				for(int i = 0; phone[i] != 0; i++) {
					fos.write(phone[i]);
				}
				fos.write(',');
				for(int j = 0; name[j] != 0; j++) {
					fos.write(name[j]);
				}
				fos.write('\n');
				System.out.println("��Ϣ¼�����");
			}
			fos.close();
		}catch(Exception e) {
			e.printStackTrace();
						
			}
		}
		public static void readLine (byte[] name) throws IOException{
			int b = 0, i = 0;
			while((i < (lineLength - 1)) && (b = System.in.read()) != '\n') {
				name[i++] = (byte) b;
			} 
			name[i] = (byte) 0;
			
			}
			
			
	}
	


