package tests;

public class Singleton {

	
	private static Singleton obj = null ;
	  private Singleton () {
		  System.out.println("Object Created");
	  }; //private constructor
	  public static Singleton getInstance() {
	    if (null == obj) {
	      obj = new Singleton();
	    }
	    return obj;
	  }
	
	public static void main(String[] args) {
		
		
		Singleton s = Singleton.getInstance();
		 Singleton.getInstance();
		 Singleton.getInstance();
	}

}
