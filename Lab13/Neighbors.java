import java.util.*;
//shortest path
public class Neighbors extends ArrayList<Vertex> {
  public Neighbors( Vertex[] neighbors ) {
    for (Vertex v : neighbors)
      this.add(v);
  }
  
}