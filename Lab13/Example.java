
public class Example {
	  public static void main(String[] args) {
		    Graph a = new United();
		    Path p = a.shortestPath(new Vertex(args[1]),
		                            new Paths(new Path(new Vertex(args[0]))));
		    System.out.println( p );
		  }
}

//correlation between hashCode and equals? 
//does equals return true if the hashcodes are the same?
//I don't get what they are doing in Vertex
//are Path, Paths, and Neighbors the same thing?
//I get lost in Graph's shortestPath method
//basically it's looking at a key, seeing if it has 
//the value of the destination city. if it doesn't it looks
//to the key of the first value city, then looks at that 
//key's values to see if it has the destination city and so on