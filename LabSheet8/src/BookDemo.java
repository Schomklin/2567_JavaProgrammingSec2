import java.util.*;
public class BookDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input author name : ");
		String authorName = scan.nextLine();
		System.out.print("Input author e-mail : ");
		String authorEmail = scan.nextLine();
		Author author1 = new Author(authorName,authorEmail);
		System.out.println(author1); //call toString() method
		System.out.println();
		System.out.print("Input book title : ");
		String bookTitle = scan.nextLine();
		System.out.print("Input book page : ");
		int bookPage = scan.nextInt();
		Book book1 = new Book(bookTitle,author1,bookPage);
		System.out.println(book1);//call toString() method
	}
}
