package aoc.day03;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import aoc.util.InputFileReader;

public class TobogganTrajectory {

	public static void main(String[] args) throws FileNotFoundException {
		String src = "src/aoc/day03/input.txt";
		InputFileReader ipf = new InputFileReader(src);
		ArrayList<String> myListString = ipf.getList();
		int numRows = myListString.size(), numCols = myListString.get(0).length(); 
		
		//Both
		long result = (long) slope(1, 1, numRows, numCols, myListString) *
				slope(3, 1, numRows, numCols, myListString) *
				slope(5, 1, numRows, numCols, myListString) *
				slope(7, 1, numRows, numCols, myListString) *
				slope(1, 2, numRows, numCols, myListString);
		System.out.println("Part one count:" + slope(3, 1, numRows, numCols, myListString));
		System.out.println("Part two count:" + result);
	}
	
	private static int slope(int xMov, int yMov, int numRows, int numCols, ArrayList<String> myListString) {
		int count = 0, posX = xMov;
		for(int i = 0; i < numRows - yMov;  i = i + yMov) {	
			count += (myListString.get(i + yMov).charAt(posX) == '#') ? 1 : 0 ;
			posX = (posX + xMov > numCols - 1) ? posX + xMov - numCols : posX + xMov;
		}
		return count;
	}
	


}
