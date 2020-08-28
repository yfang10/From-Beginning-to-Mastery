package Practice;

public class DefineCase3 {
	private float height;
	private float width;
	public DefineCase3(float height, float width) {
		this.height = height;
		this.width = width;
	}
	public float square() {
		return height * width;
	}
	public static void main(String args[]) {
		DefineCase3 mm = new DefineCase3(2.5f, 3.5f);
		System.out.println(mm.square());
		
	}

}
