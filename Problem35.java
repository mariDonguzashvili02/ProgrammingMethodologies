import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

//35. თქვენი ამოცანაა გააკეთოთ მონეტის აგდების სიმულაციები და დათვალოთ საშუალოდ
//რამდენჯერ უნდა ავაგდოთ მონეტა რათა ამოვიდეს ბორჯღალო
public class Problem35 extends ConsoleProgram {
	private static final int NUM_EXPERIMENTS = 10000;
	private RandomGenerator rgen = RandomGenerator.getInstance();

	public void run() {
		double sumOfFlips = 0;
		for (int i = 0; i < NUM_EXPERIMENTS; i++) {
			int currNumFlips = holdExperiment();
			sumOfFlips += currNumFlips;
		}
		double avgFlips = sumOfFlips / NUM_EXPERIMENTS; 
		println("Avg number of flips is : " + avgFlips);
	}
	private int holdExperiment(){
		int numFlips = 0;
		while(true){
			numFlips += 1;
			boolean isHeads = rgen.nextBoolean(0.1);
			if (isHeads){
				break;
			}
		}
		return numFlips;
	}

}
