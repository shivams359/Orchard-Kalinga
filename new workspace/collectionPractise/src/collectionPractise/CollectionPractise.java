package collectionPractise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class CollectionPractise {

	public static void main(String[] args) {
		
//		ArrayList<String> name = new ArrayList<String>();
		TreeSet<String> name = new TreeSet<String>();
		name.add("Nagendra");
		name.add("Shivam");
		name.add("Srishti");
		name.add("Nirakh");
		name.add("Nagendra");
		name.add("Srishti");
		
		//iterator
//		Iterator<String> it = name.iterator();
//		while(it.hasNext()){
//			System.out.println(it.next());
//		}
		
		//for each loop
		
//		for (String a:name){
//			System.out.println(a);
//		}
		//List Iterator
//		ListIterator<String> li = name.listIterator();
//		while (li.hasNext()) {
//			System.out.println(li.next());
//			
//		}
//		while (li.hasPrevious()) {
//			System.out.println(li.previous());
//			
//		}
		for(String a : name){
			System.out.println(a);
		}
	}

}
