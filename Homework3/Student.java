//p3.7 from pic book

public class Student {
	String name;
	int totalQuizScore;
	int numberOfQuizzes;
	
	//Supply an appropriate constructor
	public Student(String studentName) {
		this.name=studentName;
	}
	
	public String getName() {
		return name;
	}
	
	public void addQuiz(int score) {
		this.totalQuizScore+=score;
		this.numberOfQuizzes+=1;
	}
	
	public int getTotalScore() {
		return totalQuizScore;
	}
	
	public int getAverageScore() {
		int average=totalQuizScore/numberOfQuizzes;
		return average;
	}
}
