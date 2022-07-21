package Ch09ClassBasic;

public class C02Car {
	
	// 속성
	String owner;
	int speed;
	int fuel;
	
	void Accel()
	{
		System.out.println(owner+"님의 차의 속도를 증가합니다");
	}
	void Break()
	{
		System.out.println(owner+"님의 차의 속도가 감소합니다");
	}
	void ShowInfo()
	{
		System.out.printf("%s %d %d\n", owner, speed, fuel);
	}
}
	
