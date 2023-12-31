import java.util.Arrays;

import acm.program.ConsoleProgram;

public class nothing2 extends ConsoleProgram {
	public void run(){
		int[] dice = {1, 3, 4, 5, 3};
		if(checkForSmallStraight(dice)){
			println("True");
		}else{
			println("False");
		}
	}
	
	private boolean checkForSmallStraight(int[] dice) {
		int[] template = { 1, 2, 3, 4, 5, 6 };
		int count = 0;
		for (int i = 0; i < dice.length; i++) {
			for (int j = 0; j < dice.length; j++) {
				if (dice[j] == template[i]) {
					count++;
					break;
				}
			}
		}
		if (count == 4) {
			return true;
		}
		return false;
	}

	private boolean checkForLargeStreet(int[] dice) {
		int[] sequence1 = { 1, 2, 3, 4, 5 };
		int[] sequence2 = { 2, 3, 4, 5, 6 };
		Arrays.sort(dice);
		if (Arrays.equals(sequence1, dice) || Arrays.equals(sequence2, dice)) {
			return true;
		}
		return false;
	}
}
