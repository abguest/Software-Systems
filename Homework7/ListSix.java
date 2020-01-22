import java.util.*;

//P7.6 using arrayList
public class ListSix {
	public static void main (String[] args) {
		Scanner in=new Scanner (System.in);
		System.out.print("Enter the array size: ");
		int size=in.nextInt();

		ArrayList<ArrayList<Integer>> square=new ArrayList<ArrayList<Integer>>();

		int row=size-1, col=size/2, num=1;
		int holder=0;
		
		for(int i=0; i<size; i++) {
			ArrayList<Integer> squareTwo=new ArrayList<Integer>();
			for(int j=0; j<size; j++) {
				squareTwo.add(holder);
			}
			square.add(squareTwo);
		}
		System.out.print(square);
		

		while (num < size*size) {
			square.get(row).set(col,num);
			ListSix.present(square);
			int i=(row+1)%size;
			int j=(col+1)%size;
			if(square.get(i).get(j) != 0) row-=1;
			else {
				row=i; col=j;
			}
			num+=1;
			System.out.println("We now place " + num + " at position (" + row + " , " + col + ")");			
		}
	}
	
	
	public static void present(ArrayList<ArrayList<Integer>> a) {
		for(int line=0; line<a.size(); line++) {
			for (int col=0; col<a.get(line).size(); col++) {
				System.out.print(a.get(line).get(col)+" ");
			}
			System.out.println();
		}

	}
	}

