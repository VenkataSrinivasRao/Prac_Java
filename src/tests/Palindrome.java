package tests;

public class Palindrome {

	public static void main(String[] args) {
		
//		String a = "liril";
		String a = "srinivas";
		boolean flag = false;
		int i;
		
		for ( i = 0; i <= a.length()/2; i++) {
			flag = false;
//			if((String.valueOf((a.charAt(i))).equals(String.valueOf(a.charAt((a.length()-1)-i) ))){
			
			if((a.charAt(i))== a.charAt((a.length()-1)-i)){
				System.out.println(a.charAt(i) + " == "+a.charAt((a.length()-1)-i) );
				flag = true;
				}
			else if(!flag){
				System.out.print("not a palindrome, breaked at --> ");
				System.out.println(a.charAt(i) + " == "+a.charAt((a.length()-1)-i) );
				break;

			}
		
		}
		
		String text = "liril";
		System.out.println(text.length());
		
		String reverse = "";
		
		for (int j = text.length()-1; j >=0 ; j--) {
			
			reverse = reverse + text.charAt(j);
			System.out.println(reverse);
			
		}
		
		if(reverse.equals(text))
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");
		
		
		String text2 = "liril";
		String rv="";
		System.out.println(text.length());
		char[] rev = text2.toCharArray();
		
		for (int j = rev.length-1; j >=0; j--) {
			
			rv = rv + rev[j];
		}
		System.out.println(rv);
	}

}
