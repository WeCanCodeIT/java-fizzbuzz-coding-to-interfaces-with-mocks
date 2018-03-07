package countinggames;

import java.io.PrintStream;

public class ConsoleWriter implements ResponseWriter {

	private PrintStream out = System.out;
	
	@Override
	public void write(String response) {
		out.println(response);
	}
}