package fizzbuzz;

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
		for(int current = 1; current <= countTo; current++) {
			String response = responder.say(current);
			responseWriter.write(response);
		}
	}

}
