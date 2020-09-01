import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileTest {
	public static void main(String args[]) {
		File file = new File("word.txt");				//创建文件对象
		try {											//捕捉异常
			//创建FileOutputStream对象
			FileOutputStream out = new FileOutputStream(file);
			//创建byte型数组
			byte buy[] = "我有一头小毛驴, 我从来也不骑。".getBytes();
			out.write(buy);								//将数值中的信息写入到文件中
			out.close();								//将流关闭
			
		}
		catch(Exception e) {							//catch语句处理异常信息
			e.printStackTrace();						//输出异常信息
		}
		try {
			//创建FileInputStream对象
			FileInputStream in = new FileInputStream(file);
			byte byt[] = new byte[1024];				//创建byte数组
			int len = in.read(byt);						//从文件中读取信息
			//将文件中的信息输出
			System.out.println("文件中的信息是： " + new String(byt, 0, len));
			in.close();						       		//关闭流
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
	}

}
