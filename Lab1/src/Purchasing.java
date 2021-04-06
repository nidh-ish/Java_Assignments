import java.util.*;
import java.io.*;

class Purchasing {
	static void purchase(int year, int price)
	{
		Book b = new Book(year);
		b.setPrice((price*3)/2);
		Store.p.add(b);
	}
}

