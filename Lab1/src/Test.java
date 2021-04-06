import java.util.*;
import java.io.*;

public class Test {
	static ArrayList<Book> p = new ArrayList<>();
	public static void main(String args[]) {
	        Store store = new Store();
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		int price = sc.nextInt();
		while(year != 0 && price != 0)
		{
			store.purch.purchase(year, price);
			year = sc.nextInt();
			price = sc.nextInt();
		}
		year = sc.nextInt();
		String id = sc.next();
		while(year != 0)
		{
			store.sale.sold(year, id);
			year = sc.nextInt();
			id = sc.next();
		}
		store.sale.printSales();
	}
}
