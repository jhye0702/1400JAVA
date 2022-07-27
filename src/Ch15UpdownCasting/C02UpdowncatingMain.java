package Ch15UpdownCasting;

class Person{
	String name;}
class Employy extends Person{
	String dept;}
class PartTimer extends Employy
	{
	String hourlyPay;
	//toString() 재정의

	@Override
	public String toString() {
		return "PartTimer [hourlyPay=" + hourlyPay + ", dept=" + dept + ", name=" + name + "]";	}
	}
class Regular extends Employy{
	String salary;
	//toString() 재정의

	@Override
	public String toString() {
		return "Regular [salary=" + salary + ", dept=" + dept + ", name=" + name + "]";	}
	}


public class C02UpdowncatingMain {
	public static void ShowInfo(Person person) // 상속관계의 상위 클래스
												// 하위 객체를 연결할 수 있는 매개변수
												// Person person=ob1; // 업캐스팅
												// Person person=ob2; // 업캐스팅
	
	{
		System.out.println(person.name); // Person에서 물려준 멤버라서 가능함. (접근o)
//		System.out.println(person.dept); // Employee 클래스에서 물려준 멤버 (접근x)
		
				if(person instanceof PartTimer)	{
			// 파트 타이머로 다운 캐스팅
			// 재정의된 toString() 사용하여 멤버들 콘솔에 출력
			PartTimer down = (PartTimer)person;
			System.out.println(down.toString());
		}
		else if(person instanceof Regular) {
			// 정규직으로 다운 캐스팅
			// 재정의된 toString() 사용하여 멤버들 콘솔에 출력
			Regular down = (Regular)person;
			System.out.println(down.toString());
		}
	}
	
	
	
	public static void main(String[] args) {
		
		PartTimer ob1 = new PartTimer();
		ob1.name="홍길동"; ob1.dept="인사부"; ob1.hourlyPay="20000";
		ShowInfo(ob1);	 
		Regular ob2 = new Regular();
		ob2.name="김상중"; ob2.dept="총무부"; ob2.salary="4000";
		ShowInfo(ob2);
					
		
	}

}
