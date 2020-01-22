//E19.8 write a program that sorts an array of
//bank accounts by increasing balance
//pass an appropriate lambda expression to Arrays.sort
public class Accounts {
	double balance;
	public Accounts () {
		balance = 0;
	}
	
	public Accounts (double balance) {
		this.balance = balance;		
		
	}	
	public String toString() {
		return this.balance + " ";
	}
}
