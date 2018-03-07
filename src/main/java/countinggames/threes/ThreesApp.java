package countinggames.threes;

import countinggames.CountingGame;

public class ThreesApp extends CountingGame {

	public static void main(String[] args) {
		new ThreesApp(42).count();
	}

	public ThreesApp(int countTo) {
		super(countTo, new Threes()::clapOrSayNumber, System.out::println);
	}
}
