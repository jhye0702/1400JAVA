package Ch21Collection;

import java.util.ArrayList;
import java.util.List;

class BoardDTO
{
	private int no;
	private String title;
	private String content;
	private String writer;
	private String regdate;
	//toString, getter and setter, Constructor 모든 인자 받아 처리하는...
}


public class C02ArrayListMAin {
	
	public static void addDTO(List<BoardDTO> list,BoardDTO dto){
		
	}
	public static void showDTO(List<BoardDTO> list){
		for(BordDTO dto : list) {
			System.out.println(dto.toString());
		}
	}

	public static void main(String[] args) {

		List<BoardDTO> list = new ArrayList();
		
		
		addDTO(list, new BoardDTO (1,"제목1","내용1","작성자1","2022-08-01"));

		//키보드로 BoardDTO 단위의 값을 하나 이상 받아(no,title, content, writer, regdate)
		//list에 저장하세요
		//list에 저장된 BoardDTO를 모두 확인해보세요
	}

}
