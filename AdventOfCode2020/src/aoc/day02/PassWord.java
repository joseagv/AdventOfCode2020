package aoc.day02;

public class PassWord {

	private int min, max;
	private char word;
	private String chain;
	
	public PassWord(int min, int max, char word, String chain) {
		this.min = min;
		this.max = max;
		this.word = word;
		this.chain = chain;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public char getWord() {
		return word;
	}

	public void setWord(char word) {
		this.word = word;
	}

	public String getChain() {
		return chain;
	}

	public void setChain(String chain) {
		this.chain = chain;
	}
	
	//Part one
	public boolean isCorrect() {
		int count = 0;
		char[] chainList = chain.toCharArray();
		for(char myChar : chainList) {
			count += (word == myChar) ? 1 : 0;
		}
		return (count >= min && count <= max) ? true : false;
	}
	
	//Part two
	public boolean xOr() {
		return ((chain.charAt(min-1) == word) ^ (chain.charAt(max-1) == word));
	}
}
