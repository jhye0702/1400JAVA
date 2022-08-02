package Ch21Collection;

import java.security.MessageDigest;
import java.util.HashSet;
import java.util.Set;

class Simple
{
	int x;
	int y;
	Simple(int x, int y){
		this.x = x; this.y = y;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Simple) {
			Simple down  = (Simple) obj;
			return this.x==down.x && this.y==down.y;
		}
		return false;
	}

	@Override
	public int hashCode() {
		
		int result=0;		
		try {
			MessageDigest md = MessageDigest.getInstance("MD5"); //해시값 생성 알고리즘 객체 받아옴.
			
			byte[] buff = new byte[50]; // 알고리즘에 전달할 값배열
			buff[0] = (byte)this.x;		// 0 idx 에 객체안의 x저장
			buff[1] = (byte)this.y;		// 1 idx 에 객체안의 y저장
			result = md.digest(buff, 0, buff.length);	// 해시값 생성, 결과는 result에 저장
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return result;//
	}
	

}






public class C04SetMain {
	public static void main(String[] args) {

		Set<Simple> set = new HashSet();
		set.add(new Simple(10,20));
		set.add(new Simple(30,40));
		set.add(new Simple(50,60));
		set.add(new Simple(10,20));
		
		boolean result = set.contains(new Simple(11,20));
		System.out.println("포함여부 : " + result);
		
		System.out.println("SIZE : " + set.size());
	}

}
