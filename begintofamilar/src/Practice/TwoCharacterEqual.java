package Practice;

public class TwoCharacterEqual {
	public static void main(String arsg[]) {
	Character mychar = new Character('G');
	Character mychar2 = new Character('g');
	boolean ss = mychar.equals(mychar2);
	System.out.println(ss);
	
	Character mychar3 = mychar.toLowerCase(mychar);
	Character mychar4 = mychar2.toLowerCase(mychar2);
	boolean sss = mychar3.equals(mychar4);
	System.out.println(sss);

}
}
