package Ch18API;

class A{
	int x;
	int y;
	
	@Override
	public String toString() {
		return "x="	+x+ "y="+y;  // 멤버 변수의 값을 리턴
	}
	
}

public class C01ObjectTest {
	public static void main(String[] args) {
		Object ob1 = new Object();
		System.out.println(ob1.toString()); // 해당 클래스명, 구분자, 해시코드값으로 위치 표시(JVM이 객체 위치를 찾기 위해 사용하는 해시코드값)
		System.out.println(ob1); // toString을 적지 않아도 나옴.
	
		A ob2 = new A();
		System.out.println(ob2.toString());
		System.out.println(ob2);
		
	
	
	}

}
