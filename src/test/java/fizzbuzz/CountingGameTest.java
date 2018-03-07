package fizzbuzz;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

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
}
