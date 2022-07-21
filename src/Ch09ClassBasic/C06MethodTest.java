package Ch09ClassBasic;

import java.util.Scanner;

class SumCal
{
	//멤버 변수
	Scanner sc = new Scanner(System.in);
	
	//인자 o, 반환 o (외부에서 값을 주어야지만 실행할 수 있음.)
	int sum1(int x, int y) {
		return x+y;
	}	
	
	//인자 o, 반환x (다른위치로 부터 값을 받아서 값을 응용하는건 자체적으로 하겠음.)
	void sum2(int x, int y) {
		System.out.println("void sum(x, y) = " + (x+y));
	}
	
	// 인자 x, 반환 o (자체적으로 값을 받아서 ...)
	int sum3() {
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		return x+y;
	}
	
	// 인자 x, 반환 x 
	void sum4() {
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		System.out.println("void sum4(x, y) = " + (x+y));
	}
	
}

public class C06MethodTest {

	public static void main(String[] args) {
		
		
		//객체 생성
		SumCal obj1 = new SumCal();
		
		//함수호출
		int result = obj1.sum1(10, 20);
		System.out.println("Sum1(10,20) = " +result);
		
		obj1.sum2(30, 40);
		
		int result3 = obj1.sum3();
		System.out.println("sum3() = "+ result3);
		
		obj1.sum4();
		
		
	}

}
