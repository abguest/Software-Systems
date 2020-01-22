import java.util.*;

public interface LispList {
	  public static LispList NIL = new EmptyList();
	  boolean isEmpty();
	  Object head() throws Exceptionals;
	  LispList tail() throws Exceptionals;
	  String toString();
	  int length();
	  boolean contains(Object obj);
	  LispList cons(Object a);
}
