import java.util.*;

//p7.5 using ArrayList
public class ListFive {
	public static void main(String[] args) {
		
		Scanner in=new Scanner (System.in);

		ArrayList<ArrayList<Integer>> square=new ArrayList<ArrayList<Integer>>();

		for(int i=0; i<4; i++) {
			ArrayList<Integer> squareTwo=new ArrayList<Integer>();
			for(int j=0; j<4; j++) {
				System.out.print("Enter a number 1 to 16: ");
				int num=in.nextInt();
				squareTwo.add(num);


			}
			square.add(squareTwo);
		}
		featuresOne(square);

		if (featuresOne(square) && actualMagic(square)) {
			System.out.println("Your magic square is: ");
		}else { 
			System.out.println("The following square is not magic: ");
		}
		for(int i=0; i<square.size(); i++) {
			System.out.println((square.get(i)));
	}
		
	}
	
	//checking if numbers 1-16 each occur once
	//returns true if each number only listed once & is between 1-16
	public static boolean featuresOne (ArrayList<ArrayList<Integer>> a)
	{
		ArrayList <Integer> dict = new ArrayList <Integer>();
		boolean once=true;
		int count=0;

		//populating dict with squares numbers
		for(int i=0; i<4; i++) {
			for (int j=0; j<4; j++) {
				dict.add(count, a.get(i).get(j));
				count++;
			}
		}

		//checking if numbers are repeated/above 16 or below 1
		for (int i=0; i<16; i++) {
			for (int j=i+1 ; j<15; j++) {
				if (dict.get(i) == dict.get(j) || dict.get(i) > 16 || dict.get(i) < 1 || dict.get(j)>16 || dict.get(j) < 1) {
					once=false;
				}
			}
		}
		return once;
		}
	
	public static boolean actualMagic(ArrayList<ArrayList<Integer>> magicArray) {
		boolean isMagic=false;
		int rowOneSum=0;
		int rowTwoSum=0;
		int rowThreeSum=0;
		int rowFourSum=0;
		int colOneSum=0, colTwoSum=0, colThreeSum=0, colFourSum=0;
		int diagOne=0; 
		int diagTwo = magicArray.get(0).get(3)+magicArray.get(1).get(2)+magicArray.get(2).get(1)+magicArray.get(3).get(0);
		for (int i=0; i<4; i++) {
			rowOneSum += magicArray.get(0).get(i);
			rowTwoSum += magicArray.get(1).get(i);
			rowThreeSum += magicArray.get(2).get(i);
			rowFourSum += magicArray.get(3).get(i);
			
			colOneSum += magicArray.get(i).get(0);
			colTwoSum += magicArray.get(i).get(1);
			colThreeSum += magicArray.get(i).get(2);
			colFourSum += magicArray.get(i).get(3);
			
			diagOne += magicArray.get(i).get(i);
		}
		if (rowOneSum==rowTwoSum && rowTwoSum==rowThreeSum && rowThreeSum==rowFourSum
				&& rowFourSum==colOneSum && colOneSum==colTwoSum && colTwoSum==colThreeSum
				&& colThreeSum==colFourSum && colFourSum==diagOne && diagOne==diagTwo) {
			return isMagic=true; 
			}

		return isMagic;
	}
}
