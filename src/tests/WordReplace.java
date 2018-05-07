package tests;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordReplace {

	public static void main(String[] args) {
		
		
/*	  String REGEX = "a*b";
	  String INPUT = "aabfooaabfooabfoob";
	  String REPLACE = "-";

	  Pattern p = Pattern.compile(REGEX);
	  
	  System.out.println(Pattern.matches(REGEX, INPUT));
	  
		      
	 // get a matcher object
	  Matcher m = p.matcher(INPUT);
	  StringBuffer sb = new StringBuffer();
	      while(m.find()) {
//	    	  System.out.println(m.group());
	         m.appendReplacement(sb, REPLACE);
	      }
//	      m.appendTail(sb);
	      System.out.println(sb.toString()); //	-foo-foo-foo- -foo-foo-foo-
		*/

		      
		      
		String s = "There’s no $6666 66 time like the $55555 present $1000. We also enjoy Good Times $20, Snack Time, Bed Time, and of course, Free Time.";
		
		String  tex ="QA07B019";
//		String regex = "\\d+";
		String regex = "\\d{3}";
//		String regex = "\\d{2,5}";
//		String regex = "\\$";

		
		Pattern p = Pattern.compile(regex);
		
//		Matcher m = p.matcher(tex);
		Matcher m = p.matcher(s);
		String s1="";
		
		while(m.find()){
		
//		System.out.println("find"+m.find());
		System.out.println(m.group());
//		System.out.println("matches"+m.matches());
//		s1 = m.replaceAll("SSSS");		
		}
		
		System.out.println(s);
//		System.out.println(s1);
		
		 String str="sdfvsdf68fsdfsf8999fsdf09";
		   String numberOnly= str.replaceAll("[^0-9]", "");
		   String alphabhetOnly= str.replaceAll("[0-8]", "");
		   
		   System.out.println("numberOnly : "+ numberOnly);
		   System.out.println("alphabhetOnly : "+ alphabhetOnly);
		
	}

}
