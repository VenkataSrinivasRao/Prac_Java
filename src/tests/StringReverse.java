package tests;


public class StringReverse {

	public static void main(String[] args) {
		
		String text = "How Are You";
		
		char charArray[] = text.toCharArray();
		for (int i = charArray.length-1; i >=0 ; i--) {
			System.out.print(charArray[i]);
		}
		
		System.out.println();
		System.out.println(text);
		
		String z[]=text.split("");
		for(int p=z.length-1;p>=0;p--){
			System.out.print(z[p]);
		}
		
	/*	System.out.println();
		StringBuilder sb = new StringBuilder();
		sb.append(text);
		sb.reverse();
		System.out.println(sb);
		
		String a[]= text.split(" ");
		
		
		for (int i = 0 ; i<a.length ; i++) {
			
			String sarray[]=a[i].split("");
			for (int j=sarray.length-1;j>=0;j--)
			{
				System.out.print(sarray[j] + "  ");
			}
			
		}
		
		System.out.println();
		for (int i = a.length-1; i>=0 ; i--) {
			
			String sarray[]=a[i].split("");
			for (int j=sarray.length-1;j>=0;j--)
			{
				System.out.print(sarray[j] + "  ");
			}
			
		}*/
		
	}

}
