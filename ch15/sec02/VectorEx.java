package ch15.sec02;

import java.util.List;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		List<Board> list = new Vector<Board>();
		
		
		list.add(new Board("제목1","제목1","글쓴이1"));
		list.add(new Board("제목2","제목2","글쓴이2"));
		list.add(new Board("제목3","제목3","글쓴이3"));
		list.add(new Board("제목4","제목4","글쓴이4"));
		list.add(new Board("제목5","제목5","글쓴이5"));
		
		//list.remove(2);
		//list.remove(3);
		System.out.println(list.contains("글쓴이2"));
		if(list.contains("글쓴이2")) {
			System.out.println(list.indexOf("글쓴이2"));
			list.remove("글쓴이2");
		}
		// s러개라서 안됨 만약 
		
		
		for(int i=0; i<list.size(); i++) {
			Board board =list.get(i);
			System.out.println(board.subject+"\t"+ board.content + "\t"+ board.writer);
			
		}
		
		
		
	}

}
