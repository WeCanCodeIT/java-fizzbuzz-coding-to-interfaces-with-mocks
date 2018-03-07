package countinggames.fizzbuzz;

public class FizzBuzz {

	public String say(int number) {
		if(isFizz(number) && isBuzz(number)) {
			return "fizzbuzz";
		}
		if(isFizz(number)) {
			return "fizz";
		}
		if(isBuzz(number)) {
			return "buzz";
		}
		return "" + number;
	}

	public boolean isFizz(int number) {
		return number % 3 == 0;
	}

	public boolean isBuzz(int number) {
		return number % 5 == 0;
	}

}