import java.util.*;
//E18.7 implement a generic version of the merge
//sort algorithm
public class GenericMerge implements Comparable<GenericMerge>{
	  String name;
	  int age;
	  GenericMerge(String name, int age) {
	    this.name = name;
	    this.age = age;
	  }
		public int vertaa(GenericMerge other) {
		    if (this.age < other.age) return -1; 
		    else if (this.age > other.age) return 1;
		    else if (this.age==other.age) return this.name.compareTo(other.name);
		    else return 0;
		}
		
	  public String toString() {
	    return name + ":" + age;
	  }
	  public static void main(String[] args) {
		    GenericMerge[] students = new GenericMerge[6];
		    students[0] = new GenericMerge("Alice" , 14);
		    students[1] = new GenericMerge("Bob"   ,  8);
		    students[2] = new GenericMerge("John"  , 21);
		    students[3] = new GenericMerge("Tom"   , 37);
		    students[4] = new GenericMerge("Leslie", 21);
		    students[5] = new GenericMerge("Alex"  , 45);


		    Two.sort( students );
		    System.out.println( Two.toString(students) );
		  
	  }
	}

