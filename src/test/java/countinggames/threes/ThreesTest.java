package countinggames.threes;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import countinggames.Responder;

/**
 * In our Threes game, participants will clap (represented by a "clap" response)
 * rather than saying the number if the number is a multiple of three or ends in
 * three.
 */
public class ThreesTest {

	@Test
	public void shouldSayOne() {
		Threes underTest = new Threes();

		String response = underTest.clapOrSay(1);

		assertThat(response, is("1"));
	}

	@Test
	public void shouldSayTwo() {
		Threes underTest = new Threes();

		String response = underTest.clapOrSay(2);

		assertThat(response, is("2"));
	}

	@Test
	public void shouldClapForThree() {
		Threes underTest = new Threes();

		String response = underTest.clapOrSay(3);

		assertThat(response, is("clap"));
	}

	@Test
	public void shouldClapForSix() {
		Threes underTest = new Threes();

		String response = underTest.clapOrSay(6);

		assertThat(response, is("clap"));
	}

	@Test
	public void shouldClapForThirteen() {
		Threes underTest = new Threes();

		String response = underTest.clapOrSay(13);

		assertThat(response, is("clap"));
	}
	
	@Test
	public void shouldClapForTwentyThree() {
		Threes underTest = new Threes();

		String response = underTest.clapOrSay(23);

		assertThat(response, is("clap"));	}
}
