package Ch07While;

public class C02WhileWhile {

	public static void main(String[] args) {
		
		// 전체 구구단 출력(2-9단)
		
//		int dan = 2;
//		int i;
//		while(dan<=9)
//		{
//			i=1; // i를 1로 초기화 시키지 않으면 다음 단으로 넘어갈때 i는 10으로 넘어가게 됨.
//			while(i<=9)
//			{
//				System.out.printf("%d x %d = %d\n", dan, i, dan*i);
//				i++;
//			}
//			System.out.println();
//			dan++;
//		}
		
		
		
		// [문제]
		//-----------------------------------------
		// 2 x 9 = 18
		// 2 x 8 = 16
		
		// 3 x 9 = 27
		// 3 x 8 = 24
		//...
		// 9 x 1 = 9
		
//		int dan = 2;
//		int i = 9;
//		while(dan<=9)
//		{
//			i=9;
//			while(i>0)
//			{
//				System.out.printf("%d x %d = %d\n", dan, i, dan*i);
//				i--;
//			}
//			System.out.println();
//			dan++;
//		}
		
		
		// 문제
		//------------------------------------------
		// 9 x 9 = 81
		// 9 x 8 = 72
		//...
		// 2 x 1 = 2
		
//		int dan = 9;
//		int i = 9;
//		while(dan>1)
//		{
//			i=9;
//			while(i>0)
//			{
//				System.out.printf("%d x %d = %d\n", dan, i, dan*i);
//				i--;
//			}
//			System.out.println();
//			dan--;
//		}
		
		
		
		//---------------------------------------
		// 별찍기 1
		//---------------------------------------
		// *****
		// *****
		// *****
		// *****
		// *****

		// 규칙 
		// 0~3번 행이 있고, 각 행에 머무르는 동안 5번의 별을 찍음.
		// i(개행) 				 j(별)
		// i=0(행)				 j=0
		// i++ (다음행으로 내리기)	 j++(1씩 증가)
		// i<4 (3번행까지 있음)	 j<5 (*이 0,1,2,3,4번째까지 있기 때문)
//		int i = 0; // 줄바꿈
//		int j = 0; // 별
//		
//		while(i<4)
//		{
//			j=0;
//			while(j<5)
//			{
//				System.out.print("*");
//				j++;
//			}
//			System.out.println(); // 줄바꿈처리
//			i++;
//		}
		
		
		//---------------------------------------
		// 별찍기 2
		//---------------------------------------
		// *    		변수 i (행)	변수 j (별)
		// **			i = 0		j=0
		// ***			i++			j++
		// ****			i<4			j<=i  i가 0번째, 1번째, 2번째, 3번째
		//								  j가 0까지, 1까지, 2까지, 3까지
		
//		int i = 0;
//		int j = 0;
//		while(i<4)
//		{
//			j=0;
//			while(j<=i)
//			{
//				System.out.print("*");
//				j++;
//			}
//			System.out.println(); //(개행)
//			i++;
//		}
		
		//---------------------------------------
		// 별찍기 3
		//---------------------------------------
		//		i	 j
		// ****	0	0-3				
		// ***	1	0-2					
		// **	2	0-1						
		// *	3	0-0					
		//-----------------
		//          j=0
		//			j++
		//			j<=3-i
		
		
//		int i = 0;
//		int j = 0;
//		while(i<4)
//		{
//			j = 0;
//			while(j<=3-i)
//			{
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
		//---------------------------------------
		// 별찍기 4
		//---------------------------------------
		//		 		i (행)	j (공백)		k(별)
		//    * 		0		0-2			0-0
		//   *** 		1		0-1			0-2
		//  ***** 		2		0-0			0-4
		// ******* 		3		x			0-6
		//---------------------------------------
		//						j=0			k=0
		//						j++			k++
		//						j<=2-i		k<=2*i
		//								
		
//		int i = 0;  // 행증가
//		int j = 0;	// 공백
//		int k = 0;	// 별
//		while(i<4)
//		{
//			//공백찍기
//			j = 0;
//			while(j<=2-i)
//			{
//				System.out.print(" ");
//				j++;
//			}
//			//별찍기
//			k = 0;
//			while(k<=2*i)
//			{
//				System.out.print("*");
//				k++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
		//---------------------------------------
		// 별찍기 5
		//---------------------------------------
		//				i행	j공백	k별
		// *******		0	x		0-6
		//  *****		1	0-0		0-4
		//   ***		2	0-1		0-2
		//    *			3	0-2		0-0
		//----------------------------------
		//					j=0;	k=0;
		//					j++;	k=++;
		//					j<=i-1	k<=3*2 - 2*i
		
		
//		int i = 0;  // 행증가
//		int j = 0;	// 공백
//		int k = 0;	// 별
//		while(i<4)
//		{
//			//공백찍기
//			j = 0;
//			while(j<=i-1)
//			{
//				System.out.print(" ");
//				j++;
//			}
//			//별찍기
//			k = 0;
//			while(k<=3*2 - 2*i)
//			{
//				System.out.print("*");
//				k++;
//			}
//			System.out.println();
//			i++;
//		}
		

		// 문제
		// 다이아몬드 모양 출력
		// 모래시계 모양 출력
		// 높이 입력받아 출력하는 직각 삼각형
		// 높이 입력받아 출력하는 직각 역삼각형
		// 높이 입력받아 출력하는 정삼각형
		// 높이 입력받아 출력하는 역삼각형
		
		//	  *
		//   *** 
		//  *****
		// *******
		//  *****
		//   *** 
		//	  *	
		
		

	}

}
