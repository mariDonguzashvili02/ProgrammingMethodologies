import acm.program.ConsoleProgram;

//48. კონსოლიდან შეგყვავს ტექსტი პროგრამამ უნდა დაბეჭდოს სტატისტიკა რომელი სიმბოლო
//რამდენჯერ გვხვდება

public class Problem48 extends ConsoleProgram {
	public void run() {
		String str = readLine("Write text: ");
		symbolStatistics(str);
	}

	private void symbolStatistics(String text) {

		for (int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			if (isFirstOcurrence(text, i)) {
				println("Symbol " + c + " occurs " + symbolCounter(text, c) + " times");
			}
		}
	}

	private int symbolCounter(String text, char c) {
		int count = 0;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == c) {
				count++;
			}
		}
		return count;
	}

	private boolean isFirstOcurrence(String text, int index) {
		char c = text.charAt(index);
		int firstIndex = text.indexOf(c);
		if(firstIndex == c){
			return true;
		}
		return false;
	}
}