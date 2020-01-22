import java.math.BigInteger; 

public class FiboOne {
	
	public static BigInteger fibo(int n) {
		if (n<=1)
			return new BigInteger("1");
		else
			return fibo(n-1).add(fibo(n-2));
	}	
	public static void main(String[] args) {
		long startTime=System.currentTimeMillis();
		int n=Integer.parseInt(args[0]);
		BigInteger f=fibo(n);
		long endTime=System.currentTimeMillis();
		System.out.println("It took "+(endTime-startTime)+ " ms to calculate fibo (" +n+ ") = "+f);

	}
}
