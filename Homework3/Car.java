//E3.12 from pic book
public class Car {
	
	int updatedFuel=0;
	int myMpg;
	
	/**
	 * initialize the car fuel efficiency
	 * @param mpg
	 */
	public Car(int mpg) {
		this.myMpg=mpg;
	}
	
	/**
	 * add gasoline to fuel tank
	 */
	public void addGas(int n) {
		this.updatedFuel+=n;
	}
	
	/**
	 * simulates driving car a distance then reducing amount of gas
	 * in the tank
	 * @param miles for miles driven
	 */
	public void drive(int miles) {
		this.updatedFuel-=miles/this.myMpg;
	}
	
	/**
	 * return the current amount of gas in fuel tank
	 */
	public int getGasInTank() {
		System.out.println("The actual fuel left in the car is "+updatedFuel+" gallons");
		return updatedFuel;
	}
	

}
