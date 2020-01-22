import java.util.*;

//p7.6 using int[][]
public class MagicSix {
	public static void main (String[] args) {
		Scanner in=new Scanner (System.in);
		System.out.print("Enter the array size: ");
		int size=in.nextInt();

		int[][] square=new int[size][size];
		int line=size-1, col=size/2, number=1;
		while (number < size*size) {
			square[line][col]=number;
			MagicSix.show(square);
			int i=(line+1)%size;
			int j=(col+1)%size;
			if(square[i][j] !=0) line-=1;
			else {
				line=i; col=j;
			}
			number+=1;
			System.out.println("We now place " + number + " at position (" + line + " , " + col + ")");			
		}
	}
	
	
	public static void show(int[][] a) {
		for(int line=0; line<a.length; line++) {
			for (int col=0; col<a[line].length; col++) {
				System.out.print(a[line][col]+" ");
			}
			System.out.println();
		}

	}
}

