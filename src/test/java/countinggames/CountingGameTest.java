package countinggames;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import countinggames.CountingGame;

public class CountingGameTest {

	@Mock
	private Responder responder;
	
	@Mock
	private ResponseWriter responseWriter;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void shouldCountToOne() {
		// arrange
		CountingGame underTest = new CountingGame(1, responder, responseWriter);
		when(responder.say(1)).thenReturn("arbitrary response");
		
		// act
		underTest.count();
		
		// assert
		verify(responseWriter).write("arbitrary response");
	}
	
	@Test
	public void shouldCountToTwo() {
		// arrange
		CountingGame underTest = new CountingGame(2, responder, responseWriter);
		when(responder.say(1)).thenReturn("arbitrary response");
		when(responder.say(2)).thenReturn("second arbitrary response");
		
		// act
		underTest.count();
		
		// assert
		verify(responseWriter).write("arbitrary response");	
		verify(responseWriter).write("second arbitrary response");
	}
}
