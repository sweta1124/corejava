
public class constructor {

	String name;
	int roll;

	public constructor(String name, int roll) {
		// TODO Auto-generated constructor stub
			this.name=name;
			this.roll=roll;
		}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		{
			// TODO Auto-generated method stub
			constructor s1=new constructor("Ankit",1);
			constructor s2= new constructor("Mohon",2);
			
			
			
			System.out.println(s1.name+" "+s1.roll);
			System.out.println(s2.name+" "+s2.roll);

		}

	} 
}
	