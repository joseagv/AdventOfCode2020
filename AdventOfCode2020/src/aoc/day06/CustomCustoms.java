package aoc.day06;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import aoc.util.InputFileReader;

public class CustomCustoms {

	public static void main(String[] args) throws FileNotFoundException {
		String src = "src/aoc/day06/input.txt";
		InputFileReader ipf = new InputFileReader(src);
		ArrayList<String> myListString = ipf.getList();
		ArrayList<Form> myForm = new ArrayList<Form>();
		
		//Part one
		String auxLine = "";
		for(String line : myListString) {
			if(line.equals("")) {
				myForm.add(new Form(auxLine));
				auxLine = "";
			}
			else {
				String [] eachOne = line.split("");
				for(String eachChar : eachOne) {
					if(!auxLine.contains(eachChar)) {
						auxLine += eachChar;
					}		
				}
			}

		}
		//Part one
		int sum = myForm.stream().mapToInt(c -> c.getLenght()).sum();
		System.out.println("Part one count: " + sum + " Last group id: " + Form.getId());
	}

}
