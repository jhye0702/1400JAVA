package Ch02Su;

public class C08한문자저장 {

	public static void main(String[] args) {
		
		System.out.println((int)'A');
		System.out.println((int)'a');
		System.out.println((int)'가');
		System.out.println((int)'나');

		System.out.printf("%x\n", (int)'가');
		System.out.printf("%x\n", (int)'나');
		
		System.out.println('\ub090');  // u는 유니코드 b090은 유니코드에서 낐에 해당되는 번호
		System.out.println('\ub0b1');
		System.out.println('\uac00');
		System.out.println('\ub098');
		
		System.out.println((char)65);
		
		// 저장된 것을 문자로나 숫자로나 꺼낼 수 있음.
		
	}

}
