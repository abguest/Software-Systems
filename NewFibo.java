import java.math.BigInteger;

public class NewFibo {		
	
	public static BigInteger fiboIterative(int n) {
		if(n<=1) {
			return new BigInteger("1");
		}
		BigInteger fib= new BigInteger("1");
		BigInteger prevFib=new BigInteger("1");
		
		for(int i=2; i<n; i++) {
			BigInteger temp=fib;
			fib=fib.add(prevFib);
			prevFib=temp;
		}
		return fib;
	}
	
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		long startTime=System.nanoTime();	
		BigInteger f=fiboIterative(n);
		long endTime=System.nanoTime();		
		System.out.println("It took "+(endTime-startTime)+ " ns to calculate fibo (" +n+ ") = "+f);
	}
}
