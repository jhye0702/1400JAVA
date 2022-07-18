package Ch08For;

import java.util.Scanner;

public class C01For {

	public static void main(String[] args) {
		
//		int i = 1;
//		while(i<=10)
//		{
//			System.out.println("i : "+ i);
//			i++;
//		}
//		
		
		// 위에서 각각의 정보를 따로 쓰는 것보다 정보를 한눈에 알아보기 쉬움.
		// for( 초기값, 조건, 증감 )
//		for(int i=1; i<=10; i++)
//		{
//			System.out.println("i : "+ i);
//		}

		
		// <해보기>
		// 1부터 N까지의 합
		
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		int sum=0;
		
		for(int a=1; a<=n; a++) {
			sum +=a;
			System.out.println();
		}
		
		// 1부터 M까지의 합
		// 1부터 M까지의 수 중의 3의 배수를 제외한 합
		// 구구단 출력
		// ---------중첩 for---------------------------------------------
		// 전체 구구단 출력
		// 전체 구구단 역순 출력
		// 별찍기(직삼각형, 역직각삼각형, 정삼각형, 역정삼각형...)
		
		
	}

}
