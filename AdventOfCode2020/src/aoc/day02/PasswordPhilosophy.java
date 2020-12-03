package aoc.day02;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import aoc.util.*;

public class PasswordPhilosophy {

	public static void main(String[] args) throws FileNotFoundException {
		String src = "src/aoc/day02/input.txt";
		InputFileReader ipf = new InputFileReader(src);
		ArrayList<String> myListString = ipf.getList();
		int count = 0, count2 = 0;
		
		for(String line : myListString) {
			String [] eachOne = line.split(" ");
			String[] minMax = eachOne[0].split("-");
			
			int min = Integer.parseInt(minMax[0]);
			int max = Integer.parseInt(minMax[1]);
			char charac = eachOne[1].replace(":", "").charAt(0);
			
			PassWord pw = new PassWord(min, max, charac , eachOne[2]);
			count += (pw.isCorrect()) ? 1 : 0;//Part one
			count2 += (pw.xOr()) ? 1 : 0;//Part two
			
		}		
		
		System.out.println("Count of correct passwords part one: " + count);
		System.out.println("Count of correct passwords part two: " + count2);
	}
}
