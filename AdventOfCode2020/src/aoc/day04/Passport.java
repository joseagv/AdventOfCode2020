package aoc.day04;

import java.util.regex.Pattern;

public class Passport {

	private int byr;
	private int iyr;
	private int eyr;
	private String hgt;
	private String hcl;
	private String ecl;
	private String pid;
	private int cid;//Optional
	
	public Passport(int byr,int iyr, int eyr, String hgt, String hcl, String ecl, String pid, int cid) {
		this.byr = byr;
		this.iyr = iyr;
		this.eyr = eyr;
		this.hgt = hgt;
		this.hcl = hcl;
		this.ecl = ecl;
		this.pid = pid;
		this.cid = cid;
	}
	
	public Passport(int byr,int iyr, int eyr, String hgt, String hcl, String ecl, String pid) {
		this.byr = byr;
		this.iyr = iyr;
		this.eyr = eyr;
		this.hgt = hgt;
		this.hcl = hcl;
		this.ecl = ecl;
		this.pid = pid;
	}

	public int getByr() {
		return byr;
	}

	public void setByr(int byr) {
		this.byr = byr;
	}

	public int getIyr() {
		return iyr;
	}

	public void setIyr(int iyr) {
		this.iyr = iyr;
	}

	public int getEyr() {
		return eyr;
	}

	public void setEyr(int eyr) {
		this.eyr = eyr;
	}

	public String getHgt() {
		return hgt;
	}

	public void setHgt(String hgt) {
		this.hgt = hgt;
	}

	public String getHcl() {
		return hcl;
	}

	public void setHcl(String hcl) {
		this.hcl = hcl;
	}

	public String getEcl() {
		return ecl;
	}

	public void setEcl(String ecl) {
		this.ecl = ecl;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	@Override
	public String toString() {
		return "Passport [byr=" + byr + ", iyr=" + iyr + ", eyr=" + eyr + ", hgt=" + hgt + ", hcl=" + hcl + ", ecl="
				+ ecl + ", pid=" + pid + ", cid=" + cid + "]\n";
	}
	
	//Part two validations
	public boolean isValidByr() {
		String byrS = "" + byr; 
		String pattern = "\\d{4}";
		//System.out.println(byrS);
		if(Pattern.compile(pattern).matcher(byrS).matches()) 
			return (1920 <= byr && 2002 >= byr);
		return false;
	}
	
	public boolean isValidIyr() {
		String chain = "" + iyr; 
		String pattern = "\\d{4}";
		//System.out.println(chain);
		if(Pattern.compile(pattern).matcher(chain).matches()) 
			return (2010 <= iyr && 2020 >= iyr);
		return false;
	}	
	
	public boolean isValidEyr() {
		String chain = "" + eyr; 
		String pattern = "\\d{4}";
		//System.out.println(chain);
		if(Pattern.compile(pattern).matcher(chain).matches()) 
			return (2020 <= eyr && 2030 >= eyr);
		return false;
	}	
	
	public boolean isValidHgt() { 
		String patternCM = "\\d{3}\\D{2}";
		String patternIN = "\\d{2}\\D{2}";
		//System.out.println(hgt);
		if(hgt.contains("cm")) {
			int num = Integer.parseInt(hgt.replace("cm", ""));
			if(Pattern.compile(patternCM).matcher(hgt).matches())
				return (150 <= num && 193 >= num);
		}else {
			int num = Integer.parseInt(hgt.replace("in", ""));
			if(Pattern.compile(patternIN).matcher(hgt).matches())
				return (59 <= num && 76 >= num);
		}
		return false;
	}	
	
	public boolean isValidHcl() {
		String pattern = "#[0-9a-f]{6}";
		//System.out.println(hcl);
		return Pattern.compile(pattern).matcher(hcl).matches();
	}	
	
	public boolean isValidEcl() {
		//System.out.println(ecl);
		switch(ecl) {
			case "amb":
				return true;
			case "blu" :
				return true;
			case "brn" :
				return true;
			case "grn" :
				return true;
			case "gry" :
				return true;
			case "hzl" :
				return true;
			case "oth" :
				return true;
			default :
				return false;
		}
	}	
	
	public boolean isValidPid() {
		String pattern = "\\d{9}";
		//System.out.println(pid);
		return Pattern.compile(pattern).matcher(pid).matches();
	}
	
	public boolean isValid() {
		return (isValidByr() && isValidIyr() && isValidEyr() && isValidHgt() &&
				isValidHcl() && isValidEcl() && isValidPid());
	}
	
}
