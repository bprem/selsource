package ifpro;

public class ifpro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int marks = 600;
		
		if (marks == 50)
		{
			System.out.println(" just Pass");
		}
		
		else if (marks < 50) {
			
			System.out.println("pass");
		}	
		else if(marks>50 &&  marks<60)
			{
			System.out.println("avaerage");	
			}
		else if(marks>=60 && marks<70)
		{
			
		System.out.println("good");
		}
		
		else if (marks>=70 && marks<80)
		{
			System.out.println("Best");
		}
		else if(marks>=80 && marks<90)
		{
			System.out.println("Excellent");
		}
		else if (marks>=90 && marks<=100)
		{
			System.out.println("Distinction");
		}
	
		else 
		{
			System.out.println("Invalid marks");
		}
	}
	

}
