import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import acm.program.ConsoleProgram;

public class Problem52 extends ConsoleProgram{
	
	public void run(){
		try{
			BufferedReader rd = new BufferedReader(new FileReader("C:/Users/maria/OneDrive/Documents/UNI/for_everybody/PracticeProject/Problem52.java"));
			
			while(true){
				String line = rd.readLine();
				if(line == null){
					break;
				}
				println(line);
			}
			rd.close();
		}catch(FileNotFoundException e){
			e.printStackTrace();
			
			println("file not found");
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
