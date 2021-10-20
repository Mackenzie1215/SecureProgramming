/* First issue  NUM04-J. Do not use floating-point numbers 
   if precise computation is required 

https://wiki.sei.cmu.edu/confluence/display/java/OBJ10-J
.+Do+not+use+public+static+nonfinal+fields
*/

public class javatest{
    public static void main(String args[]) {

	double dollar = 1.00;
	double nickels = 0.05;
	int number = 17;

	System.out.println(
 	 "A dollar less " + number + " dimes is $" + (dollar - number * nickels) 
	);
    


/*Second issue
DCL50-J. Use visually distinct identifiers

https://wiki.sei.cmu.edu/confluence/display/java/DCL50-J.
+Use+visually+distinct+identifiers
*/


	int stubs = 2;
	int stub = 1;

	System.out.println("\nstubs = " + stubs);

	System.out.println("stub = " + stub);



/*third issue
DCL53-J. Minimize the scope of variables

https://wiki.sei.cmu.edu/confluence/display/java/DCL53-J.
+Minimize+the+scope+of+variables
*/

	int i = 0;
	for (i=0; i<25; i++) {
		System.out.println(i);

	}
}
}