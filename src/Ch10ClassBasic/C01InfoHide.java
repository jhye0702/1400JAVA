package Ch10ClassBasic;

// 접근 한정자
//----------------------
// public : 모든 클래스에서 접근가능
// protected : 동일 패키지에 속한 클래스 or 상속과게에서 하위클래스에서만 접근가능
// default : 동일 패키지에 속한 클래스에서만 사용가능 (기본 한정자)
// private : 현재 클래스에서만 접근가능(정보 은닉)



class C01Person
{
	public String name;
	private int age;
	private float weight;
	private double height;
	
	// 생성자
	public C01Person(String name, int age, float weight, double height) {
		super(); // 지워도 상관없음.
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}
	C01Person(){
		
	}
	
	//Getter(가져오기) and Setter(저장하기)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	// toString() 재정의. 멤버 변수 안에 있는 것들을 출력하기 위함!
	@Override
	public String toString() {
		return "C01Person [name=" + name + ", age=" + age + ", weight=" + weight + ", height=" + height + "]";
	}
	
	
}

public class C01InfoHide {

	public static void main(String[] args) {
		C01Person kim = new C01Person();
		kim.name = "김상중";
		//kim.age=11;
		kim.setAge(55);
		System.out.println("age = "+ kim.getAge());
		
		C01Person tmp = new C01Person("홍길동", 55,56.8f,177.5);
		System.out.println(tmp.toString());

	}

}
