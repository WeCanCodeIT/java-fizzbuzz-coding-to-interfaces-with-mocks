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
		Responder underTest = new Threes();
		
		String response = underTest.say(1);
		
		assertThat(response, is("1"));
	}
	
	@Test
	public void shouldSayTwo() {
		Responder underTest = new Threes();
		
		String response = underTest.say(2);
		
		assertThat(response, is("2"));
	}
	
	@Test
	public void shouldClapForThree() {
		Responder underTest = new Threes();
		
		String response = underTest.say(3);
		
		assertThat(response, is("clap"));
	}
	
	@Test
	public void shouldClapForSix() {
		Responder underTest = new Threes();
		
		String response = underTest.say(6);
		
		assertThat(response, is("clap"));
	}
}
