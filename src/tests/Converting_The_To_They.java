package tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Converting_The_To_They {
	
public static void main(String[] args) {
		
	String text ="the story explains there storing and 567 the retrieving $ there  890 Request the Payload by axis Facade ";
	
	/*String f= text.replace("the ", "they ");
    System.out.println(f);
	
	
	StringBuilder sb = new StringBuilder();
    String t[] = text.split(" ");
    for (int i = 0; i < t.length; i++) {
    	
    	if(t[i].equals("the")){
    	  	t[i]= "they";
    	  	
    	}
    	sb.append(t[i]);
    	sb.append(" ");
    }
    
    System.out.println(sb);*/
	
	Pattern p = Pattern.compile("(the)(\\s)");
//	Pattern p = Pattern.compile("\\$");
	Matcher m = p.matcher(text);
//	m.find();
	System.out.println(m.find());
	System.out.println(m.group());
	String Input = m.replaceAll("they ");
	System.out.println(Input);
	
	
	/*Pattern p = Pattern.compile("(\\d{3})");
	Matcher m = p.matcher(text);
	while(m.find())
	 {
		System.out.println(m.group());
	  }
      String Input = m.replaceAll("000 ");
	System.out.println(Input);*/
	
	
}}
