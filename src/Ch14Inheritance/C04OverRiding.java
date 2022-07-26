package Ch14Inheritance;

// 오버 라이딩(함수 재정의)
// 상속관계를 전제로 하여 상위클래스의 메서드를 하위클래스에서 고쳐 사용하는 문법
// 메서드의 헤더부분은 그대로 두고 메서드의 본체{}를 수정한다

// 오버라이딩 vs 오버로딩
// 오버로딩 : 단일 클래스 내에서! (상속관계 전제X) 메서드 명은 그대로, 파라미터를 다양하게 허용하는 문법
// 오버라이딩 : 상속관계만 가능!

class Animal{
	public void Sound() {System.out.println("소리낸다");}
}
class Dog extends Animal{
	public void Sound() {System.out.println("멍멍 소리낸다");}
}
class Cat extends Animal{
	public void Sound() {System.out.println("야옹 소리낸다");}
}


public class C04OverRiding {
	public static void main(String[] args) {
		
		Dog poppi = new Dog();
		poppi.Sound();
		Cat yummi = new Cat();
		yummi.Sound();
	}

}
