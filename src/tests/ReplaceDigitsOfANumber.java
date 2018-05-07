package tests;

public class ReplaceDigitsOfANumber {

	public static void main(String[] args) {
		
		int a = 50006;
		
		String s = String.valueOf(a);
		
		String split[] = s.split("");
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < split.length; i++) {
			
			System.out.println(split[i]);
			
			if(Integer.parseInt(split[i] ) == 0)
			{
				split[i] =String.valueOf(1);
			}
			
				sb.append(split[i]);
			}
		
		System.out.println(sb.toString());
		
		for (int i = 0; i < split.length; i++) {
			
			System.out.print(split[i] + " ");
		}
	}

}
