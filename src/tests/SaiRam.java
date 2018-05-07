package tests;

import java.io.File;
import java.util.regex.Pattern;


public class SaiRam {

	public static void main(String[] args) {

		/*System.out.println("Sai Ram ");
		System.out.println("Hello ");
		*/
		String mobile = "iphone5";
		
		String content = "This is Chaitanya " +
			    "from Beginnersbook.com.";

		      String pattern = ".*book.*";

		      boolean isMatch = Pattern.matches(pattern, content);
		      System.out.println("The text contains 'book'? " + isMatch);
		      
		
	}

}
