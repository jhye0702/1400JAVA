package Ch14Inheritance;

class Employee
{
	String name;
	int age;
	int worktime;

		public Employee(String name, int age, int worktime) {
		super();
		this.name = name;
		this.age = age;
		this.worktime = worktime;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", worktime=" + worktime + "]";
	}
	
	
}
class PartTimer extends Employee
{
	int hourly;
	int days;
	PartTimer(String name, int age, int worktime, int hourly, int days)
	{
		super(name, age, worktime);
		this.hourly=hourly;
		this.days=days;
		
	}
	@Override
	public String toString() {
		return "PartTimer [hourly=" + hourly + ", days=" + days + ", name=" + name + ", age=" + age + ", worktime="
				+ worktime + "]";
	}	
}
class Regular extends Employee
{
	int salary;
	String position;
	Regular(String name, int age, int worktime, int salary, String position)
	{
		super(name, age, worktime);
		this.salary=salary;
		this.position=position;
	}
	@Override
	public String toString() {
		return "Regular [salary=" + salary + ", position=" + position + ", name=" + name + ", age=" + age
				+ ", worktime=" + worktime + "]";
	}
}


public class C03상속Main {
	public static void main(String[] args) {

			PartTimer hong = new PartTimer("홍길동", 55, 4, 20000, 90);
										  //이름, 나이, 근무시간, 시급, 계약일수
			Regular kim = new Regular("김상중", 44, 8, 38000, "대리");
									  //이름, 나이, 근무시간, 연봉, 직책
			System.out.println(hong.toString());
			System.out.println(kim.toString());
	}

}
