import java.util.*;
import java.io.*;

class Book {
	static HashMap<Integer, Integer> y = new HashMap<>();
	private String id;
	private int price;

	public Book(int year) {
	if(y.containsKey(year))
	{
		id = year + "-" + String.format("%06d", y.get(year));
		y.put(year, y.get(year)+1);
	}
	else
	{
		id = year + "-000001";
		y.put(year, 2);
	}
	}

	public Book(String id) {
		this.id = id;
	}

	public String getId() {
		return this.id;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice() {
		return this.price;
	}

	public boolean equals(Object obj) {
		Book b = (Book)obj;
		if(this.id.equals(b.getId()))
			return true;
		return false;
	}

	public int hashCode(){
		return this.id.hashCode();
	}
}
