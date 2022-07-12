package Ch03TypeChange;

public class C06StringTypeChange {

	public static void main(String[] args) {
		//--------------------------------------
		// 1. 문자열 + 나머지 자료형
		//--------------------------------------
		// -> 문자열로 자동 형변환 -> 단순 연결 처리
		
		System.out.println("문자열1" + "문자열2");
		System.out.println("문자열1" + ',' + "문자열2");
		System.out.println("문자열1" +2);
		System.out.println(10.5 + "문자열1");
		System.out.println(10 + 20 + "문자열");
		
		
		
		//--------------------------------------
		// 2. 문자열(숫자) -> int형으로 변환
		//--------------------------------------
		// Integer : 클래스 자료형.   parse(해석하다)가 붙은 .parseInt 라는 함수를 써서 정수로 바꿈.
		// Wrapper...? 다음에 설명해요
		
		System.out.println("10" + "20");
		int num1 = Integer.parseInt("10");
		int num2 = Integer.parseInt("20");
		
		System.out.println(num1 + num2);
		
		double num3 = Double.parseDouble("10.5");
		double num4 = Double.parseDouble("20.5");
		System.out.println(num3 + num4);
		
		//--------------------------------------
		// 3. 숫자형 -> 문자열형으로 변환
		//--------------------------------------
		
		int n1 = 10;
		double n2 = 10.2;
		System.out.println(n1 + n2); //n1이 double형으로 바뀜.
		
		String str1 = String.valueOf(n1);
		String str2 = String.valueOf(n2); //  String .valueOf 함수를쓰면 문자열로 바꾸어서 처리해줌
		
		System.out.println(str1 + str2);
				
		
	}

}
