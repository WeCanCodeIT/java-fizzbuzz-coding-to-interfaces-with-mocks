package countinggames.fizzbuzz;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import countinggames.Responder;
import countinggames.fizzbuzz.FizzBuzz;

public class FizzBuzzTest {

	@Test
	public void shouldSayOne() {
		FizzBuzz underTest = new FizzBuzz();

		String response = underTest.say(1);

		assertThat(response, is("1"));
	}

	@Test
	public void shouldSayTwo() {
		FizzBuzz underTest = new FizzBuzz();

		String response = underTest.say(2);

		assertThat(response, is("2"));
	}

	@Test
	public void shouldSayFizzForThree() {
		FizzBuzz underTest = new FizzBuzz();

		String response = underTest.say(3);

		assertThat(response, is("fizz"));
	}

	@Test
	public void shouldSayFizzForSix() {
		FizzBuzz underTest = new FizzBuzz();

		String response = underTest.say(6);

		assertThat(response, is("fizz"));
	}

	@Test
	public void shouldSayBuzzForFive() {
		FizzBuzz underTest = new FizzBuzz();

		String response = underTest.say(5);

		assertThat(response, is("buzz"));
	}

	@Test
	public void shouldSayBuzzForTen() {
		FizzBuzz underTest = new FizzBuzz();

		String response = underTest.say(10);

		assertThat(response, is("buzz"));
	}

	@Test
	public void shouldSayFizzBuzzForFifteen() {
		FizzBuzz underTest = new FizzBuzz();

		String response = underTest.say(15);

		assertThat(response, is("fizzbuzz"));
	}
}
