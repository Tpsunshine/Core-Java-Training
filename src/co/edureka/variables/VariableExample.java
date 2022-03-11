/*Java Program demonstrating Local Variable
 * Author: Thabo Pitso
 * Date: 2022/03/11
 */

package co.edureka.variables;

public class VariableExample {
	//instance variable
	public String myVar = "instance variable";
	
	public void myMethod() {
		//local variable
		String myVar = "Inside Method";
		System.out.println(myVar);
	}

	public static void main(String[] args) {
		// Creating an Object
		VariableExample obj = new VariableExample();
		
		
		/*We are calling the method that changes the value
		 * of myVar. We are displaying myVar again after the method call,
		 * to demonstrate that local variable scope is limited to the method itself.
		 */
		System.out.println("Calling the Method");
		obj.myMethod();
		System.out.println(obj.myVar);
		

	}

}
