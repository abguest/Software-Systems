//Test R3.17
public class CounterUnitTest {
	public static void main(String[] args) {

			Counter test=new Counter();
			test.click();
			int result1=test.getValue();
			System.out.println(result1);
			test.click();
			int result2=test.getValue();
			System.out.println(result2);
	}
}
