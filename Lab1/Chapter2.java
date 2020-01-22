import java.math.BigDecimal;

public class Chapter2
{
  public static void main(String[] args)
  {
    //R2.5
    int mystery=1;
    mystery=1-2*mystery;
    mystery=mystery+1;
    System.out.println(mystery);
    
    System.out.println(new BigDecimal(1+2));
    System.out.println(new BigDecimal(2*3));
    System.out.println(new BigDecimal(1-(2-(3-4))));
    System.out.println(new BigDecimal(1-2-3-4));
    System.out.println(new BigDecimal(2*3-4*5));
  }
}

//R2.5 the value of mystery is 0 after the sequence of statements
//R2.6 the statement is declaring the variable twice by using int