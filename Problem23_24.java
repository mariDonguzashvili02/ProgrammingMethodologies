import acm.program.ConsoleProgram;

//23. მომხმარებელს შეყავს მთელი რიცხვი n, პროგრამამ უნდა დაბეჭდოს 1 დან n მდე რიცხვების
//ჯამი
//24. მომხმარებელს შეყავს მთელი რიცხვი n, პროგრამამ უნდა დაბეჭდოს n ის გამყოფების
//რაოდენობა
public class Problem23_24 extends ConsoleProgram{
	public void run(){
		int n = readInt("Enter n: ");
		int sum = calculateSum(n);
		println("Sum is :" + sum);
	}

	private int calculateSum(int num) {
		int sum = 0;
		for(int i = 1; i <= num;  i++){
			sum += i;
		}
		return sum;
	}
}
