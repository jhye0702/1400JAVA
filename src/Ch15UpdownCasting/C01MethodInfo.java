package Ch15UpdownCasting;
//------------------------------------
// 멤버 메서드 동작 방식
//------------------------------------
// 멤버 메서드는 최초 객체 생성시 정의 부분이 클래스 영역(공유메모리)에 저장된다.
// 클래스 영역에 저장: static변수, static메서드, 인스턴스메서드(1회 이상 호출), 생성자 메서드
// 일바 멤버 메서드는 객체 1회 이상 생성시 클래스 영역에 저장된다.(재사용성을 위함)

//------------------------------------
//★★★★★ Upcasting ★★★★★
//------------------------------------
// 상위 클래스의 참조변수 = 하위 객체. 연결하는 형태
// 상속관계의 모든 하위 객체를 연결할 수 있는 형태
// 확장된 하위 객체의 멤버에는 접근이 불가능 -> Downcasting 작업 -> 접근

//------------------------------------
//★★★★★ Downcasting ★★★★★
//------------------------------------
// 하위클래스의 참조변수 = 상위 클래스 참조변수(상위 클래스 객체)
// 일반적으로 업 캐스팅 된 상태에서 확장된 멤버에 접근하기 위해서
// 해당 자료형으로 강제 형 변환하는 작업



class Animal
{
	String kind;
	public void Sound() {System.out.println("소리낸다");}
}
class Dog extends Animal
{
	String name;
	public void Move()	{System.out.println("이동합니다");}
}
class Cat extends Animal
{
	String Catname;
	public void CatMove()	{System.out.println("고양이가 이동합니다");}
}

public class C01MethodInfo {
	public static void main(String[] args) {
		System.out.println("--------------------------");
		Animal a1 = new Animal(); //Nocasting
		Animal a2 = new Animal(); //Nocasting
		System.out.println("--------------------------");
		Dog d1 = new Dog(); //Nocasting
		Dog d2 = new Dog(); //Nocasting
		System.out.println("--------------------------");
		Animal a3 = new Dog(); // Upcasting(상위클래스 참조변수 = 하위객체)
							   // Up은 상위 자료로 casting 형변환이 된다.
		a3.kind = "포메라니안";
		a3.Sound();
		//a3.name                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           = "뽀삐"; // 업캐스팅된 상태에서는 확장된 하위 객체의 확장된 멤버에게 접근이 불가능
		//a3.Move();    	// 업캐스팅된 상태에서는 확장된 하위 객체의 확장된 멤버에게 접근이 불가능
	
		Dog down = (Dog)a3;		//Dog down = a3;, Dog down = new Animal; -->> Downcasting. 컴퍼일 에러! 자료형 불일치, 문제소지가 있다...
								//업캐스팅 된 상태의 참조변수를 다운시키는 것. 강제 형 변환 해야함 -> Downcasting
	
		down.name = "뽀삐";
		down.Move();

		//상위클래스 instanceof 하위클래스 => 상속관계 여부를 true/false로 확인 시켜주는 예약어
		
		//정상 downcasting;	
		Animal a4 = new Cat();		// Upcasting
		if(a4 instanceof Cat)
		{
			Cat down2 = (Cat)a4;		// 정상 downcasting;	
		}
		else
		{
			System.out.println("잘못된 다운 캐스팅..");
		}
		
		//비정상 downcasting;	
		if(a4 instanceof Dog)
		{
		Dog down3 = (Dog)a4;		// 비정상 downcasting;
		}
		else
		{
			System.out.println("잘못된 다운 캐스팅..");
		}
		
		
	}

}
