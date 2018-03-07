package fizzbuzz;

public class CountingGame {

	private ResponseWriter responseWriter;

	public CountingGame(int countTo, Responder responder, ResponseWriter responseWriter) {
		this.responseWriter = responseWriter;
	}

	public void count() {
		responseWriter.write("arbitrary response");
	}

}
