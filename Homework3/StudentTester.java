//p3.7 book
public class StudentTester {
	public static void main(String[] args) {
		Student julie=new Student("Julie");
		String h=julie.getName();
		julie.addQuiz(98);
		julie.addQuiz(90);
		int y=julie.getTotalScore();
		System.out.println(h+"'s current total score is: "+y);
		int m=julie.getAverageScore();
		System.out.println("Expected average score: 94");
		System.out.println("Actual average score: "+m);
		julie.addQuiz(91);
		int p=julie.getAverageScore();
		System.out.println("New expected average score: 93");
		System.out.println("Actual average score: "+p);
	}
}
