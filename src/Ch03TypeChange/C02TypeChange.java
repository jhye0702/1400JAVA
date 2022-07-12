package Ch03TypeChange;

public class C02TypeChange {

	public static void main(String[] args) {
		
		// 2. 강제 형 변환
		
		int intval = '가';
		char charval = (char)intval; 	// 강제 형 변환
		System.out.println(charval);
		
		long longval = 1000;
		intval = (int)longval; 	// 강제 형 변환
		System.out.println(intval);
		
		double doubleval = 3.14;
		intval = (int)doubleval; 	// 강제 형 변환 (데이터 손실!)
		System.out.println(intval);
		

	}

}
