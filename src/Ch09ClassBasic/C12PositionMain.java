package Ch09ClassBasic;

class C12Position
{
	// 속성
	int x;
	int y;
	int z;
	
	// 생성자
	C12Position(){}
	C12Position(int x){
		this.x=x; y=0; z=0;  //this는 멤버 변수와 지역변수 구별해줌. 기본적으로 지역변수를 따름. this는 멤버 변수를 따르도록 함.
	}
	C12Position(int x, int y){
		this.x=x; this.y=y; z=0;
	}
	C12Position(int x, int y, int z){
		this.x=x; this.y=y; this.z=z;
	}
	
	// 기능
	void ShowInfo() {
		System.out.printf("x=%d y=%d z=%d\n", x,y,z);
	}
}

public class C12PositionMain {

	public static void main(String[] args) {
		C12Position ob1 = new C12Position();
		C12Position ob2 = new C12Position(10);
		C12Position ob3 = new C12Position(10,20);
		C12Position ob4 = new C12Position(10,20,30);
		
		ob3.ShowInfo();
		

	}

}
