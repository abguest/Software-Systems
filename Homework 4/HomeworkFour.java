import java.util.Scanner;

public class HomeworkFour {
	public static void main(String[] args) {
		
		Scanner time; 
		time= new Scanner(System.in);
		System.out.print("Enter the first time: ");		
		String time1=time.nextLine();
		
		//converts time1 input into minutes
		int a=(Integer.parseInt(time1.substring(0,2))*60)+Integer.parseInt(time1.substring(3,5));
		
		System.out.print("Enter the second time: ");		
		String time2=time.nextLine();
		
		//converts time2 input into minutes
		int b=(Integer.parseInt(time2.substring(0,2))*60)+Integer.parseInt(time2.substring(3,5));
		
		//adds a day if time2 earlier than time1
		int difference1=(b-a+1440)%1440;
			
		int fullHour=difference1/60;
		int remainMinutes=difference1%60;

		System.out.println(fullHour + " hours and " + remainMinutes + " minutes.");
		

	}		
}
