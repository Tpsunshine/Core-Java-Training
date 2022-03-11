/*Java Program to demonstrate Instance Variable
 * Author: Thabo Pitso
 * Date: 2022/03/11
 */

package co.edureka.variables;

public class InstanceVarExample {
	String myInstanceVar = "instance variable";

	public static void main(String[] args) {
		
		InstanceVarExample obj = new InstanceVarExample();
		InstanceVarExample obj2 = new InstanceVarExample();
		InstanceVarExample obj3 = new InstanceVarExample();
		
		System.out.println(obj.myInstanceVar);
		System.out.println(obj2.myInstanceVar);
		System.out.println(obj3.myInstanceVar);
		
		System.out.println();
		
		obj2.myInstanceVar = "Text Changed";
		
		System.out.println();
		
		System.out.println(obj.myInstanceVar);
		System.out.println(obj2.myInstanceVar);
		System.out.println(obj3.myInstanceVar);
		
		
		

	}

}
