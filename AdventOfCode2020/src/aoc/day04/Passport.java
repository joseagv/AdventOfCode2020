package aoc.day04;

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
	
	
}
