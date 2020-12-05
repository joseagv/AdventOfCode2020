package aoc.day05;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;

import aoc.util.InputFileReader;

public class BinaryBoarding {

	public static void main(String[] args) throws FileNotFoundException {
		String src = "src/aoc/day05/input.txt";
		InputFileReader ipf = new InputFileReader(src);
		ArrayList<String> myListString = ipf.getList();
		ArrayList<Integer> listID = new ArrayList<Integer>();
		String col, row;
		int numCol = 0, numRow = 0, newID, maxID = 0;
		
		//Part one 
		for(String line : myListString) {
			row = line.substring(0, 7);
			col = line.substring(7,10);
			row = row.replace("F", "0").replace("B", "1");
			col = col.replace("L", "0").replace("R", "1");
			numRow = Integer.parseInt(row, 2);
			numCol = Integer.parseInt(col, 2);
			newID = numRow * 8 + numCol;
			maxID = (maxID < newID) ? newID : maxID;
			listID.add(newID);
			numCol = 0; numRow = 0;
		}
		
		//Part two
		listID.sort(Comparator.naturalOrder());
		int myID = 0;
		for(int i = 0; i < listID.size(); i++) {
			if(i + 1 < listID.size()) {
				if((listID.get(i + 1) - listID.get(i)) == 2)
					myID = listID.get(i + 1) - 1;
			}
		}
		
		System.out.println("Part one max ID: " + (maxID));//Part one
		System.out.println("Part one my ID: " + (myID));//Part two

	}

}
