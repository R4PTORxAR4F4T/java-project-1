package Book;
public class Book{
	public static int bookCounter=0;
	public String bookName;
	public String bookAuthor;
	public String bookId;
	public String bookType;
	public int bookCopy;
	public Book(){}
	public Book(String bookName, String bookAuthor, String bookId, String bookType, int bookCopy){
		this.bookName=bookName;
		this.bookAuthor=bookAuthor;
		this.bookId=bookId;
		this.bookType=bookType;
		this.bookCopy=bookCopy;
		bookCounter++;
	}

	public void showInfo(){
		System.out.println("Book name : "+bookName+"\nBook Aurthor : "+bookAuthor+"\nBook Id : "+bookId+"\nBook Type : "+bookType+"\nBook Copy : "+bookCopy);
	}
	public void addBookCopy(int x){bookCopy+=x;}
	public static void showTotalBookInfo(){
		System.out.println("Total number of books = "+bookCounter);
	}
}