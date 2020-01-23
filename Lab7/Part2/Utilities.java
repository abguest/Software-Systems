import java.util.*;
import java.io.*;

class Utilities {
	
	public static void countWord(ListOfFrequency lof, String word) {
		for (Frequency f : lof)
			if (f.word.equals(word)) {
				f.addOne();
				return;
			}
		lof.add(new Frequency( word, 1 ));
	}
	
	public static ListOfFrequency countAllWords(ListOfStrings los) {
		ListOfFrequency lof=new ListOfFrequency();
		for (String word: los)
			Utilities.countWord(lof, word);
		return lof;
	}
	
	  public static ListOfStrings readFile(File file) { // new procedure, given
		  ListOfStrings los = new ListOfStrings(); 
		    try { 
		      Scanner in = new Scanner(file); 
		      while (in.hasNext()) {
		        los.add(in.next());  
		      }
		    } catch (FileNotFoundException e) {
		      
		    }
		    return los;
	  }
	
	
	public static ListOfFrequency filter(int threshold, ListOfFrequency lof) {
		ListOfFrequency result = new ListOfFrequency();
		for (Frequency f : lof)
			if (f.count > threshold)
				result.add( f );
		return result;
	}
	
	  public static void main(String[] args) { // combined unit test code 
		    ListOfFrequency lof = new ListOfFrequency(); 
		    Utilities.countWord( lof, "mango" ); 
		    Utilities.countWord( lof, "apple" ); 
		    Utilities.countWord( lof, "banana" ); 
		    Utilities.countWord( lof, "mango" ); 
		    Utilities.countWord( lof, "apple" ); 
		    Utilities.countWord( lof, "apple" ); 
		    System.out.println( lof ); 
		    ListOfStrings los = new ListOfStrings(); 
		    los.add("mango"); 
		    los.add("apple"); 
		    los.add("banana"); 
		    los.add("mango"); 
		    los.add("apple"); 
		    los.add("apple"); 
		    ListOfFrequency alof = Utilities.countAllWords(los); 
		    System.out.println( alof ); 
		    ListOfStrings alos = Utilities.readFile(new File("/Users/Abbie/Desktop/eclipse-workspace/Lab7/src/geah.txt")); 
		    System.out.println( Utilities.filter( 20, Utilities.countAllWords( alos ) ) ); 
		  }
}
	  // you need to write/define filter here
	  

	  
	 
	
	
	
	

