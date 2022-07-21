package Ch09ClassBasic;

class TV
{
	String corporation;
	int year;
	int inch;
	
	void showInfo()
	{
		System.out.printf("회사 : %s 년도 : %d 인치 : %d", corporation, year, inch);
	}
}


public class C05TVMain {
	
	public static void main(String[] args) {
		
		TV myTV = new TV();
		myTV.corporation="LG";
		myTV.year=2022;
		myTV.inch=32;
		myTV.showInfo(); // 함수 호출시 "회사 : LG 년도 : 2022 인치 : 32"가 출력되어야합니다;

		
	}

}
