package Ch19Exception;

public class ArryException {

	public static void main(String[] args) {

		try {
			int [] arr = new int[3];
			
			arr[0]=10;
			arr[1]=20;
			arr[2]=30;
			arr[3]=40; //배열 3개의 칸이라고 위에 제시되어있는데 한칸이 더 추가됨.
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}

				
		System.out.println("실행코드 1");
		System.out.println("실행코드 2");
	}

}
