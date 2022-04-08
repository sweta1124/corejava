
public class constructor2 {

	String name;
	int roll;

	public constructor2(String name, int roll) {
		// TODO Auto-generated constructor stub
			this.name=name;
			this.roll=roll;
		}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		{
			// TODO Auto-generated method stub
			constructor2 s1=new constructor2("Ankit",1);
			constructor2 s2= new constructor2("Mohon",2);
			
			
			
			System.out.println(s1.name+" "+s1.roll);
			System.out.println(s2.name+" "+s2.roll);

		}

	} 
}
	