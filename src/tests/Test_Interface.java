package tests;

public class Test_Interface implements IFirst {
	
	@Override
	public void act() {
		System.out.println("In Test Class :----> I can act ");
		
	}

	@Override
	public void speak() {
		System.out.println("In Test Class :----> I can speak ");
		
	}

	public void eat() {
		System.out.println("In Test Class :----> I can eat ");
		
	}
	
	public static void main(String[] args) {
		
		Test_Interface t = new Test_Interface();
		t.act();t.eat();
		IFirst.swim();
	}

	
}
