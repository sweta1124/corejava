package Demo;

//here i am implemented the different types of operator.
public class Operators {

	public static void main(String[] args) {
		
		// Declaring the int datatype for operation.
		
				int num1 = 10, num2 = 2;
				int result = num1 + num2;
				int result1 = num1 - num2;
				int num3 = 3;
				int result2 = num2 * num2;
				
				// Declaring the float datatype and also with typecasting to convert int to float.
				float result3 = (float)num1/num3;
				
				//Printing the output of opreations on console.
				System.out.println("===========================================");
				System.out.println("Result of addition operator: "+result);
				System.out.println("Result of subtraction operator: "+result1);
				System.out.println("Result of multipication operator: "+result2);
				System.out.println("Result of division operator: "+result3);
				System.out.println("===========================================");
				
				int result4;
				System.out.println("===========================================");
				result4 = num2 % num3; // modulus means remainder of division operation.
				System.out.println("Result of Modulus operator: "+result4);
				System.out.println("Result of Modulus operator: "+44432%55);
				System.out.println("===========================================");
				
				// ADD and SUB assignment operation
				System.out.println("Add assignment: "+(num1+=num2)); // i.e.. num1 = num1 + num2
				System.out.println("Sub assignment: "+(num1-=num2)); // i.e.. num1 = num1 - num2
				System.out.println("Mul assignment: "+(num1*=num2)); // i.e.. num1 = num1 * num2
				System.out.println("Div assignment: "+(num1/=num2)); // i.e.. num1 = num1/num2
				System.out.println("===========================================");
				
				// Increment and decrement operator
				// Inc and dec a single value
				int num4 = 8;
				num4++; // i.e.. num4 = num4 + 1
				System.out.println(" Inc a single value: " +num4);
				num4--; // i.e.. num4 = num4 - 1
				System.out.println(" Inc a single value: " +num4);
				System.out.println("==================Pre Inc and dec=========================");
				
				// Pre-increment/decrement and post-increment/decrement
				int m = 3, n = 5;
				System.out.println("m: "+m+" ,n: "+n);
				
				//pre-inc-drc
				System.out.println("Before pre-inc operation on m: "+m+" ,n: "+n);
				m = ++n;
				System.out.println("After pre-inc operation on m: "+m+" ,n: "+n);
				System.out.println("Before pre-dec operation on m: "+m+" ,n: "+n);
				m = --n;
				System.out.println("After pre-dec operation on m: "+m+" ,n: "+n);
				
				
				System.out.println("==================Post Inc and Dec=========================");
				int a = 4, b = 6;
				System.out.println("a: "+a+" ,b: "+b);
				System.out.println("Before post-inc operation on a: "+a+" ,b: "+b);
				a = b++;
				System.out.println("After post-inc operation on a: "+a+" ,n: "+b);
				System.out.println("Before post-dec operation on a: "+a+" ,b: "+b);
				a = b--;
				System.out.println("After post-dec operation on a: "+a+" ,n: "+b);
				int ab=12, ba = 8;
				ba=ab--;
				System.out.println("-->ab: "+ab+", ba: "+ba);
				System.out.println("Modulus Assigment");
				System.out.println(ab%=ba);

	}

}
