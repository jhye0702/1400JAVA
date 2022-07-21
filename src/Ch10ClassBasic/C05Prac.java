package Ch10ClassBasic;

import java.util.Scanner;

public class C05Prac {

	public static void main(String[] args) {
		
		//String 클래스로 문자열을 하나 입력받습니다
		// 1 입력받은 문자열의 길이 출력
		// 2 문자열의 idx중에 2,3,4 만 출력
		// 3 다른 문자열을 하나 더 받아서 이전에 저장된 문자열에 해당 문자열이 포함되어 있는지
		//	 여부 확인
		// 4 다른 문자열을 하나 더 받아서 이전에 저장된 문자열에 해당 문자열이 일치하는지 여부 확인
		// 5 저장된 문자열의 길이를 확인해서, 특정 문자열 위치 idx 확인후
		//	 확인된 idx 위치에서 마지막 idx까지 잘라내기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요:");
		String str = sc.nextLine();
		
		System.out.println("길이 : "+ str.length());
		System.out.println("idx중 2,3,4 출력 : "+ str.substring(2,5));
		
		System.out.print("새로운 문자열을 입력하세요: ");
		String str2 = sc.nextLine();
		System.out.println("포함 문자열 검색 : "+ str.contains(str2));
		
		System.out.print("새로운 문자열을 입력하세요: ");
		String str3 = sc.next();
		System.out.println("str == str3 ?"+ (str.equals(str3)));
		
		System.out.println("N부터 마지막까지 자르기:"+ str.substring(3,str.length()));
			
	}

}
