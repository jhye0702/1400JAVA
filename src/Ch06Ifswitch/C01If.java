package Ch06Ifswitch;

import java.util.Scanner;

public class C01If {

	public static void main(String[] args) {
		
		//--------------------------------------------------------
		// 단순 IF
		//--------------------------------------------------------
		// if(조건식)
		// {
		// 	참인 경우 실행되는 코드;
		// }
		
//		int age = 7;
//		
//		if(age>=8)
//		{
//			System.out.println("취학 아동입니다");
//		
//		}
//		System.out.println("첫번째 IF문 벗어남");
//		if(age<8)
//		{
//			System.out.println("미취학 아동입니다");
//		}
//		System.out.println("두번째 IF문 벗어남");
//		System.out.println("프로그램을 종료합니다");

		
		//--------------------------------------------------------
		// IF-Else문
		//--------------------------------------------------------
		// if(조건식)
		// {
	  	//  	//참인 경우 실행될 코드
		// }
		// else
		// {
		//  	//거짓인 경우 실행될 코드
		// }
		
//		int age = 7;
//		
//		if(age>=8)
//		{
//			System.out.println("취학 아동입니다");
//		}
//		else
//		{
//			System.out.println("미취학 아동입니다");
//		}
//		System.out.println("프로그램을 종료합니다");
		
		
		
		
		//--------------------------------------------------------
		// 문제
		//--------------------------------------------------------
		// 정수 하나를 받아서 짝수면 "짝수입니다"
		// 홀수면 "홀수입니다"를 출력하세요
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 하나를 입력: ");
//		int n1 = sc.nextInt();
//		if(n1%2==0)
//		{
//			System.out.println("짝수입니다");
//		}
//		else
//		{
//			System.out.println("홀수입니다");
//		}
//		sc.close();
		
		
		
		// 문제 (선생님 깃허브 받아서 다시보기)
		// 정수 하나를 받아서 3의 배수면 "3의 배수입니다"
		// 4의 배수면 "4의 배수입니다"를 출력하세요

		
		
		//--------------------------------------------------------
		// 문제
		//--------------------------------------------------------
		// 두 정수를 입력받아서 큰 수를 출력하세요(IF-ELSE)
//		Scanner sc = new Scanner(System.in);
//		System.out.print("1번 정수 입력: ");
//		int n3 = sc.nextInt();
//		System.out.print("2번 정수 입력: ");
//		int n4 = sc.nextInt();
//		if(n3>n4)
//		{
//			System.out.println(n3);
//		}
//		else
//		{
//			System.out.println(n4);
//		}
		
			
		
		
		// 3의 배수이면서 4의 배수라면 출력
		// 3의 배수가 아니면서 5의 배수라면 출력
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 입력: ");
//		int num = sc.nextInt();
//		
//		if(num%3==0)
//		{
//			// 3의 배수인 경우
//			if(num%4==0)
//			{
//				System.out.println("3의 배수이면서 4의 배수");
//			}
//		}
//		else
//		{
//			// 3의 배수가 아닌경우
//			if(num%5==0)
//			{
//				System.out.println("3의 배수X 5의 배수O");
//			}
//			
//		}
		
		
		
//		if(num%3==0 && num%4==0)
//		{
//			System.out.println("3의 배수o, 4의 배수o");
//		}
//		else
//		{
//			//3의 배수가 아니거나, 4의 배수가 아니거나
//			//둘다 아니거나
//		}
//		
//		if(num%3!=0 && num%5==0)
//		{
//			System.out.println("3의 배수X, 5의 배수o");	
//		}
		

		//--------------------------------------------------------
		// ELSE-IF문 (다중문)
		//--------------------------------------------------------
		// 예제
		// 국어, 영어, 수학 각각의 점수가 40점 이상이 되어야하고
		// 총평균이 60점 이상이 되면 "합격" 출력
		// 그게 아니면 "불합격" 출력
		
		// 1. 국어가 40점 이하인가? -> 불합격
		// 2. 영어가 40점 이하인가? -> 불합격
		// 3. 수학이 40점 이하인가? -> 불합격
		// 4. 평균이 60점 미만인가? -> 불합격
		// 5. 아니라면 -> 합격
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("국, 영, 수 점수 입력: ");
//		int kor = sc.nextInt();
//		int eng = sc.nextInt();
//		int mat = sc.nextInt();
//		double avg = (double)(kor+eng+mat)/3;
//				
//		if(kor<40)
//		{
//			System.out.print("불합격!");
//		}
//		else if(eng<40) 
//		{
//			System.out.print("불합격!");
//		}
//		else if(mat<40) 
//		{
//			System.out.print("불합격!");
//		}
//		else if(avg<60.0) 
//		{
//			System.out.print("불합격!");
//		}
//		else
//		{
//			System.out.print("합격!");
//		}
		
		//--------------------------------------------------------
		// 문제
		//--------------------------------------------------------
		// 평균 점수를 입력 받아 그 점수가 
		// 90점 이상이면 'A' 출력
		// 80점 이상이면 'B' 출력
		// 70점 이상이면 'C' 출력
		// 60점 이상이면 'D' 출력
		// 60점 미만이면 'F' 출력
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("평균 점수를 입력하세요 : ");
//		int avg = sc.nextInt();
//		if(avg>=90)
//		{
//			System.out.print("A");
//		}
//		else if(avg>=80)
//		{
//			System.out.print("B");
//		}
//		else if(avg>=70)
//		{
//			System.out.print("C");
//		}
//		else if(avg>=60)
//		{
//			System.out.print("D");
//		}	
//		else
//		{
//			System.out.print("F");
//		}
		
		
		
		//--------------------------------------------------------
		// 문제 (강사와 같이 합니다) else-if 사용
		//--------------------------------------------------------
		// 세 정수를 입력 받아서 큰 수를 출력하세요 (단순IF문으로만)
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 입력: ");
		int n1 = sc.nextInt();
		System.out.print("두번째 정수 입력: ");
		int n2 = sc.nextInt();
		System.out.print("세번째 정수 입력: ");
		int n3 = sc.nextInt();
		
		if(n1>=n2 && n1>=n3) // n1이 제일 큰 경우
		{
			System.out.println("큰 수: " + n1);
		}
		else if(n2>=n1 && n2>=n3)
		{
			System.out.println("큰 수: " + n2);
		}
		else
		{
			System.out.println("큰 수: " + n3);
		}
			
		

	}

}
