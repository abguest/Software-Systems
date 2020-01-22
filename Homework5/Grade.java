import java.util.Scanner;

public class Grade {
	public static void getNumericGrade(double gpa){
		if (gpa>4.0 || gpa<0) {
			System.out.println("Invalid input");
		}
		if (gpa<0.35) {
			System.out.println("F");
		}
		if (gpa>=0.35 && gpa<0.85) {
			System.out.println("D-");
		}
		if (gpa>=0.85 && gpa<1.15) {
			System.out.println("D");
		}
		if (gpa>=1.15 && gpa<1.5) {
			System.out.println("D+");
		}
		if (gpa>=1.5 && gpa<1.85) {
			System.out.println("C-");
		}
		if (gpa>=1.85 && gpa<2.15) {
			System.out.println("C");
		}
		if (gpa>=2.15 && gpa<2.5) {
			System.out.println("C+");
		}
		if (gpa>=2.5 && gpa<2.85) {
			System.out.println("B-");
		}
		if (gpa>=2.85 && gpa<3.15) {
			System.out.println("B");
		}
		if (gpa>=3.15 && gpa<3.5) {
			System.out.println("B+");
		}
		if (gpa>=3.5 && gpa<3.85) {
			System.out.println("A-");
		}
		if (gpa>=3.85 && gpa<=4.0) {
			System.out.println("A");
		}
	}
	
	public static void main (String[] args) {
		Scanner grade = new Scanner (System.in);
		System.out.print("Enter your GPA: ");
		double p=grade.nextDouble();
		Grade g=new Grade(); 
		g.getNumericGrade(p);
	}
		
}
