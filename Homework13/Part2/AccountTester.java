import java.io.*;
import java.util.*;

public class AccountTester {
	
	public AccountTester() { }
	
	public static void main(String[] args) {
		Accounts[] accounts = new Accounts[3];
		accounts[0] = new Accounts(0);
		accounts[1] = new Accounts(16000);
		accounts[2] = new Accounts(4000);
		Arrays.sort(accounts, Comparator.comparing((Accounts a) -> a.balance));
		System.out.println(Arrays.toString(accounts));	
				

}
}
