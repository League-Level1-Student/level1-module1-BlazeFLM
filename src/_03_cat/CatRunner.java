package _03_cat;

public class CatRunner {
	public static void main(String[] args) {
		Cat cat = new Cat("Kitty");
		cat.meow();
		cat.printName();
		for(int i = 9; i > 0; i--) {
		cat.kill();
		}
	}
}
