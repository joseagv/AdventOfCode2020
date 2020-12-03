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
		int solution, solution2, num3;
		boolean found = false;
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		while(sc.hasNext()) {
			numbers.add(sc.nextInt());
		}		
		sc.close();
		file.exists();
		
		//Part One
		for(int num1 : numbers) {
			for(int num2: numbers) {
				if(num1 == num2) continue;
				if(myTarget == num1 + num2) {
					solution = num1 * num2;
					System.out.println("Part 1:\n\tnum1 = " + num1 +"\n\tnum2 = " + num2 + "\n\tSolution = " + solution);
					found = true;
					break;
				}
			}
			if(found) break;
		}
		found = false;
		
		//Part Two
		for(int num1 : numbers) {
			for(int num2: numbers) {
				if(num1 == num2) continue;
				num3 = myTarget - num1 - num2;
				if(num3 == num1 || num3 == num2) continue;
				if(numbers.contains(num3)) {
					solution2 = num1 * num2 * num3;
					System.out.println("\nPart 2:\n\tnum1 = " + num1 +"\n\tnum2 = " + num2 + "\n\tnum3 = " + num3 + "\n\tSolution = " + solution2);
					found = true;
					break;
				}
			}
			if(found) break;
		}
	}

}
