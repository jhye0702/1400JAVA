package Ch13Static;

class Product
{
	String PName;
	int amount;
	
	//모든 인자를 받아 저장하는 생성자를 만듭니다.
	
	public Product(String pName, int amount) 
	{
		super();
		PName = pName;
		this.amount = amount;
	}


	@Override
	public String toString()
	{
		return "Product [PName=" + PName + ", amount=" + amount + "]";
	}
}
class Refrigerator
{
	//싱글톤 패턴 처리합니다.
	private static Refrigerator instance;
	public static Refrigerator getInstance(){
		if(instance==null)
			instance = new Refrigerator();
			return instance;
		}
		private Refrigerator() {};
		//싱글 톤 패턴 코드 끝
	
	
	Product [] list = new Product[100]; // 최대 수용가능 갯수 100개로 한정지어둠. --> 컬렉션으로 처리시 메모리 허용범위 내에서 확장 가능
	int ProductNum = 0; //idx, 상품 정보 개수 카운팅! 99를 초과하면 안됨.
	
	void SetProduct(Product product) {
		if(ProductNum<=99)
		{
			//list  ProductNum번째 idx에 외부에서 생성된 Product가 연결
			list[ProductNum]=product;
			//ProductNum의 count 1증가
			ProductNum++;
		}
		else
		{
			System.out.println("더이상 담을 수 있는 공간이 없습니다.");
		}
	}
	
	
	
	Product GetProduct(String search,int amount) {
		
		//반복문과 문자열 검색 처리를 통해서 list에 저장된 search 
		//객체 꺼내와서 요청 개수만큼 차감
		//찾은 Product의 주소를 리턴
		
		if(ProductNum!=0) {
			for(int i=0; i<ProductNum; i++)	{
				if(list[i].PName.equals(search)) {
					//일치하는 제품이 있다면
					if(list[i].amount==amount) {
						// 재고량 == 요청수량
						Product prod = list[i];
						// list에서 해당 제품 삭제(자료 구조 처리로 인해 삭제 처리--> 컬렉션)
						for(int j=i+1; j<ProductNum; j++) {
							list[j-1]=list[j];
						}
						list[ProductNum]=null;
						// ProductNum--
						ProductNum--;						
						return prod;
					}
					else if(list[i].amount<amount)
					{
						//재고량 > 요청수량
						//list 수량 감소
						list[i].amount = list[i].amount-amount;
						//Product 객체를 생성
						//Product 리턴
						return new Product(list[i].PName,amount);
					}
				}	
			}	
		}
		//for문에서 넘어왔으면 일치하는 제품이 없다.
		return null;
		
		//로직
		//만약 제품이 검색 안된다면 null 리턴
		//만약 제품이 검색 되고 수량이 저장된 수량을 초과한다면 null리턴
		//만약 제품이 검색 되고 수량이 저장된 수량보다 작다면
		//-Product객체를 따로 만들어 수량 분배하여 리턴
		//만약 제품이 검색되고 수량이 저장된 수량과 같다면 list 안의 내용물 삭제후
		//제품 리턴
	}
}
public class C05SingleTonMain {

	public static void main(String[] args) {
		
		
		//냉장고 객체 가져오기(싱글톤 패턴)
		Refrigerator refrigerator= Refrigerator.getInstance();
		
		//상품정보객체 생성 
		Product prod = new Product("콜라",5);
		Product prod2 = new Product("사이다",5);
		
		//냉장고에 상품저장
		refrigerator.SetProduct(prod);
		refrigerator.SetProduct(prod2);

		//냉장고에 상품반환
		Product prod1 =refrigerator.GetProduct("콜라",5); 
				
		System.out.println("get Item : " + prod1.toString());
		for(int i=0; i<refrigerator.ProductNum; i++) {
			System.out.println(refrigerator.list[i].toString());
		}
				
	}

}
