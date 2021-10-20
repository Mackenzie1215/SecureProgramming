/* First issue - CORRECTED
NUM04-J. Do not use floating-point numbers if precise computation is required

https://wiki.sei.cmu.edu/confluence/display/java/OBJ10-J
.+Do+not+use+public+static+nonfinal+fields
*/

public class javatest{
    public static void main(String args[]) {

	int dollar = 100;
	int nickels = 5;
	int number = 17;

	System.out.println(
 	 "A dollar less " + number + " dimes is $0." + (dollar - number * nickels)
	);
    


/*Second issue - CORRECTED
DCL50-J. Use visually distinct identifiers

https://wiki.sei.cmu.edu/confluence/display/java/DCL50-J.
+Use+visually+distinct+identifiers
*/


	int two = 2;
	int one = 1;

	System.out.println("\nstubs = " + two);

	System.out.println("stub = " + one);



/*third issue - CORRECTED
DCL53-J. Minimize the scope of variables

https://wiki.sei.cmu.edu/confluence/display/java/DCL53-J.
+Minimize+the+scope+of+variables
*/

	//int i = 0;
	for (int i=0; i<25; i++) {
		System.out.println(i);

	}
}
}