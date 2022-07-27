package _05_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
	public static void main(String[] args) {
		String flavor = JOptionPane.showInputDialog("What flavor popcorn do you want?");
		String time = JOptionPane.showInputDialog("How long in minutes do you want it cooked?");
		int timeInt = Integer.parseInt(time);
		Popcorn popcorn = new Popcorn(flavor);
		Microwave mcwave = new Microwave();
		mcwave.putInMicrowave(popcorn);
		mcwave.setTime(timeInt);
		mcwave.startMicrowave();
	}
}
