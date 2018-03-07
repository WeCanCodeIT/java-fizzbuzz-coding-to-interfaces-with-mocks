package countinggames;

import static java.util.stream.IntStream.rangeClosed;

public class CountingGame {

	private int countTo;
	private Responder responder;
	private ResponseWriter responseWriter;

	public CountingGame(int countTo, Responder responder, ResponseWriter responseWriter) {
		if(countTo < 1) {
			throw new IllegalArgumentException();
		}
		this.countTo = countTo;
		this.responder = responder;
		this.responseWriter = responseWriter;
	}

	public void count() {
		rangeClosed(1, countTo).mapToObj(responder::say).forEach(responseWriter::write);
	}

}
