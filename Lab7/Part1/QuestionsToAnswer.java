
//Throughout this assignment, my QuestionsToAnswer replaces Alpha

public class QuestionsToAnswer {
	
	//#1
	//The output is 1 1 2 2 3 3 because int a and b
	//start at 0, then alpha.fun calls the method fun
	//which adds 1 to both a and b, updating them in the
	//process. It is then called again and adds 1 again,
	//making a and b both equal 2, then adds 1 again
	//to make them both equal 3. There are spaces between
	//each integer because they are made strings by adding
	//" " and integers
//	  int a = 0;
//	  int b = 0;
//	  void fun() {
//	    b += 1;
//	    a += 1;
//	    System.out.print(a + " " + b + " ");
//	  }
//	  public static void main(String[] args) {
//	    QuestionsToAnswer alpha = new QuestionsToAnswer();
//	    alpha.fun();
//	    alpha.fun();
//	    alpha.fun();
//	  }
	
	//#2
	//The output is 1 1 1 1 2 2 because alpha is one instance
	//of the QuestionsToAnswer class and beta is a separate 
	//instance. So calling alpha.fun the first time increments
	//a and b by 1, then beta is a separate instance, meaning
	//it uses the original code to build on. Therefore, calling
	//beta.fun makes a and b equal 1, even though alpha also
	//previously incremented them by 1, since b is a separate
	//instance. Then, calling alpha.fun again builds on the previous
	//alpha instance, making a and b equal 2
//	  int a = 0;
//	  int b = 0;
//	  void fun() {
//	    b += 1;
//	    a += 1;
//	    System.out.print(a + " " + b + " ");
//	  }
//	  public static void main(String[] args) {
//	    QuestionsToAnswer alpha = new QuestionsToAnswer();
//	    QuestionsToAnswer beta = new QuestionsToAnswer();
//	    alpha.fun();
//	    beta.fun();
//	    alpha.fun();
//	  }
	
	//#3
	//The output is 1 1 1 2 2 3 because alpha.fun is called and 
	//adds 1 to both a and b. Then, beta.fun is called. int a is
	//set back to 0, because this is a new instance, however int b
	//is static, meaning it belongs to the class, not any object. 
	//Therefore, b is 1 from the previous class call, making it 2 
	//since 1+1=2. Finally, alpha.fun is called again. For the alpha
	//object, a is 1 and the static int b is 2, therefore, the fun
	//method makes a equal 2 and b equal 3
//	  int a = 0;
//	  static int b = 0;
//	  void fun() {
//	    b += 1;
//	    a += 1;
//	    System.out.print(a + " " + b + " ");
//	  }
//	  public static void main(String[] args) {
//		QuestionsToAnswer alpha = new QuestionsToAnswer();
//		QuestionsToAnswer beta = new QuestionsToAnswer();
//	    alpha.fun();
//	    beta.fun();
//	    alpha.fun();
//	  }
	  
	//#4
	//A. The program does not compile because in assigning alpha
	//it called the class with QuestionsToAnswer(int), which
	//does not work because the constructor does not accept
	//parameters, therefore it does not compile
//	  int value;
//	  QuestionsToAnswer () {
//	    value = 3;
//	  }
//	  public static void main(String[] args) {
//		QuestionsToAnswer alpha = new QuestionsToAnswer(3);
//		QuestionsToAnswer beta = new QuestionsToAnswer();
//	    System.out.println(alpha.value + " " + beta.value);
//	  }
	
	//#5
	//C. The program runs and outputs 3 0 because alpha is 
	//assigned the constructor without parameters, therefore
	//alpha.value is assigned to 3 in the body of the QuestionsToAnswer()
	//constructor. Then, beta calls the constructor with the int v
	//parameter. Then, when printing beta.value it looks to the body of the
	//QuestionsToAnswer(int v) constructor, which assigns value to equal 0
//	  int value;
//	  QuestionsToAnswer (int v) {
//	    value = 0;
//	  }
//	  QuestionsToAnswer () {
//	    value = 3;
//	  }
//	  public static void main(String[] args) {
//		QuestionsToAnswer alpha = new QuestionsToAnswer();
//		QuestionsToAnswer beta = new QuestionsToAnswer(3);
//	    System.out.println(alpha.value + " " + beta.value);
//	  }
	  
	  //#6
	  //E. The program runs and outputs 3 3 because the value variable is 
	//assigned to be static. When alpha calls QuestionsToAnswer(0), it sets
	//the static int value to equal 0. Then, when beta calls QuestionsToAnswer(3), it
	//sets the value to be 3 for the class overall. Therefore, since we're printing
	//alpha and beta after beta sets the static int value to equal 3, then both values 
	//for alpha and beta are 3
	
//	  static int value;
//	  QuestionsToAnswer (int v) {
//	    value = v;
//	  }
//	  public static void main(String[] args) {
//		QuestionsToAnswer alpha = new QuestionsToAnswer(0);
//		QuestionsToAnswer beta = new QuestionsToAnswer(3);
//	    System.out.println(alpha.value + " " + beta.value);
//	  }
	
	//#7
	//B. The program runs and outputs 0 0 because both alpha and 
	//beta are initialized to be objects of the QuestionsToAnswer class and there is the
	//value variable that is initialized. int variables are set to 0 by default, so 
	//alpha.value and beta.value would both output 0 because value is never updated. It is
	//mostly important to make sure beta didn't change the value variable, since it is called last
	//and since value is static
	
//		  static int value;
//		  public static void main(String[] args) {
//			QuestionsToAnswer alpha = new QuestionsToAnswer();
//			QuestionsToAnswer beta = new QuestionsToAnswer();
//		    System.out.println(alpha.value + " " + beta.value);
//		  }
	
	//#8
	//D. The code does not compile because QuestionsToAnswer doesn't
	//define a no-args constructor. This is a problem because Beta extends QuestionsToAnswer.
	//So, in creating new Beta(), it will not compile since there is not a no-args constructor
	//for it to be passed to
	
//	 public static void main(String[] args) {
//		    Beta f = new Beta();
//		  }
//		  QuestionsToAnswer(int i) {  }
//		}
//	class Beta extends QuestionsToAnswer { }
	
	//#9
	//This will not compile because the QuestionsToAnswer class does
	//not have a constructor with no arguments.
	//Since Java implicitly inserts the call super() into the Beta(int i)
	//constructor, it causes a compilation error because the superclass
	//QuestionsToAnswer does not have a constructor that takes no args.
	//To fix this, you could insert <super(5);> under the Beta constructor
	//so it doesn't implicitly call this non-existent superclass constructor.
	//Or, you could add a QuestionsToAnswer(){} constructor
	
//	 public static void main(String[] args) {
//		    Beta f = new Beta(3);
//		  }
//	 QuestionsToAnswer(int i) {  }
//		}
//	class Beta extends QuestionsToAnswer { 
//		Beta(int i) {
//		
//		}
//	}
	
	
	
	//#10
	//This compiles and the output is 0 because there is no statement in the
	//Beta(int i) constructor that specifically calls the superclass constructor. Therefore,
	//Java implicitly inserts super(), pointing to the constructor that prints
	//0. The Beta() constructor is irrelevant because the new Beta object is calling
	//the constructor with an int, which points to QuestionsToAnswer().
	
//	  public static void main(String[] args) {
//		    Beta f = new Beta(3);
//		  }
//		  QuestionsToAnswer() { System.out.println(0); }
//		  QuestionsToAnswer(int i) {
//		    System.out.println(i);
//		  }
//		}
//		class Beta extends QuestionsToAnswer {
//		  Beta()      { }
//		  Beta(int i) { }
//		}
	
	//#11
	//The output is 6. Creating the new Beta(3) object points it to the Beta(int i)
	//constructor. This constructor uses the this() syntax to point to the 
	//Beta() constructor. The Beta() constructor then calls super(6), which points
	//to QuestionsToAnswer(int i), which prints i, which is 6.
	
//	  public static void main(String[] args) {
//		    Beta f = new Beta(3);
//		  }
//		  QuestionsToAnswer() {
//		    System.out.println(0);
//		  }
//		  QuestionsToAnswer(int i) {
//		    System.out.println(i);
//		  }
//		}
//		class Beta extends QuestionsToAnswer {
//		  Beta() {
//		    super(6);
//		  }
//		  Beta(int i) {
//		    this();
//		  }
//		}
	
	//#12
	//This does not compile because Java is confused by the use of super(3)
	//and this() in the same constructor. They are pointing to different places. 
	//Creating new Beta(3) points to the Beta(int i) constructor.
	//The Beta(int i) constructor explicitly calls super(3), pointing to 
	//QuestionsToAnswer(int i). However, the following line is this(), which implies
	//that we need to go to the Beta() constructor to access the super() class. 
	//Since we already called the super(3) constructor, there is a compiling error.
	//**dont use super() and this() in the same constructor!!
	
//	  public static void main(String[] args) {
//		    Beta f = new Beta(3);
//		  }
//		  QuestionsToAnswer() {
//		    System.out.println(0);
//		  }
//		  QuestionsToAnswer(int i) {
//		    System.out.println(i);
//		  }
//		}
//		class Beta extends QuestionsToAnswer {
//		  Beta() {
//		    super(6);
//		  }
//		  Beta(int i) {
//		    super(3);
//		    this();
//		  }
//		}
	
	//*#13
	//This compiles and the output is 03. Creating the new Beta(12) points to the 
	//Beta(int i) constructor. The first line in the Beta(int i) constructor is
	//this(), which points to the Beta() constructor. The Beta() constructor has 
	//an implicit super() call, which points to QuestionsToAnswer(), which prints
	//0. It then goes back to finish the body of the Beta(int i) constructor,
	//which prints 3, creating an output of 03.
	
//	  public static void main(String[] args) {
//		    Beta f = new Beta(12);
//		  }
//		  QuestionsToAnswer() {
//		    System.out.print(0);
//		  }
//		  QuestionsToAnswer(int i) {
//		    System.out.print(i);
//		  }
//		}
//		class Beta extends QuestionsToAnswer {
//		  Beta() {
//		  }
//		  Beta(int i) {
//		    this();
//		    System.out.print(3);
//		  }
//		}
	
	//#14
	//This compiles and the output is 4. Creating a new Beta() object points to the 
	//implicit Beta() constructor. This has an implicit super(), which calls the 
	//implicit QuestionsToAnswer() constructor. There is an implicit super() constructor
	//within this, which points to the Object() constructor, which creates a new object. 
	//of type Beta. This then carries out the line 
	//printing f.test(3). Since f is a Beta object, it calls the String test(int i) 
	//in the Beta class, which adds 3+1, giving the output 4.
	
//	  public static void main(String[] args) {
//		    QuestionsToAnswer f = new Beta();
//		    System.out.println(f.test(3));
//		  }
//		  String test(int i) {
//		    return (i + 2) + " ";
//		  }
//		}
//		class Beta extends QuestionsToAnswer {
//		  String test(int i) {
//		    return (i + 1) + " ";
//		  }
//		  String test(long i) {
//		    return i + " ";
//		  }
//		}
	
	//#15
	//This does not compile because Beta extends QuestionsToAnswer. Therefore, you cannot
	//assign a Beta object to be a new QuestionsToAnswer because QuestionsToAnswer is 
	//the superclass. An object of type Beta is an extension of QuestionsToAnswer, meaning
	//Beta may have characteristics that objects of QuestionsToAnswer do not. Therefore,
	//you cannot convert from QuestionsToAnswer to Beta.
	
//	  public static void main(String[] args) {
//		    Beta f = new QuestionsToAnswer();
//		    System.out.println(f.test(3));
//		  }
//		  String test(int i) {
//		    return (i + 2) + " ";
//		  }
//		}
//		class Beta extends QuestionsToAnswer {
//		  String test(int i) {
//		    return (i + 1) + " ";
//		  }
//		}
	
	//#16
	//The output is 5. This is because f is a new QuestionsToAnswer object.
	//Therefore, calling f.test(3) points to the method String test(int i) 
	//within the QuestionsToAnswer class, therefore, returning 3+2, 
	//which prints 5. 
	
//	  public static void main(String[] args) {
//		    QuestionsToAnswer f = new QuestionsToAnswer();
//		    System.out.println(f.test(3));
//		  }
//		  String test(int i) {
//		    return (i + 2) + " ";
//		  }
//		}
//		class Beta extends QuestionsToAnswer {
//		  String test(int i) {
//		    return (i + 1) + " ";
//		  }
//		}
	
	//#17
	//This will not compile because test(3) is in a static reference that is
	//referencing a non-static method since String test(int i) is non-static. 
	//Therefore, this is an error because it's attempting
	//to call test(3) without any objects. test(int i) is a method of the QuestionsToAnswer
	//class, which is only available when you have an instance of the QuestionsToAnswer
	//class (or an instance of the subclass extension). Making test (int i) static
	//would allow the test to run, because static would mean it does not need and
	//object of the QuestionsToAnswer class to run the body
	
//	  public static void main(String[] args) {
//		    Beta f = new Beta();
//		    System.out.println(test(3));
//	  }
//		  String test(int i) {
//		    return (i + 2) + " ";
//		  
//	  }
//		}
//		class Beta extends QuestionsToAnswer {
//		  String test(int i) {
//		    return (i + 1) + " ";
//		  }
//		}
	
	//#18
	//This prints 2011 because it creates a new Beta(2011). This calls the
	//constructor Beta (int value), which runs the body super(value). This
	//calls QuestionsToAnswer(int value) with the value of 2011. this.value 
	//assigns the local variable value (2011) to the value instance variable
	//Then, the local value variable is printed.
	
//		  int value;
//		  QuestionsToAnswer (int value) {
//		    this.value = value;
//		    System.out.println(value);
//		  }
//		  public static void main(String[] args) {
//		    Beta f = new Beta(2011);
//		  }
//		}
//		class Beta extends QuestionsToAnswer {
//		  Beta  (int value) { super(value); }
//		}
	
	//#19
	//This prints "... won't compile" because it runs the main(String[] args)
	//method but main() will not run because the class needs the special main
	//method with specific parameters to take in in order for it to run from 
	//JVM. So, Java automatically runs the main(String[] args) method but not
	//the main() method. It would need to be called. 
	
//		  public static void main(String[] args) {
//		    System.out.println("... won't compile");
//		  }
//		  public static void main() {
//		    System.out.println("... will not run");
//		  }
//		}
	
	//#20
	//This will not compile because abstract void complain() needs to be defined
	//by an abstract class. QuestionsToAnswer is not abstract. Therefore, this
	//will not compile because you could create an object of the QuestionsToAnswers
	//class but you wouldn't be able to call the complain method
	
//	  abstract void complain();
//	}
//	class Beta extends QuestionsToAnswer {
//	  void complain(String s) {
//	    System.out.println(s);
//	  }
//	}
//	class Tester {
//	  public static void main(String[] args) {
//	    Beta f = new Beta();
//	    f.complain("There's a tomato in every automaton.");
//	  }
//	}
	
	//#21
	//This will not compile because the implicit super constructor 
	//QuestionsToAnswer() is undefined. The code creates a new Beta("Greetings")
	//which points to the Beta(String msg) constructor. There is no
	//explicit super constructor, so the implicit super() is applied.
	//However, the only constructor of QuestionsToAnswer takes in 
	//a String. Since this constructor has been defined, Java will not
	//apply the implicit QuestionsToAnswer() constructor, therefore,
	//super() is pointing to a method that does not exist. 
	
//	  String message;
//	  QuestionsToAnswer (String msg) { message = msg; }
//	}
//	class Beta extends QuestionsToAnswer {
//	  Beta (String msg)  { message = msg; }
//	}
//	class Tester {
//	  public static void main(String[] args) {
//	    Beta f = new Beta("Greetings");
//	    System.out.println(f.message);
//	  }
//	}
	
	//#22
	//This code will compile and run. Since Kohlrabi extends Cabbage,
	//it is okay to create a new Kohlrabi based on a Cabbage object. 
	//This is because Cabbage is basically a base for Kohlrabi to build
	//on, so Cabbage will not have characteristics that have not already
	//been passed on Kohlrabi.
	
//class Vegetable { } 
//class Cabbage extends Vegetable { }
//class Kohlrabi extends Cabbage { } 
//class Kroger {
//  public static void main(String[] args) {
//    Cabbage a = new Kohlrabi(); 
//  }
//}
	
	//#23
	//This will not compile because you cannot create a new Vegetable based
	//on a Kohlrabi object. This is because Kohlrabi is an extension of an
	//extension of Vegetable. Therefore, Kohlrabi may have characteristics that
	//Vegetable does not. So, you cannot create a new Vegetable object based 
	//on a Kohlrabi object because Vegetable is a superclass of a superclass of
	//Kohlrabi

//class Vegetable { } 
//class Cabbage extends Vegetable { }
//class Kohlrabi extends Cabbage { } 
//class Kroger {
//  public static void main(String[] args) {
//    Kohlrabi a = new Vegetable(); 
//  }
//}

}

