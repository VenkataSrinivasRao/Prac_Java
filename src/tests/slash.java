package tests;

//import org.apache.xerces.dom.PSVIDOMImplementationImpl;

public class slash {
 public static void main(String a[]){
	 System.out.println("a"+"\ts"+"a");
	 
	 String s = "0464904137-COP-LAPTOP COMPUTER";
		String arr[] = s.split("-");
		System.out.println(arr.length);
		for(int i=0; i<arr.length;i++){
			System.out.println(arr[i]);
			System.out.println(arr[i].length());
		}
 }
}
