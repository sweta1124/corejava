import java.io.*;
public class righttraingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	     int a, b; 



	     // outer loop to handle number of rows 

	     // k in this case 

	     for (a = 0; a < n; a++) { 



	         // inner loop to handle number of columns 

	         // values changing acc. to outer loop 

	         for (b = 0; b <= a; b++) { 

	             // printing stars 

	             System.out.print("* "); 

	         } 



	         // end-line 

	         System.out.println(); 

	     } 

	 } 



	 // Driver Function 

	 public static void main(String args[]) 

	 { 

	     int k = 5; 

	     StarRightTriangle(k); 
	}

}
