#Chapter 10 Notes
-Methods in Math() are private and have no instance variables, can't make instance of Math()
-static lets a method run without any instance of the class
	-"Behavior not dependent on an instance variable, so no instance/object is required. Just the class."
-impossible to instantiate an abstract class (reminder)
-Static method doesn't know which instance variable value to use. (CAN'T USE NON-STATIC[instance] VARIABLES)
-Static methods CAN'T USE NON-STATIC METHODS!
-making instance variables static makes the value same for all instances of that variable in the class
	-EX: class Duck {
		private int size;
		private static int duckCount = 0; <--- initialized when class is loaded
		
		public Duck() {
		duckCount++ <------- duckCount will now increment everytime it runs
		}

	-Further explanation: object doesn't keep it's own copy of duckCount. Since duckCount is now static, all Duck objects share a single copy of it. STATIC VARIABLES LIVE IN THE CLASS AND NOT THE OBJECT
	-instance variables: 1 per instance
	-static variables: 1 per class
-final can be used to modify non-static variables too.
	-instance variables, local variables, method parameters (value can't b changed)
	-final variable = can't change var value
	-final method = can't @override the method
	-final class = can't extend the class (make a subclass)
-Quick points:
	-static method good for util methods
	-static method associated with class, cannot even access instance/doesn't know
	-static method can access static variable
	-constant in java = static and final
	-static initializer: static{
				DOG_CODE = 420;
			     }
	-make all constants (final values) UPPERCASE
-Math.random() - returns double between 0.0 - 1.0 (not including 1.0)
-Math.abs() - returns double that is the absolute value of the argument. Method is overloaded so if you pass it an int, it returns an int. Pass double it returns double
-Math.round() - returns int/long rounded to the nearest int/long value.
-Math.min() - Returns value that is min of the two args. Method overloaded to take ints,longs,float,double
-Math.max() - Same as above, but max of two.

-Wrapping:
	-Wrapper class for every primitive type:
		-Double double
		-Integer int
		-Byte byte
		-Character char
		-Boolean boolean
		-Short short
		-Long long
		-Float float
	-Used to treat primitive types as objects.
-Wrappers have some static methods:
	-Integer.parseInt()
	-Double.parseDouble()
	-Boolean("true").booleanValue()
-how to use format("%,.2f",123123.123) % <-- represents formatter to insert the argument, "," indicates value should have commas, ".2" indicates it hsould have only 2 decimal places, "f" represents value should be a float
- Format specifier (%) --> %[argument number][flags][width][.precision]type
	-type is the only required specifier
	-can do time as well with %tc, %tr, [%tA, %tB, %tC] <--- altogether
-java.util.Calendar for data manipulation (refer to a reference, this is very specific info)
-Can do static imports:
	ex:
	import static java.lang.System.out;
	import static java.lang.Math.*;
	class WithStatic {
		public static void main(String[] args){
		out.println(sqrt(2.0));
		out.println(tan(60));
		}
	}