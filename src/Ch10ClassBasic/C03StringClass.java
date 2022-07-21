package Ch10ClassBasic;

public class C03StringClass {

	public static void main(String[] args) {
		
		String str1 = "java"; //일반 자료형
		String str2 = "java";
		String str5 = "java";
		
		String str3 = new String("java"); //클래스String
		String str4 = new String("java");
		
		System.out.println("str1 == str2 ?" + (str1 == str2));
		System.out.println("str3 == str4 ?" + (str3 == str4));
		System.out.println("str1 == str3 ?" + (str1 == str3));
		System.out.println("str2 == str4 ?" + (str2 == str4));
		System.out.println("str2 == str5 ?" + (str2 == str5));
		System.out.println("--------------------------------------");
		System.out.println("str1 == str2 ?" + (str1.equals(str2)));
		System.out.println("str3 == str4 ?" + (str3.equals(str4)));
		System.out.println("str1 == str3 ?" + (str1.equals(str3)));
		System.out.println("str2 == str4 ?" + (str2.equals(str4)));
		System.out.println("str2 == str5 ?" + (str2.equals(str5)));
											//기준 객체(앞) 뒤에 비교대상 객체(뒤)
	}
	

}
