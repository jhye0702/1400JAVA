package Ch18API;

public class C05WrapperMain {
	public static void main(String[] args) {

		//Boxing
		Integer ob1 = new Integer(100); //글자 위에 줄이 그어져있으면 권장하지 않는다는것
		Integer ob2 = new Integer("200");  //문자열을 집어넣어도 숫자로 처리함
		Integer ob3 = Integer.valueOf("300");
		
		System.out.println(ob1+ob2+ob3);
		
		//UnBoxing
		int val1 = ob1.intValue();
		int val2 = ob2.intValue();
		int val3 = ob3.intValue();
		
		System.out.printf("%d %d %d \n", val1, val2, val3);
		
	}
		
}
