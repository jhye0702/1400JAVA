package Ch03TypeChange;

public class C05TypeChangeArithmethic {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 4;
		double result1 = num1/num2; // num1이 int형이기 때문에 결과 값도 int 형이됨.
		double result2 = (double)num1/num2; // 나눗셈 전에 double을 강제 형변환으로 붙임으로서 
											// 10을 10.0으로 해서 나누면 소수점 이하의 몫이 유지됨.
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		
		

	}

}
