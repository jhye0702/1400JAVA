package Ch15UpdownCasting;

class Computer{
	super();
	private String SN;
	private String CPUSpec;
	private String RAMSpec;
	private String DISKSpec;
	public void PowerON() {
		System.out.println("전원을 켭니다");
		}
	public void PowerOFF() {
		System.out.println("전원을 끕니다");
		}



	public String getSN() {
		return SN;
	}



	public void setSN(String sN) {
		SN = sN;
	}



	public String getCPUSpec() {
		return CPUSpec;
	}



	public void setCPUSpec(String cPUSpec) {
		CPUSpec = cPUSpec;
	}



	public String getRAMSpec() {
		return RAMSpec;
	}



	public void setRAMSpec(String rAMSpec) {
		RAMSpec = rAMSpec;
	}



	public String getDISKSpec() {
		return DISKSpec;
	}



	public void setDISKSpec(String dISKSpec) {
		DISKSpec = dISKSpec;
	}



	public Computer(String sN, String cPUSpec, String rAMSpec, String dISKSpec) {
		super();
		SN = sN;
		CPUSpec = cPUSpec;
		RAMSpec = rAMSpec;
		DISKSpec = dISKSpec;
	}
	
	//-SN : String; //SerialNo
	//-CPUSpec : String;
	//-RAMSpec : String;
	//-DISKSpec : String;
	//+PowerOn() : void -> "전원을 켭니다"가 출력
	//+PowerOff() : void -> "전원을 끕니다"가 출력
	//Getter and Setter 메서드 필요
	//모든 인자를 받는 생성자 함수 만드세요
}
class Notebook extends Computer{
	public int battery;
	public void move() {
		if(battery-5<0) {
			battery=0;
			System.out.println("배터리 방전입니다");
			PowerOFF();		}
		else{
			System.out.println(this.getSN() + "노트북이 이동합니다"); 
		}
		}
	public Notebook(String sN, String cPUSpec, String rAMSpec, String dISKSpec, int battery) {
		super(sN, cPUSpec, rAMSpec, dISKSpec);
		this.battery = battery;
	}
		
	//+battery : int;
	//+move() : void -> "이동합니다" 가 출력, 호출시마다 배터리 -5감소???
}
class Tablet extends Tablet{
	public String PencilNo;
	public void WritePen() {
		System.out.println(PencilNo + "으로 씁니다");
		}
	//+PencilNo : String;
	//+WritePen() : void : "Pen으로 씁니다"가 출력
	public Tablet(String pencilNo) {
		super();
		PencilNo = pencilNo;
	}

	}
}

public class C03UpdowncastingMain {
	
	public static void ShowInfo(Computer ref) {
		//instanceof 로 각각 연결된 객체에 맞게 Downcasting
		//전달 받은 멤버의 Spec값을 출력하는 코드 작성
		Notebook down = (Notebook)Computer;
		System.out.println(down.toString());
		Tablet down = (Tablet)Computer;
		System.out.println(down.toString());
		}

	public static void main(String[] args) {
		NoteBook Mycom = new NoteBook("1-2-3-4", "I7", "16G", "1T", 100);
								//SN, CPUSped, RAMSpec, DISKSpec, battery
		Tablet Mytab = new Tablet("9-8-7-6", "I3", "8G", "128G", "Pen-123");
									//SN, CPUSped, RAMSpec, DISKSpec, PencilNo
		
		ShowInfo(Mycom);
		ShowInfo(Mytab);
	}

}
