package Ch16AbstractMain;

import java.util.Scanner;
abstract class Converter {
   abstract protected double convert(double src); // 추상 메소드 // src를 다른 단위로 변환한다 src는 6번Line의 Src에 해당
   abstract protected String getSrcString(); // 추상 메소드 //src 단위명칭
   abstract protected String getDestString(); // 추상 메소드 // Dest 단위명칭
   protected double ratio; // 비율
 
   public void run() {
      Scanner scanner = new Scanner(System.in);
      System.out.println(getSrcString()+"을 "+getDestString()+"로 바꿉니다."); //getSrcString(원) getDestString(달러)
      System.out.print(getSrcString()+"을 입력하세요>> ");
      double val = scanner.nextDouble();
      double res = convert(val);
      System.out.println("변환 결과: "+res+getDestString()+"입니다");
      scanner.close();
   }
}
class Won2Dollar extends Converter {
   	Won2Dollar(double ratio){
   		this.ratio = ratio;
   	}
   	@Override
   	protected double convert(double src) {	
   		return src/ratio;
   	}
   	@Override
   	protected String getSrcString() {
   		return "원";
   	}
   	@Override
   	protected String getDestString() {
   		return "달러";
   	}
}

//문제
//Converter 클래스를 상속받아 원화를 달러로 변환하는 Won2Dollar 클래스를 작성하라. 
 
public class C03Main {

	public static void main(String[] args) {
		Won2Dollar toDollar = new Won2Dollar(1200); // 1달러는 1200원
		toDollar.run();
//		출력 결과
//		원을 달러로 바꿉니다.
//		원을 입력하세요>> 24000
//		변환 결과: 20.0달러입니다
	}

}
