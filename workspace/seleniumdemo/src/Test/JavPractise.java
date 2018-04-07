package Test;

import java.util.Scanner;

public class JavPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JavAddSub obj = new JavAddSub();//inheritance inhetis the another class here by creating object
		/*   obj.add(2, 2);
		
		
		
		Scanner sc = new Scanner(System.in);//scanner class is used to get values from user
		System.out.println("Enter two integer values values");
		
		int x= sc.nextInt(); // nextint or nextlong etc to get values from user
		int y =sc.nextInt();
				
		
		obj.add(x, y);
		
		
		System.out.println("Enter two double values");
		double x1= sc.nextDouble();
		double y1 =sc.nextDouble();
		
		obj.add(x1, y1);   */	
		
		
		Scanner sc = new Scanner(System.in);//scanner class is used to get values from user
		System.out.println("Enter two integer values values");
		int x= sc.nextInt(); 
		int y =sc.nextInt();
		
		
		int l = obj.add(10, 10);
		int m = obj.sub(l, 5);
		int o = obj.mul(l, m);
		int p = obj.div(o, 1);
		
	}
}
