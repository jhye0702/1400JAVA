package Ch09ClassBasic;

//--------------------------------------------------
// 지역변수 : {}내에서 생성, {} 벗어나면 소멸되는 변수
//--------------------------------------------------

class LocalTest
{
	int num = 10; //멤버 변수
	void Func1()
	{
		System.out.println("num :" + num); // 멤버 변수 num
		int num=100;  // 지역변수 num (새로 num을 정의한 이후로 지역변수의 num을 적용!)
		num++;;
		System.out.println("num : "+num); //지역변수 num
	}
	
	void Func2()
	{
		System.out.println("num : "+ num);
		if(true)
		{
			int num = 55; // 지역변수 num. if 문 내에서만 사용되는 지역변수 num
			num++;
			System.out.println("num : "+ num);
		}
		System.out.println("num : "+ num);
	}
	
	void Func3()
	{
		System.out.println("멤버변수 num : " + num);
		for(int num = 1; num<=10; num++)
		{
			System.out.println("지역변수 num : " + num);
		}
		System.out.println("전역변수 num : " + num);
	}
	
	
}

public class C08LocalVar {
	public static void main(String[] args) {
		LocalTest obj = new LocalTest();
		obj.Func1();
		System.out.println();
		obj.Func2();
		System.out.println();
		obj.Func3();
	}

}
