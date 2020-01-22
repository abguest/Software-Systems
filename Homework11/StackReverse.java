//E15.8
import java.util.*;

public class StackReverse {
	static String answer="";
	
	  public static void main(String[] args) {
		    Stack<String> s = new Stack<String>();
		    Stack<String> other=new Stack<String>();
		    
		    String sentence = "Mary had a little lamb. Its fleece was white as snow.";
		    Scanner in = new Scanner(sentence); 
		    
		    while (in.hasNext()) {
		      String word = in.next(); 
		      if (!word.contains(".")) {
		    	  s.push( word ); 
		      }
		      if (word.contains(".")) {
		    	  s.push(word);
		    	  StackReverse.reverse(s);	    	  
		      }	      
		    }
	  }
	  public static void reverse(Stack<String> s) {
		  
		    while (! s.empty()) {
		      String word = s.pop(); 
		      if (word.contains(".") ) {
		    	  word = word.replace(".", "");
		    	  
		    	  char first = Character.toUpperCase(word.charAt(0));
		    	  word = first + word.substring(1);	
		    	  
		    	  }
		      if (s.empty()) { 
		    	  word = word.toLowerCase();
		     }
		      answer = answer + " " + word; 		
		    }		   
		    if (s.empty()) { 
		    	answer += "."; 
		    	}
		    System.out.println( answer );
		  }
}
