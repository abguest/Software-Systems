import java.util.*;

//p7.5 using int[][]
//2 features: does each number occur in the user input?
//When the numbers are put into a square, are the sums
//equal to each other? 

//magic square as int[][]
public class MagicFive {
	
	public static void main(String[] args) {
		int[][] magic=new int[4][4];
		Scanner in=new Scanner(System.in);
		
		for (int i=0; i< magic.length; i++) {		
			for (int j=0; j<magic[i].length; j++) {
				System.out.println("Enter a number 1 to 16: ");
				int next=in.nextInt();
				magic[i][j]=next;
				featuresOne(magic);
				actualMagic(magic);
			}
		}
		if (featuresOne(magic) && actualMagic(magic)) {
			System.out.println("Your magic square is: ");
		}else { 
			System.out.println("The following square is not magic: ");
		}
		for(int i=0; i<magic.length; i++) {
				System.out.println(Arrays.toString(magic[i]));
		}
	}
	
	//checking if numbers 1-16 each occur once
	//returns true if each number only listed once
	public static boolean featuresOne(int[][] magic)
	{
		boolean once=true;
		int count=0;
		
		int [] dict=new int[16];
		for(int i=0; i<4; i++) {
			for (int j=0; j<4; j++) {
				dict[count] = magic[i][j];
				count++;
			}
		}
		for (int i=0; i<16; i++) {
			for (int j=i+1 ; j<15; j++) {
				if (dict[i] == dict[j] || dict[i]>16 || dict[i]<1 || dict[j]>16 || dict[j]<1) {
					once=false;
				}
			}
		}
		//System.out.println(Arrays.toString(dict));
		//System.out.println (once);
		return once;
		
	}
	
	//When numbers put into a square, are the sums equal?
	//returns true if sums are equal
	public static boolean actualMagic(int[][] magicArray) {
		boolean isMagic=false;
		int rowOneSum=0;
		int rowTwoSum=0;
		int rowThreeSum=0;
		int rowFourSum=0;
		int colOneSum=0, colTwoSum=0, colThreeSum=0, colFourSum=0;
		int diagOne=0; 
		int diagTwo = magicArray[0][3]+magicArray[1][2]+magicArray[2][1]+magicArray[3][0];
		for (int i=0; i<4; i++) {
			rowOneSum += magicArray[0][i];
			rowTwoSum += magicArray [1][i];
			rowThreeSum += magicArray [2][i];
			rowFourSum += magicArray [3][i];
			
			colOneSum += magicArray[i][0];
			colTwoSum += magicArray[i][1];
			colThreeSum += magicArray[i][2];
			colFourSum += magicArray[i][3];
			
			diagOne += magicArray [i][i];
		}
		if (rowOneSum==rowTwoSum && rowTwoSum==rowThreeSum && rowThreeSum==rowFourSum
				&& rowFourSum==colOneSum && colOneSum==colTwoSum && colTwoSum==colThreeSum
				&& colThreeSum==colFourSum && colFourSum==diagOne && diagOne==diagTwo) {
			return isMagic=true; 
			}

		return isMagic;
	}
}
