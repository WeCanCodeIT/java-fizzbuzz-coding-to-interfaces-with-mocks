package fizzbuzz;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void shouldSayOne() {
		Responder underTest = new FizzBuzz();

		String response = underTest.say(1);

		assertThat(response, is("1"));
	}

	@Test
	public void shouldSayTwo() {
		Responder underTest = new FizzBuzz();

		String response = underTest.say(2);

		assertThat(response, is("2"));
	}

	@Test
	public void shouldSayFizzForThree() {
		Responder underTest = new FizzBuzz();

		String response = underTest.say(3);

		assertThat(response, is("fizz"));
	}

	@Test
	public void shouldSayFizzForSix() {
		Responder underTest = new FizzBuzz();

		String response = underTest.say(6);

		assertThat(response, is("fizz"));
	}

	@Test
	public void shouldSayBuzzForFive() {
		Responder underTest = new FizzBuzz();

		String response = underTest.say(5);

		assertThat(response, is("buzz"));
	}

	@Test
	public void shouldSayBuzzForTen() {
		Responder underTest = new FizzBuzz();

		String response = underTest.say(10);

		assertThat(response, is("buzz"));
	}

	@Test
	public void shouldSayFizzBuzzForFifteen() {
		Responder underTest = new FizzBuzz();

		String response = underTest.say(15);

		assertThat(response, is("fizzbuzz"));
	}
}
