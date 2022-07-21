package Ch09ClassBasic;

//---------------------------------------------
// 함수 오버로딩
//---------------------------------------------
// 함수의 이름을 동일하게 두고 함수의 매개 변수를 다양하게 둘 수 있도록 허용한 문법

class Calc
{
	
	int sum(int x, int y)// 10, 20 인자를 받아서 x, y 에 넣어주고
	{
		System.out.println("SUM(x,y) 호출!");
		return x+y;
	}
	int sum(int x, int y, int z)// 인자가 셋일 때는 여기 넣어서 10, 20, 30 인자를 받아 x, y,z 에 넣고
	{
		System.out.println("SUM(x,y,z) 호출!");
		return x+y+z;
	}
	int sum(String str1, String str2)
	{
		System.out.println(str1+str2);
		return 0;
	}
}

public class C10MethodOverloading {

	public static void main(String[] args) {
		
		Calc obj = new Calc(); //객체 만들 위치
		System.out.println(obj.sum(10,20)); // 10, 20 인자를 받아서
		System.out.println(obj.sum(10, 20, 30));
		obj.sum("안녕", "하세요");
		
		
	}

}
