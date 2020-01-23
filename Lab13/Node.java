class Node<T extends Comparable<T>> {
  T value;
  BST<T> left, right;
  public Node(T value) {
    this.value = value;
    this.left = new BST<T>();
    this.right = new BST<T>();
  }
  public String toString() {
    return this.left + " " + this.value + " " + this.right;
  }
  public T value() {
    return this.value;
  }
  public String print() {
    return this.value + " " + this.left.print() + " " + this.right.print();
  }
  public static void main(String[] args) {
    Node<Integer> a = new Node<Integer>(3); 
    System.out.println( a ); 
    Node<String> b = new Node<String>("Nothing"); 
    System.out.println( b.value() );     
    b = new Node<String>("Whatever..."); 
    System.out.println( b.value() );   
    b = new Node<String>("Whatever..."); 
    System.out.println( b.print() ); 
    b = new Node<String>("Whatever..."); 
    System.out.println( b ); 
    // complete coverage
  }
}