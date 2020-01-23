
public class BST<T extends Comparable<T>> {
	 
	  private Node<T> root;
	  public BST() { // [1] 
	    this.root = null;
	  }
	  public BST(Node<T> node) { // [2] 
	    this.root = node;
	  }
	  public BST(T value) { // [3] 
	    this.root = new Node<T>(value);
	  }
	  public void insert(T value) {
	  
	    // System.out.println(this.root);
	    if (this.root == null)
	      this.root = new Node<T>(value);
	    else if (this.root.value().compareTo(value) > 0)
	      this.root.left.insert(value);
	    else if (this.root.value().compareTo(value) < 0)
	      this.root.right.insert(value);
	  }
	  public String print() { // [4] 
	    if (this.root == null) return ".";
	    else return "(" + this.root.print() + ")";
	  }
	  public String toString() { /// [5] 
	    return this.root == null ? "" : this.root + "";
	  }
	  public int size() {
	    if (this.root == null) return 0; 
	    else return 1 + this.root.left.size() + this.root.right.size();
	  }
	  public T find(int k) {
		  //0th is 1; 4th is 7; k is an index but size starts at 1
			  // System.out.println("Find index " + k + " in " + this.print());
			  if (k >= this.size() || k < 0) return null; 
			  else {
				if (k < this.root.left.size())
			 	  return this.root.left.find(k);
				else if (k > this.root.left.size())
	 			  return this.root.right.find( k - (this.root.left.size() + 1) );
				else
				  return this.root.value; 
			  }	  
		  }
		  public static void main(String[] args) {
		    BST<Integer> a = new BST<Integer>( new Node<Integer>( 8 ) ); // brand new 
		    a.insert( 10 ); // add 10 to the one that has only 8
		    a.insert( 3 ); 
		    a.insert( 1 ); 
		    a.insert( 6 ); 
		    a.insert( 4 ); 
		    a.insert( 7 ); 
		    a.insert( 14 ); 
		    a.insert( 13 ); 
		    System.out.println( a + " has size " + a.size()); 
		    System.out.println( a.print() + " has size " + a.size()); 
		    
		    System.out.println( a.find(-1) );
		    System.out.println( a.find(0) );
		    System.out.println( a.find(1) );
		    System.out.println( a.find(2) );
		    System.out.println( a.find(3) );
		    System.out.println( a.find(4) );
		    System.out.println( a.find(5) );
		    System.out.println( a.find(6) );
		    System.out.println( a.find(7) );
		    System.out.println( a.find(8) );
		    System.out.println( a.find(9) );
		  }
}
