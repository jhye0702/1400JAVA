package Ch21Collection;

import java.util.ArrayList;
import java.util.List;

public class C01ArrayListMain {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>(); //List<String> list = new ArrayList();		생략가능 -> <String>
		
		list.add("JAVA");
		list.add("JSP");
		list.add("Servlet");
		list.add("Spring framework");
		list.add("Spring boot");
		list.add("JAVA"); // 중복 가능
		list.add(0,"TEST"); // 0번 자리에 넣고 싶을때
		
		list.remove(4); // 4번째 삭제
		
		System.out.println("저장 개수 : " + list.size());
		System.out.println("-------------------------");
		for(String str : list)
		{
			System.out.println(str);
		}
		System.out.println("-------------------------");
		for(int i=0; i<list.size(); i++)
		{
			System.out.println(list.get(i));
		}
		
	}

}
