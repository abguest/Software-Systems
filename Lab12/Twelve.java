import java.util.LinkedList;
import java.util.ListIterator;

public class Twelve {
	public static void main(String[] args) {
		//R15.18
		LinkedList<String> one=new LinkedList<>();
		one.add("Emily");
		one.add("Alex");
		LinkedList<String> two=new LinkedList<>();
		two.add("Johnny");
		two.add("Emily");
		//Twelve.union(one,two);
		Twelve.intersect(one, two);

	}
//	public static void union(LinkedList<String> a, LinkedList<String> b) {
//		LinkedList<String> union=new LinkedList<>();
//		ListIterator<String> iterator=union.listIterator();
//		//System.out.println(staff);
//		for (int i=0; i<a.size() && i<b.size(); i++) {
//			iterator.add(a.get(i));
//			iterator.add(b.get(i));
//		}
//		System.out.println(union);
//	}
	public static void intersect(LinkedList<String> a, LinkedList<String> b) {
		LinkedList<String> union=new LinkedList<>();
		ListIterator<String> iterator=union.listIterator();
		for (int i=0; i<a.size() && i<b.size(); i++) {
			iterator.add(a.get(i));
			iterator.add(b.get(i));
			System.out.println(union);
		}
		LinkedList<String> intersect=new LinkedList<>();
		iterator = union.listIterator();
		System.out.println(union);
		while(iterator.hasNext()) {
			for (int i=0; i<union.size(); i++) {
				if (intersect.contains(iterator.next())){ break;}
				else {intersect.add(iterator.next());} 
			}	
			System.out.println(intersect);
		}
		System.out.println(intersect);

		//System.out.println(staff);

		//for (int i=0; i<a.size() && i<b.size(); i++) {
			//if (a.contains(b.get(i))) {System.out.println(iterator.next());}
//			iterator.add(a.get(i));
//			iterator.add(b.get(i));
		
		
	}
	
	}
