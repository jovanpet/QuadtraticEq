

/*Quadric.java
 * Finds x1 and x2 of a quadratic function
 * 
 */



public class Project2 {

	public static void main(String[] args) {
		
		System.out.print("Input:\n" + "a=");
		double a=TextIO.getDouble();
		System.out.println();
		
		System.out.print("b=");
		double b=TextIO.getDouble();
		System.out.println();
		
		System.out.print("c=");
		double c= TextIO.getDouble();
		System.out.println();
		
		double d=b*b-4*a*c; //finding D
		double x1,x2;
		
		if(a==0 && b==0 && c==0) //case if 0=0
		{
			System.out.printf("Try other a,b and c");
		}
		else if(a==0 && b==0) //c=0
		{
			System.out.printf("Try other a,b and c");
		}
		else if(a==0) //case b*x + c=0
		{
			System.out.printf("x = %.2f",(-c)/b);
		}
		else 
		{	
			if(d<0) //if D is smaller than 0
			{
				System.out.print("There are no real roots");
			}
			else if(d>=0)
			{
				x1=(-b+Math.sqrt(d))/(2*a); //getting x1
				x2=(-b-Math.sqrt(d))/(2*a); //getting x2
			
				System.out.printf("x1 = %.2f, x2 = %.2f",x1,x2);
			}
		}
	}//main

}//Project2
