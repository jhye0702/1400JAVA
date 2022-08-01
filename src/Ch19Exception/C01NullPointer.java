package Ch19Exception;

public class C01NullPointer {
	public static void main(String[] args) {
		
		try // 예외가 발생할수 있는 지역을 묶어줌.
		{
		String data = null;
		System.out.println(data.toString());
		}
		
		catch(NullPointerException e) 
		{
			//System.out.println("예외발생!!");
			System.out.println(e.getCause()); // 원인
			System.out.println(e.toString()); // 예외객체 정보
			System.out.println(e.getStackTrace()); // 예외객체 식별주소
			//e.printStackTrace();
			
		}
		
		System.out.println("실행되어야 할 코드1");
		System.out.println("실행되어야 할 코드2");
	}		
}


//[오류]
//- 컴파일 오류 : 아예 동작 자체를 못하는 경우. 대부분 문법 오류
//	
//- 실행 오류 : 실행되다가 멈춤
//	=시스템 오류 : 구조상 오류. 설계/기획 단계에서 문제
//	=예외 : 실행되다가 중간에 멈추는 것