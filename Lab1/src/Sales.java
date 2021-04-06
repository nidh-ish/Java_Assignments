import java.util.*;
import java.io.*;

class Sales {
	static HashMap<Integer, ArrayList<String>> s = new HashMap<>();
	static TreeMap<Integer, ArrayList<Integer>> r = new TreeMap<>();
	
	static void sold(int year, String id)
	{
		Book b = Store.p.get(Store.p.indexOf(new Book(id)));
		if( !s.containsKey(year) )
			s.put(year, new ArrayList<String>());
		s.get(year).add(b.getId());
		int byear = Integer.parseInt(id.substring(0, 4));
		if( !r.containsKey(year) )
		{
			r.put(year, new ArrayList<Integer>());
			r.get(year).add(0);
			r.get(year).add(0);
			r.get(year).add(0);
		}
		byear = year - byear;
		if( byear > -1 && byear < 3 )
		{
			r.get(year).add(byear, r.get(year).get(byear)+b.getPrice());
			r.get(year).remove(byear+1);			
		}
	}
		
	static void printSales()
	{
		for(Map.Entry<Integer, ArrayList<Integer>> e : r.entrySet())
			System.out.println(e.getKey() + " " + e.getValue().get(0) + " " + e.getValue().get(1) + " " + e.getValue().get(2));
	}
}
