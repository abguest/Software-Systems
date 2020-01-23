public class United extends Graph {
  United() {
    Vertex  sf = new Vertex("san francisco");
    Vertex   p = new Vertex("portland");
    Vertex  la = new Vertex("los angeles");
    Vertex slc = new Vertex("salt lake city");
    Vertex   v = new Vertex("vancouver");
    Vertex   s = new Vertex("seattle");
    Vertex   h = new Vertex("helena");
    Vertex   d = new Vertex("denver");
    Vertex  lv = new Vertex("las vegas");
    Vertex sfe = new Vertex("santa fe");
    Vertex  ph = new Vertex("phoenix");
    Vertex   e = new Vertex("el paso");

    this.put( sf, new Neighbors(new Vertex[] {  p, slc,  la           } ));
    this.put(  p, new Neighbors(new Vertex[] {  s, slc,  sf           } ));
    this.put(slc, new Neighbors(new Vertex[] {  h,   d,  lv,  sf,   p } ));
    this.put( la, new Neighbors(new Vertex[] { sf,  lv,  ph,   e      } ));

  }
  public static void main(String[] args) {
    Graph a = new United(); 
    System.out.println( a + "\n---" );
    a.show(); 
    Vertex sf = new Vertex("san francisco"); 
    System.out.println( a.get(sf) ); 
    System.out.println( "true? " + a.containsKey(sf) ); // should be true
  }
}
