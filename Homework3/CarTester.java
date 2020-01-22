//R3.18 tester class which gas is added to the car
//the car is driven then more gas is added to the car
//then the car is driven again
//print the actual and expected amount of gas in the tank
public class CarTester {
	public static void main(String[] args) {
		Car myCar=new Car(30); //30mpg
		myCar.addGas(20); //tank has 20 gallons. can drive 600 miles
		myCar.drive(150); //drive 150 miles. 5 gal used. 450 miles left in tank
		myCar.addGas(10); //adds 10 gallons to tank. 750 miles left in tank
		myCar.drive(180); //drive 100 more miles. 6 gal used. 650 miles left in tank
 		myCar.getGasInTank(); //returns amount of gas in tank. expect about 21.6gal in tank
 		System.out.println("Expected: 19 gallons");
	}
}
