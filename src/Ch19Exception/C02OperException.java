package Ch19Exception;

public class C02OperException {
	public static void main(String[] args) {

		
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		
		System.out.println("실행 코드 1");
		System.out.println("실행 코드 2");
		
		
		
	}

}
