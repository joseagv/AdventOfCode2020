package aoc.day06;

public class Form {
	private static int id = 0;
	private String line;
	
	public Form(String line) {
		id++;
		this.line = line;
	}

	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		Form.id = id;
	}

	public String getLine() {
		return line;
	}

	public void setLine(String line) {
		this.line = line;
	}

	public int getLenght() {
		return line.length();
	}
	
}
