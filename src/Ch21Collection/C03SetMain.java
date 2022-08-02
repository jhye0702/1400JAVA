package Ch21Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class C03SetMain {
	public static void main(String[] args) {

		Set<String>	set = new HashSet();
		
		set.add("HTML/CSS/JS/JQ");
		set.add("BootStrap");
		set.add("React");
		set.add("Typescript");
		set.add("Node.js");
		set.add("HTML/CSS/JS/JQ"); //중복값
		
		System.out.println("SIZE: " + set.size());
		
		
		//★★★확인★★★
		Iterator<String> iter = set.iterator();
		while(iter.hasNext())
		{
			String val = iter.next();
			System.out.println(val);
		}
		set.remove("BootStrap");
		System.out.println("SIZE: " + set.size());
		
		set.clear();
	}

}
