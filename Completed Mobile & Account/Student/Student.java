package Student;
import Account.*;
import Book.*;
import Library.*;
public class Student{

	Account a = new Account();
	public int balance;
	//int day;
	String studentName;
	String studnetId;
	static Book [] b = new Book[10];
	static Library l=new Library();
	public static int borrowCount;
	public Student(){borrowCount=0;}
	public Student( String studentName,String studnetId,int balance){
		//book.showInfo();
		this.studentName=studentName;
		this.studnetId=studnetId;
		a = new Account(studentName,studnetId,balance);
		borrowCount=0;
	}
	public void depositeBook(Book book,int day){
		Account a = new Account();
		day=day*10;
		a.deposite(day);
	}
	public void borrowBook(Book book){
		borrowCount++;
		System.out.println(book.bookName+" borrowed ");
	}
	public void showBorrowedInfo(){
		if(borrowCount>5){System.out.println("You can not borrow more than 5 books at a time");}
		else{
		a.showInfo();
		for(int i=0;i<borrowCount;i++){b[i].showInfo();}
		System.out.println("Borrow Info");
		l.showLibInfo();
		}
	}
	public void delayDeposite(){
		l.delay();
	}
	
}