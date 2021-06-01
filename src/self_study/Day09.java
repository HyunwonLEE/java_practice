package self_study;

import java.util.ArrayList;

class Soultion_09 {
	class Book {
		public String title;
		public int price;

		public Book(String title, int price) {
			this.title = title;
			this.price = price;
			
		}
	}

	public ArrayList<Book> buyBook(String[] title, int[] price) {
		ArrayList<Book> st = new ArrayList<Soultion_09.Book>();
		for(int i = 0; i < title.length; i++) {
			st.add(new Book(title[i], price[i]));
		}
		return st;
	}

	public int calcPrice(ArrayList<Book> st) {
		int price = 0;
		
		for (Book book : st) {
			price += book.price;
		}

		return price;
	}

	public int solution(String[] title, int[] price) {
		int result = 0;
		ArrayList<Book> st = buyBook(title, price);
		result = calcPrice(st);
		return result;
	}
}

public class Day09 {

	public static void main(String[] args) {
		Soultion_09 s = new Soultion_09();

		String[] title = { "어린왕자", "현대미술", "사피엔스", "철학파스타" };
		int[] price = { 1000, 2000, 1500, 2100 };
		int totalprice = s.solution(title, price);
		System.out.println(totalprice);

		title = new String[] { "시골의사", "그리스인 조르바", "유토피아", "무정", "인간 실격", "데미안" };
		price = new int[] { 12000, 2200, 10500, 21000, 11000, 31000 };
		totalprice = s.solution(title, price);
		System.out.println(totalprice);

	}

}
