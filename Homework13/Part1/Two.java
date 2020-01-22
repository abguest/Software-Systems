import java.lang.reflect.Array;
import java.util.*;

public class Two {
	  static <T extends Comparable<T>> void sort(T[] a) {
		    boolean sorted;
		    do {
		      sorted = true;
		      for (int i = 0; i < a.length - 1; i++) {
		        if ((a[i]).vertaa(a[i+1]) > 0) {
		          sorted = false;
		          T temp = a[i];
		          a[i] = a[i+1];
		          a[i+1] = temp;
		        }
		      }
		      // System.out.println( Two.toString(a) );
		    } while ( ! sorted );
		  }

		  static <E> String toString(E[] a) {
		    String result = "";
		    for (E e : a)
		      result += e + ", ";
		    System.out.println(result.substring(0, result.length()-2));
		    return result.substring(0, result.length() - 2);
		  }
}




