package countinggames.threes;

import countinggames.Responder;

public class Threes implements Responder {

	@Override
	public String say(int number) {
		if(isAMultipleOfThree(number) || endsInThree(number)) {
			return "clap";
		}
		return "" + number;
	}

	private boolean isAMultipleOfThree(int number) {
		return number % 3 == 0;
	}
	
	private boolean endsInThree(int number) {
		return number % 10 == 3;
	}

}
