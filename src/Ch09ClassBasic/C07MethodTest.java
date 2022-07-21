package Ch09ClassBasic;

import java.util.Scanner;

class Calculator
{
	//멤버 변수
	Scanner sc = new Scanner(System.in);
	
	//기능
	//인자 o, 반환 o (외부에서 값을 주어야지만 실행할 수 있음.)
	int sum(int x, int y) {return x+y;}
	
	int sub(int x, int y) {return x-y;}
	
	void mul(int x, int y) {System.out.println(x*y);}
	
	void div(int x, int y) {System.out.println((double)x/y);}
												//형 변환을 줌으로써 소수점 결과를 얻게 됨.

}

public class C07MethodTest {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		
		int r1=cal.sum(10,20);
		System.out.println("r1 : "+ r1);
		
		int r2=cal.sub(50,30); //뺄셈 x-y		
		System.out.println("r2 : " + r2);
		
		cal.mul(5,6); //곱셈 -> 곱셈결과가 함수내의 print호출로 출력
		
		cal.div(10,2); //나눗셈 -> 나눗셈결과가 함수 내의 print호출로 출력

	}

}
