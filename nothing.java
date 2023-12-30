import acm.program.ConsoleProgram;

public class nothing extends ConsoleProgram {
	public void run(){
		int[] dice = {5, 5, 3, 4, 3};
		if(checkForFullHouse(dice)){
			println("true");
		}else{
			println("false");
		}
	}
	
	private boolean checkForFullHouse(int[] dice) {

		for (int i = 0; i < dice.length; i++) {
			int element = dice[i];
			int count = 1;
			for (int j = 0; j < dice.length; j++) {
				if (dice[j] == element) {
					count++;
					if (count == 3) {

						int[] twos = elementRemover(dice, dice[j]);
						if (twos[0] == twos[1]) {
							return true;
						}
					}
				}
			}
		}
		
		return false;
	}
	
	private int[] elementRemover(int[] arr, int element) {
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == element) {
				count++;
			}
		}
		int n = 0;
		int[] newArray = new int[arr.length - count];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != element) {
				newArray[n] = arr[i];
				n++;
			}
		}
		return newArray;
	}
}