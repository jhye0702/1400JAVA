package Ch09ClassBasic;

class Position
{
	int xpos;
	int ypos;
	
	Position(){   //디폴트 생성자. 클래스이름 Position과 동일.
		xpos=100;
		ypos=100;
	}
	
	void setposXY(int x) {  //반환자료를 생략, 매개변수를 가지지 않기 때문에 void?
		this.xpos=x; //만들어진 이 객체에 = this. xpos에다가 =xpos 외부로부터 전달받은 x를 넣어라.
		this.ypos=0;
	}
	void setposXY(int x, int y){
		this.xpos=x; 
		this.ypos=y;		
	}
	void showInfo(){
		System.out.printf("%d %d\n", this.xpos, this.ypos);		
	}
		//디폴트 생성자 호출시 기본값은 xpos, ypos 각각 100씩 설정
	
}

public class C11PositionMain {

	public static void main(String[] args) {
		Position obj = new Position();
		obj.setposXY(10);	 //멤버 xpos에 값이 저장, ypos는 0저장
		obj.setposXY(10,20); //멤버 xpos,ypos에 각각 값 저장

	}

}
