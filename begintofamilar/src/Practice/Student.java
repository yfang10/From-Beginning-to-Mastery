package Practice;

public class Student {
	public void speak(int m) throws MyException{
		if(m > 10000) {
			throw new MyException("����̫����");
		}
	}

}
