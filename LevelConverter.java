
import java.util.*;
import java.util.Scanner;

public class LevelConverter {
	public static void main(String[] args){
		int currentExp = -1;
		while(currentExp <= 0 || currentExp >= 355000){
			System.out.println("What is your current exp? ");
			Scanner scan = new Scanner(System.in);
			currentExp = scan.nextInt();
			if(currentExp <= 0 || currentExp >= 355000){
				System.out.println("Invalid exp value, please try again.");
			}
		}
		
		HashMap<Integer, Integer> levels = new HashMap();
		levels.put(0, -1);
		levels.put(1, 0);
		levels.put(2, 300);
		levels.put(3, 900);
		levels.put(4, 2700);
		levels.put(5, 6500);
		levels.put(6, 14000);
		levels.put(7, 23000);
		levels.put(8, 34000);
		levels.put(9, 48000);
		levels.put(10, 64000);
		levels.put(11, 85000);
		levels.put(12, 100000);
		levels.put(13, 120000);
		levels.put(14, 140000);
		levels.put(15, 165000);
		levels.put(16, 195000);
		levels.put(17, 225000);
		levels.put(18, 265000);
		levels.put(19, 305000);
		levels.put(20, 355000);
		levels.put(21, 999999999);
		
		int currentLevel = 0;
		while(currentLevel < 20){
			if(currentExp >= levels.get(currentLevel) && currentExp < levels.get(currentLevel+1)){
				break;
			}
			currentLevel++;
		}
		
		double checkpointsToNextLevel = 8;
		if(currentLevel <= 4){ 
			checkpointsToNextLevel = 4;
		}
		
		double levelDifference = (double) (currentExp - levels.get(currentLevel)) / (levels.get(currentLevel+1) - levels.get(currentLevel));
		double finalCheckpoints = levelDifference * checkpointsToNextLevel;
		
		System.out.println("You need " + finalCheckpoints + " checkpoints to reach level " + (currentLevel+1));
	}
}
