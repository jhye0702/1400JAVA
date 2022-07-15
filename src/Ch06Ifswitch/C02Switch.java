package Ch06Ifswitch;

import java.util.Scanner;

public class C02Switch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int rank = sc.nextInt();
		
		switch(rank)  //rank 는 조건식인데 여기서는 값이 들어가있음. if문과 차이점은 else if처럼 조건을 여러개 만들수없고 제한적이라는 것.
		{
		case 1:
			System.out.println("금메달 입니다");
			break;
		case 2:
			System.out.println("은메달 입니다");
			break;
		case 3:
			System.out.println("동메달 입니다");
			break;
		default: // 1, 2 ,3 외 다른 숫자를 입력했을때 나오도록 함.
			System.out.println("!!");
		}

	}

}
