package countinggames;

import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.verify;

import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class ConsoleWriterTest {

	@InjectMocks
	private ConsoleWriter underTest;

	@Mock
	private PrintStream out;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void shouldBeAResponseWriter() {
		assertThat(underTest, is(instanceOf(ResponseWriter.class)));
	}
	
	@Test
	public void shouldWriteToConsole() {

		underTest.write("arbitrary response");

		verify(out).println("arbitrary response");
	}
}
