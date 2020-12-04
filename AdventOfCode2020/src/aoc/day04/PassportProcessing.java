package aoc.day04;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import aoc.util.InputFileReader;

public class PassportProcessing {

	private static ArrayList<Passport> myPassPorts = new ArrayList<Passport>();
	
	public static void main(String[] args) throws FileNotFoundException {
		String src = "src/aoc/day04/input.txt";
		InputFileReader ipf = new InputFileReader(src);
		ArrayList<String> myListString = ipf.getList();
		int byr = -1, iyr = -1, eyr = -1, cid = -1;
		String hgt = "", hcl = "", ecl = "", pid = "";
		
		for(String line : myListString) {
			String [] items = line.split(" ");
			for(String item : items) {
				String [] param = item.split(":");
				switch(param[0]) {
					case "byr":
						byr = Integer.parseInt(param[1]);
						break;
					case "iyr":
						iyr = Integer.parseInt(param[1]);
						break;
					case "eyr":
						eyr = Integer.parseInt(param[1]);
						break;
					case "cid":
						cid = Integer.parseInt(param[1]);
						break;
					case "pid":
						pid = param[1];
						break;
					case "hgt":
						hgt = param[1];
						break;
					case "hcl":
						hcl = param[1];
						break;
					case "ecl":
						ecl = param[1];
						break;
					default:
						addPassport(byr, iyr, eyr, cid, hgt, hcl, ecl, pid);
						byr = -1; iyr = -1; eyr = -1; hgt = ""; hcl = ""; ecl = ""; pid = ""; cid = -1;
				}
			}
		}	
		addPassport(byr, iyr, eyr, cid, hgt, hcl, ecl, pid);//For the last one.
		byr = -1; iyr = -1; eyr = -1; hgt = ""; hcl = ""; ecl = ""; pid = ""; cid = -1;
		
		System.out.println("Part one count:" + myPassPorts.size());//Part one
		System.out.println("Part two count:" + isValid());//Part two

	}

	//Part one
	private static void addPassport(int byr, int iyr, int eyr, int cid, String hgt, String hcl, String ecl, String pid) {
		Passport entry;
		if(byr == -1 || iyr == -1 || eyr == -1 || pid.equals("") ||	hgt.equals("") || hcl.equals("") || ecl.equals("")){
			//Nothing, just in case you need to do anything here.				
		}else {
			entry = (cid == -1) ? new Passport(byr, iyr, eyr, hgt, hcl, ecl, pid) : new Passport(byr, iyr, eyr, hgt, hcl, ecl, pid, cid);
			myPassPorts.add(entry);
		}
	}
	
	//Part two
	private static int isValid() {
		int count = 0;
		for(Passport myPP : myPassPorts) 
			count += (myPP.isValid()) ? 1 : 0;
		return count;
	}
}
