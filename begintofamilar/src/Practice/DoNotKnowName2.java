package Practice;

public class DoNotKnowName2 {
	
	//在父类中创建两个方法
	public void doIt() {
	System.out.println("父类.doIt()");
	}
	public void doAnything() {
		System.out.println("父类.doAnything()");
	}
	public static void main(String args[]) {
		DoNotKnowName2 assa = new sub();
		assa.doIt();
		assa.doAnything();				
	}
}

	class sub extends DoNotKnowName2{
		public void doAnything() {				//在子类中覆盖第二个方法
			System.out.println("子类.doAnything");
		}
	}


