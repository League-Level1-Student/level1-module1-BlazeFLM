package _07_duck;

public class Dog {
	int numberOfFriends = 0;
	String favoriteFood = "";

	void bark() {
		System.out.println("Bark");
	}

	void run() {
		System.out.println("Run");
	}

	Dog(String favoritefood, int numberOfFriends) {
		this.favoriteFood = favoriteFood;
		this.numberOfFriends = numberOfFriends;
	}
}
