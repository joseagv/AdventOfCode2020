package aoc.util;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class InputFileReader {

	String src = "";
	File file;
	Scanner sc;
	ArrayList<String> list = new ArrayList<String>();
	
	public InputFileReader(String src) throws FileNotFoundException {
		this.src = src;
		file = new File(this.src);
		sc = new Scanner(file);
		while(sc.hasNextLine()) {
			list.add(sc.nextLine());
		}
	}

	public ArrayList<String> getList() {
		return list;
	}

	public void setList(ArrayList<String> list) {
		this.list = list;
	}

	public String getSrc() {
		return src;
	}

	public void setSrc(String src) {
		this.src = src;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public Scanner getSc() {
		return sc;
	}

	public void setSc(Scanner sc) {
		this.sc = sc;
	}
	
	
}
