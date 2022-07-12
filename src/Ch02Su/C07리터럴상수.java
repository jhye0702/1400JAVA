package Ch02Su;

public class C07리터럴상수 {

	public static void main(String[] args) {
		
		// 상수 : 고정된 수 
		// 상수 종료
		// 리터럴 상수 : 이름부여 X    ex) int a = 3;
		// 심볼릭 상수 : 이름부여 O    ex) final 예약어
		
		// 정수 리터럴 기본자료형 : int
		// 실수 리터럴 기본자료형 : double		
		
		// int a = 10; 
		// float a = 10.5; 오류 발생. 실수는 8byte의 double 자료형이 이용되어야 함. float은 4byte
		
		// 리터럴 접미사
		// 정수 : l,L (long) 8byte
		// 실수 : f,F (float) 4byte
		
//		double a = 10.5; // 오른쪽은 더블형, 왼쪽도 더블형 문제 없음.
//		float a = 10.5f; // 10.5가 실수지만 f를 붙이며 크기를 줄여서 float의 4byte에 맞출 수는 있음.
//		System.out.println(a);
		
		// 예제 1
//		byte num1 = 129; 			129는 4 바이트 int형. byte는 1바이트
//		byte num1 = (byte)129;
//		long num2 = 123L; 			123은 int형 4byte. long은 8byte이기 때문에 L을 붙여 맞춰줌.
//		double num3 = 123.456;		
//		float num4 = 123.456;		실수는 8byte인 double이 기본형이지만 f를 끝에 붙이면 float의 4byte에 맞춰질 수 있음.
		
//		System.out.println(num1);
		
		// 예제 2
		
		// int num1 = 4000000000;  // 40억  int는 4바이트, 40억은 8바이트를 필요로 하므로 자료형이 맞지 않음.
		// int num2 = 4000000000L; // 40억  
		// long num2 = 4000000000L; // 40억

	}

}
