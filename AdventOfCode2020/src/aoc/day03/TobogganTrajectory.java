package aoc.day03;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import aoc.util.InputFileReader;

public class TobogganTrajectory {

	public static void main(String[] args) throws FileNotFoundException {
		String src = "src/aoc/day03/input.txt";
		InputFileReader ipf = new InputFileReader(src);
		ArrayList<String> myListString = ipf.getList();
		int posX = 3, numRows = myListString.size(), numCols = myListString.get(0).length(), count = 0; 
		
		//Part one
		for(int i = 0; i < numRows - 1; i++ ) {	
			count += (myListString.get(i + 1).charAt(posX) == '#') ? 1 : 0 ;
			posX = (posX + 3 > numCols - 1) ? posX + 3 - numCols : posX + 3;
		}
		System.out.println("Part one count:" + count);
		
		//Part two
		int result = slope(1, 1, numRows, numCols, myListString) *
				slope(3, 1, numRows, numCols, myListString) *
				slope(5, 1, numRows, numCols, myListString) *
				slope(7, 1, numRows, numCols, myListString) *
				slope(1, 2, numRows, numCols, myListString);
		System.out.println("Part two count:" + result);
	}
	
	private static int slope(int posX, int posY, int numRows, int numCols, ArrayList<String> myListString) {
		int count = 0;
		for(int i = posY; i < numRows - 1; i = i + posY) {	
			count += (myListString.get(i + 1).charAt(posX) == '#') ? 1 : 0 ;
			posX = (posX + 3 > numCols - 1) ? posX + 3 - numCols : posX + 3;
		}
		return count;
	}

}