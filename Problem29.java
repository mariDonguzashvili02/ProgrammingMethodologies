import acm.program.ConsoleProgram;

//29. მოხმარებელს შეყავს მთელი რიცხვი n, პროგრამამ უნდა დაბეჭდოს ფიბონაჩის მიმდევრობის
//მე n წევრი.
public class Problem29 extends ConsoleProgram {
	public void run() {
		
			int n = readInt("Please, enter Fibonacci numbers bound: ");

			int fib = fibonacci(n);
			println(fib);
		

	}

	private int fibonacci(int n) {
		if (n == 0 || n == 1) {
			return n;
		}

		int f = -1;
		int f1 = 1;
		int f2 = 0;

		while (n >= 2) {
			f = f1 + f2;
			f2 = f1;
			f1 = f;
			n--;
		}

		return f;
	}
}
