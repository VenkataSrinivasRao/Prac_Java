package tests;

public class BubbleSort {

	public static void main(String[] args) {
		
		
		int l[] = {7,2,4,1,3,5,9,6,8};
		
		System.out.println(l.length);
		int temp = 0,count= 0;
		for(int i= 0; i<l.length;i++){
			for (int j = 1; j < l.length-i; j++) {
				if(l[j-1]>l[j]){
					temp = l[j-1];
					l[j-1]=l[j];
					l[j]=temp;
			/*		count++;
					System.out.println("count"+count);*/
				}
			}
		}
		
		for (int i = 0; i < l.length; i++) {
			System.out.print(l[i] + "  ");
		}
					
				
				

				
				
				
		
		
	}

}
