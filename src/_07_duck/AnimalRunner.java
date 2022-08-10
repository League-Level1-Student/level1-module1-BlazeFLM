package _07_duck;

public class AnimalRunner {
	public static void main(String[] args) {
		Duck daffy = new Duck("donuts", 5);
		daffy.quack();
		daffy.waddle();
		Dog doggo = new Dog("apples", 1);
		doggo.bark();
		doggo.run();
	}
}
