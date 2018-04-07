package Test;

import java.util.ArrayList;
import java.util.List;

public class JavAddSub {
	
	
	public int add(int x,int y) //return type change, sothat we can use this out put value in some where, bcoz void returns null value
	{
		int z= x+y;
		System.out.println("the addition is" +z);
		return z;
	}

	public int sub(int x,int y)
	{
		int z= x-y;
		System.out.println(z);
		return z;
	}
	public int mul(int x,int y)
	{
		int z= x*y;
		System.out.println(z);
		return z;
	}
	public int div(int x,int y)
	{
		int z= x/y;
		System.out.println(z);
		return z;
	}

    public void add(double x, double y)//method ovr loading - polymorphism, same method but different data types or diiferenrt arguments
    
    {
    double z = x+y;
    
    System.out.println(z);
    }
    
   // Interfac_Calculater inter = new Interfac_scientificcal();
  //  List<String> arrayExample = new ArrayList<>();
    
    
    
    
}


