package Ch19Exception;

public class C03ExceptionMain {

	public static void main(String[] args) {

		try {
			String data = null;
			System.out.println(data.toString()); // NUll
			System.out.println(10/0);	//Arith
			int arr[] = new int[3];
			arr[3]=10; //Bound out
		}catch(Exception e)  // Upcasting과 같은 맥락!!
		{
			e.printStackTrace();
		}finally {
			System.out.println("예외처리와는 무관하게 실행되는 코드");
		}

		System.out.println("실행코드 1");
		System.out.println("실행코드 2");
		
	}

}
