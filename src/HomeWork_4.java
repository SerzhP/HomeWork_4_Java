public class HomeWork_4 {
    public static void main(String[] args) {


//        1.
/**• Create an interface with 1 method.
 • Implement the interface and do something with the method.*/
//Driver driver = new Driver();
//driver.drive();

//new Driver().drive();
//        2.
/**• Create an abstract class with 1 method.
 • Extend the abstract class and do something with the
 implemented method.*/
//new Builder().work();


//        3.
/**• What will be the result of the following code:

 Compilation error - Abstract class can not be instantiated
 */

//        abstract class AbstractClass {
//            void concreteMethod() { // concrete methods are still allowed in abstract classes
//                System.out.println("This is a concrete method.");
//            }
//        }
//
//        public class Main {
//            public static void main() {
//                AbstractClass class = new AbstractClass();
//            }
//        }


//        4.
/**• Create an abstract class and declare it final class
 • Add an abstract method to class
 • What will be the result and why?

 Compilation error - Abstract class can not be decalared final
 */

//         5.
/**        Write a program with two classes:
 • Create a class named Ball
 • Declare a static final boolean called “isRound” with true
 value.
 • Print the variable value from Main.class
 • Try to change the value from Main.class*/
//Ball ball = new Ball();
//ball.printVariable();


//       new Ball().printVariable();


//         6.
/**        What is the issue with the following code:
 public static void test(){
 static int x = 3;
 }

 In Java, local variables inside methods cannot be declared as static.
 static modifier can't be used inside a method
 */

//         7.
/**        Write a program with the following:
 • Create a class “Pony” that extends class Horse.
 • Add to “Pony” class another method called bite() which prints
 “yamm”.*/

//Horse myPony = new Pony();
//myPony.bite();


//         8.
/**• Create a class WhitePony that extends Pony class.
 • Create a method that return the Pony color (White).
 • In your main program, create an object of WhitePony class,
 call bite() method and print the pony color.*/

//WhitePony ponyWhite = new WhitePony();
//ponyWhite.bite();
//        System.out.println(ponyWhite.getPonyColor());


//         9.
/**        When should we call garbage collection?
 The Garbage Collection can not be forced explicitly!
 The most we can do is request JVM for garbage collection by calling
 System.gc() method, But This does not guarantee that JVM will perform the
 garbage collection.
 * */

//         10.

/**        public class Cow extends Animal implements Inter

 Cow is an instance of:
 A. Cow
 B. Animal
 C. Inter
 D. All the above.

 D - All

 */
    }
}