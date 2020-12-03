package aoc.day01;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ReportRepair {

	public static void main(String[] args) throws FileNotFoundException {
		String src = "src/aoc/day01/input.txt";
		File file = new File(src);
		Scanner sc = new Scanner(file);
		final int myTarget = 2020;
		int solution;
		boolean found = false;
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		while(sc.hasNext()) {
			numbers.add(sc.nextInt());
			numbers.toString();
		}		
		sc.close();
		file.exists();
		
		for(int num1 : numbers) {
			for(int num2: numbers) {
				if(num1 == num2 || num2 == num1) continue;
				if(myTarget == num1 + num2) {
					solution = num1 * num2;
					System.out.println("\tnum1 = " + num1 +"\n\tnum2 = " + num2 + "\n\tSolution = " + solution);
					found = true;
					break;
				}
			}
			if(found) break;
		}
	}

}
