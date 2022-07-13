package Ch04Scanner;

import java.util.Scanner;

public class C04Scanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		System.out.println("확인 : " + num);
		sc.nextLine(); // 해결방법. 이걸 넣지 않으면 아래와 같이 뜸
//		정수 : 8
//		확인 : 8
//		문자열 : 확인 : 

		System.out.print("문자열 : ");
		String str = sc.nextLine();
		System.out.println("확인 : " + str);
		
		
		// nextLine을 사용할 때 주의할 점!
		// nextLine만 사용하는게 아니라
		// nextInt(), nextDouble(), next()함수와
		// 혼용해서 사용하는 경우
		// 중간에 nextLine() 한번 더 실행해서 버퍼공간에
		// 남은 개행을 인식하지 못하도록 한다
		
		sc.close();
		

	}

}
