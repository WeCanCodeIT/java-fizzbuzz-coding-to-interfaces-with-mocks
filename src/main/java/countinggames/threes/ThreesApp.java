package countinggames.threes;

import countinggames.CountingGame;

public class ThreesApp extends CountingGame {

	public static void main(String[] args) {
		new ThreesApp(42, new Threes()).count();
	}

	public ThreesApp(int countTo, Threes threes) {
		super(countTo, number -> threes.clapOrSay(number), response -> System.out.println(response));
	}
}
