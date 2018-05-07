package tests;

public class Test_Strings {

	public static void main(String[] args) {
		
		String text ="The story explains storing and retrieving Request Payload by axis Facade ";
		
		String array[]= text.split("a");
		for (String sText : array) {
			
			System.out.print("  "+sText+"  ");
			System.out.println(sText.length());
		}
			
		System.out.println(System.getProperty("user.dir"));
	}

}
