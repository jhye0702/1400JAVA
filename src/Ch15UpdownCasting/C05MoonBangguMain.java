package Ch15UpdownCasting;

class Moonbanggu{
	
	static int scount=100; //샤프 재고량
	static int pcount=100; //연필 재고량
	
	//함수 정의
	protected void write() {}; //하위에서 정의하고자 껍데기만 두었음.
}
class sharp extends Moonbanggu{
	sharp(){
		super.scount--; 	//샤프객체 생성시 재고량 감소
	}
	protected void write() {System.out.println("샤프로 씁니다");};
}
class pencil extends Moonbanggu{
	pencil(){
		super.pcount--;		//연필객체 생성시 재고량 감소
	}
	protected void write() {System.out.println("연필로 씁니다");};
}


public class C05MoonBangguMain {
	
	public static Moonbanggu ReqMoonbanggu(String thing) {
		if(thing.equals("샤프")) {
			return new sharp(); // 반환형이 중요! 객체 힙 영역이 만들어지고 그 위치값이 리턴됨.
		}
		else if(thing.equals("연필")) {
			return new pencil();
		}
		else {
			return null;
		}
	}
	public static void ShowInfo() {
		System.out.println("샤프 재고량 : " +Moonbanggu.scount);
		System.out.println("연필 재고량 : " +Moonbanggu.pcount);
	}
	public static void main(String[] args) {
		sharp ob1 = (sharp) ReqMoonbanggu("샤프"); // sharp ob1 =상위 클래스 참조변수
		sharp ob2 = (sharp) ReqMoonbanggu("샤프"); 
		pencil ob3 = (pencil) ReqMoonbanggu("연필"); 
		ob1.write();
		ShowInfo();
		

	}

}
