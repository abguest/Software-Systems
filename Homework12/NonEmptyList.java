import java.util.*;

public class NonEmptyList implements LispList{
  Object head;
  LispList tail;
  public NonEmptyList(Object first, LispList rest){
    this.head = first;
    this.tail = rest;
  }
  
  public boolean isEmpty(){
    return false;
  }
  
  public Object head(){
    return this.head;
  }
  
  public LispList tail(){
    return this.tail;
  }
  
  public NonEmptyList cons(Object a){
    return new NonEmptyList(a, this);
  }
  
  public int length(){
    int count = 1;
    try { 
      LispList a = tail(); 
      while (!a.isEmpty()){
        count+=1;
        a = a.tail(); 
      }
      return count;
      // return 1 + tail().length(); 
    } catch (Exceptionals e) { 
      return  -1; // I don't like this   
    }
  }
  
  public boolean contains(Object obj){
    if (this.head.equals(obj))
      return true;
    else
      if (this.tail==null) return false;
      else return this.tail.contains(obj);
  }
    
  public String toString(){
    return head() + " " + tail().toString();
  } 
}
