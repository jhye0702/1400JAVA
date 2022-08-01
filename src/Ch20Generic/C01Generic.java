package Ch20Generic;

class Corn<T>
{
	private T ob;
	public T get() {
		return ob;
	}
	public void set(T ob) {
		this.ob = ob;
	}
}


public class C01Generic {

	public static void main(String[] args) {
		
		Corn<String> corn1 = new Corn<String>();
		corn1.set("어니언콘");
		System.out.println(corn1.get());
		
		Corn<Integer>corn2 = new Corn<Integer>();
		corn2.set(1234);
		System.out.println(corn2.get());
	
	}

}
