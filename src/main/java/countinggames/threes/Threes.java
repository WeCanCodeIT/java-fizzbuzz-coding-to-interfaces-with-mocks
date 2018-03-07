package countinggames.threes;

public class Threes {

	public String clapOrSayNumber(int number) {
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
