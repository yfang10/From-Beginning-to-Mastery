import java.io.File;
import java.io.FileInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class Decompressing {
	public static void main(String temp[]) {
		ZipInputStream zin;																//����ZipInputStream����
		try {																	        //try��䲶����ܷ������쳣
			zin = new ZipInputStream(new FileInputStream("hello.zip"));
			
			//ʵ��������, ָ��Ҫ���н�ѹ���ļ�
			ZipEntry entry = zin.getNextEntry();										//��ȡ��һ��ZipEntry
			while(((entry = zin.getNextEntry()) != null) && !entry.isDirectory()) {
				
				//���entry��Ϊ��, ������ͬһĿ¼��
				File file = new File("D:\\" + entry.getName());							//��ȡ�ļ�Ŀ¼
				System.out.println(file);
				if(!file.exists()) {													//������ļ�������
					file.mkdirs();														//�����ļ������ļ���
					file.createNewFile();												//�����ļ�
				}
				zin.closeEntry();														//�رյ�ǰentry
				System.out.println(entry.getName() + "��ѹ�ɹ�");
			}
			zin.close();																//�ر���
		}catch(Exception e) {
			e.printStackTrace();
				}
			}
		
	}


