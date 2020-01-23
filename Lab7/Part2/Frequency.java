import java.util.ArrayList;


public class Frequency {
	  Frequency(){}
	  
		  String word;
		  Integer count;
		  Frequency(String word, Integer count){
			  this.word = word;
			  this.count = count;
		  }
		  void addOne () {
			  this.count += 1;
		  }
		  public String toString() {
			  return "(" + word + ", " + count + ")";
		  }
	  }
	  
	  class ListOfStrings extends ArrayList <String> {
		  
	  }
	  
	  class ListOfFrequency extends ArrayList <Frequency> {
		  
	  }

