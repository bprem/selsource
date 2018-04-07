package Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

public class CollectionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ArrayList
		
		ArrayList<Integer> al = new ArrayList<>();
		//to add in arraylist
		al.add(123);
		al.add(258);
		al.add(567);
		
		System.out.println(al);
		
		//to delete in arraylist
		
		al.remove(1);
		
		System.out.println(al);
		
		
		
	//add/insert with index
		
		al.add(1,50);
		
		System.out.println(al);
		
		//update
		
		al.set(1,500);
		
		System.out.println(al);
		
		//duplicate values
		
		al.add(123);
		
		System.out.println(al);
		
		//to get value in array
		
		System.out.println(al.get(1));

		
		//for loop with same concept
		
		
		
		for(int i=0; i<al.size(); i++)
			
		{
			System.out.println(al.get(i));
		}
		
		
		//same concept with advanced for loop
		
		for(Integer a : al)
		{
			System.out.println(a);
		}
		
		
		//same concept with while:
		int i =0;
		
		while (i<al.size())
	
		{
			System.out.println(al.get(i));
			i++;
		}
		
		System.out.println("-----------------------------------------");
		
		//Itereater
		
		Iterator<Integer>  itr = al.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("-----------------------------------------");
		
		//Treeset
		
		//tree set will sort according to ascending
		
		TreeSet<String> Ts = new TreeSet<>();
		
		
		Ts.add("Lux");
		Ts.add("Hamam");
		Ts.add("Cinthol");
		
		Ts.add("Lux");
		
		
		System.out.println(Ts);
		
		
		//hashmap
		//Key Value concept 
		// no duplicate values
		HashMap<Integer, String> hmap = new HashMap<>();
		
		hmap.put(1, "HCL");
		hmap.put(2, "TCs");
		hmap.put(3, "Equiniti");
		
		System.out.println(hmap.get(1));
		
		
		//Hashmap Iterater
		
		Iterator itr1 = hmap.entrySet().iterator();
		
		
		while(itr1.hasNext())
		{
			
			Map.Entry mentry = (Map.Entry) itr1.next();
			
			System.out.println(mentry.getKey());
			System.out.println(mentry.getValue());
		
		
		
		

	}
	}

}
