import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Example_01 {
	public static void main(String args[]) {
		try {
			//创建FileOutputStream对象
			FileOutputStream fs = new FileOutputStream("word.txt");
			//创建DataOutputStream对象
			DataOutputStream ds = new DataOutputStream(fs);
			ds.writeUTF("使用writeUTF()方法写入数据;");							//写入磁盘文件数据
			ds.writeChars("使用writeChars()方法写入数据;");
			ds.writeBytes("使用writeBytes()方法写入数据");
			ds.close();														//将流关闭
			
			
			//创建FileInputStream对象
			FileInputStream fis = new FileInputStream("word.txt");
			
			//创建DataInputStream对象
			DataInputStream dis = new DataInputStream(fis);
			System.out.print(dis.readUTF());								//将文件数据输出
		}
		catch(Exception e) {
			e.printStackTrace();											//输出异常信息
		}
	}

}
