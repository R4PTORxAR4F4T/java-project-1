package Library;
import java.util.Random;
import Book.*;
import Student.*;
public class Library{
	private String libAddress;
	Random ran = new Random();
	private String libName;
	private int delay=100;
	static Book [] books = new Book[1000];
	static Student s = new Student();
	public static int totalBook=0;
	public Library(){totalBook=0;}
	
	public Library(String libName, String libAddress){
		this.libName=libName;
		this.libAddress=libAddress;
		totalBook=0;
	}
	public void showLibInfo(){
		System.out.println("Library Name: "+libName+"\nLibrary Address : "+libAddress);
		for(int i=0;i<totalBook;i++){
			books[i].showInfo();
			//System.out.println("Book number"+(i+1)+"\nBook name : "+books[i].bookName+"\nBook Aurthor : "+books[i].bookAuthor+"\nBook Id : "+books[i].bookId+"\nBook Type : "+books[i].bookType+"\nBook Copy : "+books[i].bookCopy);
		}
		if(totalBook==0){System.out.println("No Books found");}
		System.out.println("Total Books in Library = "+totalBook);
	}
	public void addNewBook(Book book){
		books[totalBook]=book;
		System.out.println("Book id "+books[totalBook].bookId+" is added");
		totalBook++;
	}
	public void deleteBook(Book book){
		/*int checker=0;
		for(int i=0;i<totalBook;i++){
			if(books[i].bookId==book.bookId){
				for(int j=i;j<totalBook;j++){
					books[j]=books[j+1];
					System.out.println("Book id "+books[i].bookId+" has been deleted");
					totalBook--;
					checker++;
				}
				if(checker==0){System.out.println("Book not found");}
			}
		}*/
		int flag=0;
		for(int i=0;i<books.length;i++)
		{
			if (books[i]==book)
			{
				books[i]=null;
				flag=1;
				break;
				
			}

		}
		if(flag==1)
		{
			System.out.println("Book Deleted.");
		}
		else
		{
			System.out.println("Book can not be Deleted.");
		}
	}
	public void addNewBookCopy(Book book, int copy){
		book.bookCopy+=copy;
		System.out.println("Copy added of "+book.bookName);
	}
	public void delay(){
		int librarianWish = ran.nextInt(delay);
		s.balance = s.balance*(librarianWish/100);
		System.out.println("Deposite delayed = "+s.balance);
	}
}