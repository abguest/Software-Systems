import java.util.*;

public class Twel {
	  public static ArrayList<String> unionSet(LinkedList<String> u1, LinkedList<String> u2){
		    ArrayList<String> staff = new ArrayList<String>(u1);
		    
		    for (int i=0; i<u2.size(); i++) {
		    	if (staff.contains(u2.get(i))) {}
		    	else {staff.add(u2.get(i));}
		    }
		    return staff;
		  }
	  
		  public static ArrayList<String> intersectionSet(LinkedList<String> u1, LinkedList<String> u2){
		    ArrayList<String> staff = new ArrayList<String>(u2);
		    staff.retainAll(u1);
		    return staff;
		  }
		  
		  public static void main(String[] args) {
		    LinkedList<String> list1 = new LinkedList<String>();
		    list1.add("abbie");
		    list1.add("bob");
		    list1.add("cody");
		    LinkedList<String> list2 = new LinkedList<String>();
		    list2.add("abbie");
		    list2.add("bob");
		    list2.add("duck"); 
		    list2.add("the");
		    System.out.println(unionSet(list1,list2).toString());
		    System.out.println(intersectionSet(list1,list2).toString());
		  }
}
