package countinggames.fizzbuzz;

import countinggames.CountingGame;

public class FizzBuzzApp extends CountingGame {

	public static void main(String[] args) {
		new FizzBuzzApp(100, new FizzBuzz()).count();
	}

	public FizzBuzzApp(int countTo, FizzBuzz fizzBuzz) {
		super(countTo, number -> fizzBuzz.say(number), response -> System.out.println(response));
	}
}
