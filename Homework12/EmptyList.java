import java.util.*;

public class EmptyList implements LispList{
	  public EmptyList(){}
	  
	  public boolean isEmpty(){
	    return true;
	  }
	  
	  public LispList head() throws Exceptionals {
	    throw new Exceptionals(); 
	  }
	  
	  public LispList tail() throws Exceptionals {
	    throw new Exceptionals(); 
	  }
	  
	  public int length(){
	    return 0;
	  }
	  Object head;
	  LispList tail;
	  public boolean contains(Object obj){
	    return false;
	  }
	  
	  public LispList cons(Object a){
	    return new NonEmptyList(a, this);
	  }
	   
	  public String toString(){
	    return "";
	  } 

}
