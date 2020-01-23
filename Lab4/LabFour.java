import java.math.BigDecimal;

public class LabFour {
	public static void main(String[] args) {
		
	
		//Question1
		//Guess +---+
		//      |   |
		//		+---+
		System.out.println("+---+\n|   |\n+---+");
		//Answer: I was right. \n gives a line break
		//so the top is +---+ and sides are |   |
		//then the bottom is +---+
		
		//Question2
		//Answer: 
		//BigDecimal a=new BigDecimal ("4.35");
		//BigDecimal b=new BigDecimal("100");
		//System.out.println(a.multiply(b));
		//The doubles and integers need to be strings
		
		//Question3
		//Guess: I think it will print 4
		System.out.println(3-4+5);
		//Answer: I was right. 3-4=-1; -1+5-4
		
		//Question4
		//Guess: -17
		System.out.println(3-4*5);
		//Answer: I was right. 4*5=20 3-20=-17
		
		//Question5
		//Guess: 0
		System.out.println(2/3*4);
		//Answer: I was right because 2/3=0 because it only gives
		//the whole number minus the decimals. So, 0*4=0
		
		//Question6
		//Guess: 1
		System.out.println(2*3/4);
		//Answer: I was right because 2*3=6 and 6/4=1
			
		//Question7
		//Guess: 3
		System.out.println(3%5);
		//Answer: I was right. 5 goes into 3 zero times with 3 leftover
		
		//Question8
		//Guess: -3
		System.out.println(-3%5);
		//Answer: I was right because 5 goes into -3 zero times with -3 leftover
		
		//Question9
		//Guess: 2
		System.out.println(5%3);
		//Answer: I was right. 3 goes into 5 once with 2 leftover
		
		//Question10
		//Guess: 2
		System.out.println(5%-3);
		//Answer: I was right because -3 goes into 5 twice with 2 leftover
		
		//Question11
		//Guess: 3
		System.out.println(3%-5);
		//Answer: I was right because -5 goes into 3 once with 3 leftover
		
		//Question12
		//Guess: 2
		System.out.println(49/17%5);
		//Answer: I was right 49/17=2 and 2%5 is 2 
		//because 5 goes into 2 zero times with 2 leftover
		
		//Question13
		//Guess: 24
		System.out.println(49/(17%5));
		//Answer: I was right because 17%5 is 2 and 49/2 is 24
		
		//Question14
		//Guess: 0
		System.out.println(('a'+'b')%2);
		//Answer: a=97 b=98 97+98=195 195%2 is 1 because there is 1 leftover
		
		//Question15
		//Guess: true
		System.out.println(true||false);
		//Answer: true or false is true
		
		//Question16
		//Guess: false
		System.out.println(! true && false);
		//Answer: ! true is false. false and false is false
		
		//Question17
		//Guess: true
		System.out.println(!(true&&false));
		//Answer: I was right. true and false is false. 
		//Not false is true
		
		//int n=3;
		//Question18
		//Guess: false
		//System.out.println(n>++n);
		//Answer: I was right. 3 is not greater than 4.
		
		//Question19
		//Guess: 0
		//System.out.println(++n-n);
		//Answer: I was right. ++n=4 then n=4 so 4-4=0
		
		//Question20
		//false
		//System.out.println(n++==n++);
		//Answer: I was right because n++ is 3 and the second n++ is 4
		
		
		//Question21
		//Guess: true
		//System.out.println(++n==n++);
		//Answer: I was right because ++n is 4 and n++ is 4 still
		
		//Question22
		//Guess: 3
		//System.out.println(n++);
		//Answer: I was right because n++ returns the old n
		
		//Question23
		//Guess: 4
		//System.out.println(++n);
		//Answer: I was right because ++n adds 1 and returns the new n
		
		//Question24
		//Guess: true
		//System.out.println((n=n++-++n)<0);
		//Answer: I was right because n++ would be 3 then 
		//++n would be 5 so 3-5=-2 which is <0
		
		//Question25
		//Guess: 5
		//System.out.println(n);
		//Answer: I was wrong because n was previously assigned to -2
		
		//Question26
		//Guess: 15
		System.out.println("1"+(2+3));
		//Answer: I was right. It will print 1 then add 2+3=5
		//then concatenate as if both were strings
		
		//Question27
		//Guess: 123
		System.out.println("1"+2+3);
		//Answer: I was right. Since there are not parenthesis
		//it doesn't know to add the integers and 
		//simply prints them like strings
		
		//Question28
		//Guess: 123
		System.out.println(1+"2"+3);
		//Answer: I was right. Since there is a string in the middle
		//it reads the 1 as an integer then sees the string
		//and converts the line to a continuous string
		
		//Question29
		//Guess: 123
		System.out.println(1+2+"3");
		//Answer: It prints 33 and I was wrong. It reads the 1 as an
		//integer then 2 as an integer and knows to add them
		//then it sees the string 3 and concatenates
		
		//Question30
		//Guess: mo
		System.out.println("tomato".charAt(2)-"potato".charAt(5));
		//Answer: I was wrong. The answer is -2 because m=109 and o=111
		//so it reads as "m"-"o"
		
		//Question31
		//Guess: 8
		System.out.println("eggplant".length());
		//Answer: I was right. length returns an integer the 
		//length of the string starting at 1
		
		//Question32
		//Guess: lant
		System.out.println("eggplant".substring("kale".length()));
		//Answer: I was right because kale.length()==4
		//so eggplant.substring(4) indexes starting with 0
		//then gets to "l" and reads the rest of the string
		//since no stop index was given
		
		//Question33
		//Guess: e
		System.out.println("kale".charAt(3));
		//Answer: I was right because charAt(int) gives an index
		//position the returns the character at that position
		
		//Question34
		//Guess: t
		System.out.println("eggplant".substring("eggplant".length()-1));
		//Answer: I was right because eggplant.length-1 is 7 so 
		//eggplant.substring(7) is t because 7 is the index position
		
		//Question35
		//Guess: ean
		System.out.println("beans".substring(1,4)); 
		//Answer: I was right because it starts at index position 1
		//and stops before position 4
		
		//Question36
		//Guess: not a because not a is true
		//boolean a=false;
		//System.out.println(!a==true);
		//Answer: I was right because a had to be assigned false
		//for !a to be true
				
		//Question37
		//Guess: not a 
		//boolean a=false;
		//System.out.println(!a !=false);
		//Answer: I was right because if a is false
		//not a is true and true does not equal false
		
		//Question38
		//Guess: if a is true, it is false
		//if a is false, it is true
		//boolean a=true;
		//boolean a=false;
		//System.out.println(true && !a);
		//Answer: I was right. When a is assigned true the statement
		//is false. When a is assigned false, the statement is true
		
		//Question39
		//Guess: if n equals 3 a will be true. If n is 
		//anything but 3, a will be false
		//int n=3;
		//int n=5;
		//boolean a=false;
		//if (n==3) {
			//a=true;
		//}
		//System.out.println(a);
		//Answer: I was right because when n is assigned 3 
		//a is true and when it's not assigned 3 a is false
		
		//Question40
		//Guess: If n is not 3, it will return false. If n
		//is 3, it will return true
		//int n=3;
//		int n=6;
//		boolean a=false;
//		if (n!=3) {
//			a=false;
//		}
//		else {
//			a=true;
//		}
//		System.out.println(a);
		//Answer: it returns true when n is assigned 3 and false
		//when n is not assigned 3
		
		
		//Question41
		//Guess: if n is a number between 3 and 5, a will be 
		//true. If n is equal to or less than 3 or is equal
		//to or greater than 5, a will be false
//		boolean a=false;
//		//int n=5;
//		int n=4;
//		if (n>3) 
//			if (n<5) 
//				a=true;
//			
//		
//		System.out.println(a);
		//Answer: I was right. Since there are not curly braces, it wont run 
		//more than one statement. However, since there is only one
		//statement, it executes by returning true if n is 
		//between 3 and 5 and false if n<=3 or n>=5
		
		//Question42
		//Guess: a 
//		boolean a=true;
//		int n=0;
//		if (n<0) {
//			a=true;
//		}
//		else {
//			a=(n>1);
//		}
//		System.out.println(a);
		//Answer: I was wrong. It is not a in the case that
		//n==0 or n==1. All other cases, a
		
		//Question43
		//Guess: true
		//int n=43;
		//int n=4;
		//System.out.println(n<5||n>3);
		//Answer: True. If n is less than 5 it will be true. 
		//if n is greater than 3 it will be true, which accounts
		//for all numbers
		
		//Question 44
		//Guess: False
		//int n=4;
		//int n=5;
		//System.out.println(n<3 && n>5);
		//Answer: False. There is no number that satisfies the
		//condition of being less than 3 AND greater than 5
		
		//Question 45
		//No, every while loop cannot be expressed as a for loop 
		//because for loops are bounded and while loops are 
		//unbounded. All for loops can be expressed as while
		//loops, but not vice versa
		
		//Question 46
		//No, the do while loop is appropriate when the body must be executed
		//at least once even if the condition is false in the first 
		//iteration. 
		
		//Question 47
		//Guess: n=1
//		int m=18;
//		int n=10;
//		if (m>10) {
//			if (m>5) {
//				n=1;
//			}
//		}
//		else {
//			n=2;
//		}
//		System.out.println(n);
		//Answer: I was right. n=1 because 18 is greater than 10
		//and is greater than 5
		
		//Question 48
		//Guess: n=10
//		int m=18, n=10;
//		if (m>10)
//			if (m>5)
//				n=1;
//		else
//			n=2;
//		System.out.println(n);
		//Answer: I was wrong. n=1 because m is greater than
		//10 and greater than 5.
		
		//Question 49
		//Guess: n=2
//		int m=18, n=10;
//		if (m<10) {
//			if (m>5)
//				n=1;
//		}
//		else
//			n=2;
//		System.out.println(n);
		//Answer: I was right. n=2 because m is not less than 10.
		//Therefore, it executes the else
		
		//Question 50
		//Guess: n=2
//		int m=18, n=10;
//		if (m<10)
//			if(m>5)
//				n=1;
//		else
//			n=2;
//		System.out.println(n);
		//Answer: n=10. I was wrong. Without the braces, the system
		//pairs the else with the most recent if. Therefore,
		//to execute the else, m needs to first be less than 10.
		//Since m=18, it never enters the if statement(s), therefore,
		//never updating n.
		
		//Question 51
		//**confused In the interactions panel, it is testing to see if
		//the strings are in the same memory location, which they
		//are not. In the second code, it is true because they 
		//are identical and stored in the same memory location
		
		//Question 52
		//This demonstrates the dangling else because due to the lack of
		//braces, the compiler ignores indentation and matches the else
		//with the preceding if. We wanted to group the else with the first
		//if so that if a gpa was <1.5 it would print that the 
		//student was failing
		double gpa=3.0;
		String student="passing";
		if (gpa>=1.5)
			if (gpa<2.0)
				student="on probation";
		else
			student="failing";
		System.out.println(student);
		
	
		
	
	}
}
