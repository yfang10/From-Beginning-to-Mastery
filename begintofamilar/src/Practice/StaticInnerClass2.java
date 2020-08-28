package Practice;

public class StaticInnerClass2 {
	static class u{
		void f() {
			System.out.println("f()");
			
		}
	}
	public static void main(String args[]) {
		StaticInnerClass2.u u = new u();
		u.f();
	}

}
