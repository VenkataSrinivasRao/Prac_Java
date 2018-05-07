package tests;

public interface IFirst {

    void act();
	void speak();
	default void eat(){
		
		System.out.println("I can Eat");
		
	}

	static void swim(){
		
		System.out.println("I can Swim");
	}
}
