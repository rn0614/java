package ch13.sec08;

public class Student {
	private String name;
	private int englishScore;
	private int mathScore;
	
	
	// 매개변수 있는 생성자
	public void setMathScore(String name, int englishScore, int mathScore) {
		this.name = name;
		this.mathScore = mathScore;
		this.englishScore = englishScore;
	}
	
	// getters
	public String getName() {return name;	}
	
	public int getEnglishScore() {return englishScore;}
	
	public int getMathScore() {	return mathScore;}
	

}
