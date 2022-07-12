package Ch02Su;

public class C06연습 {

	public static void main(String[] args) {
		//4byte 정수공간에 a라는 이름을 부여한 다음
		//5라는 값을 a공간에 대입
		
		int a;
		a = 5;
		
		//2byte 음수를 지원하는 공간(short)에 b라는 이름을 부여함과 동시에 
		//100 이라는 값으로 초기화
				
		short b = 100;
		
		//4byte result라는 공간에 a안의 값과 b안의 값의 합을 초기값으로 대입
		//result안의 값을 println하세요
		
		int result = a + b;
		System.out.println(result);
		
		

	}

}
