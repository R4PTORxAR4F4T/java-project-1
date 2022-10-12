import Account.*;
import AddressBook.*;
import Book.*;
import Contact.*;
import Mobile.*;
import Library.*;
import Student.*;
import java.util.Scanner;

public class Main{
	public static void main(String[]args){
		START:
		while(true){
		Scanner sc = new Scanner(System.in);
		System.out.println("\tChoose an option");
		System.out.println("\t1. Mobile");
		System.out.println("\t2. Student");
		System.out.println("\t3. Account");
		System.out.println("\t4. Librarian");
		System.out.println("\t0. Exit");

		Book b1 = new Book("Paraiste","Asif","01","Nobel",3);
		Book b2 = new Book("Oceans","Hossian","02","Drama",5);
		Book b3 = new Book("Moon","Neloy","03","Comedy",9);
		Book b4 = new Book("Cprogramming","Java","04","Educational",7);
		Book b5 = new Book("Adjoint Matrix","Shohidul Islam","05","Educational",5);

		Contact c1 = new Contact("Asif","001",21,"01776670525",'M');
		Contact c2 = new Contact("Saida","002",20,"01432170525",'F');
		Contact c3 = new Contact("Rishad","003",21,"01776673215",'M');

		int firstInput = sc.nextInt();
		switch(firstInput){
			case 1:
			Mobile mb=new Mobile("Asif","01776670525",150.0,"Android",true);
			mb.showInfo();
			AddressBook ad = new AddressBook("Asif","GP");
			ad.addContact(c1);
			ad.addContact(c2);
			ad.addContact(c3);
			MOBILE:
			while(true){
			System.out.println("\t1. Recharge ");
			System.out.println("\t2. Call Someone ");
			System.out.println("\t3. AddressBook ");
			System.out.println("\t0. Exit");

			System.out.print("Enter your choice = ");
			int inputMobile = sc.nextInt();
			
			
			switch(inputMobile){
				
				case 1:
				System.out.print("Enter recharge amount = ");
				int rechar = sc.nextInt();
				mb.recharge(rechar);
				break;

				case 0:
				break MOBILE;

				case 2:
				ad.showAllContactInfo();
				System.out.print("Enter call amount(minutes) = ");
				int callAmount = sc.nextInt();
				mb.callSomeone(callAmount);
				break;

				case 3:
				ad.showAllContactInfo();
				break;
				}
			
			}
			break;
			case 2:
			
			Student s1 = new Student("Asif","42996",3000);
			
			s1.borrowBook(b1);
			s1.borrowBook(b2);
			s1.borrowBook(b3);
			s1.borrowBook(b4);
			s1.showBorrowedInfo();
			s1.depositeBook(b2,5);
			s1.delayDeposite();

			break;
			case 3:
			ACCOUNT:
			while(true){
			Account a = new Account("Asif","42996",3000);
			System.out.println("\t\n**************\n");
			System.out.println("\t1. Deposite");
			System.out.println("\t2. Withdraw");
			System.out.println("\t3. Transfer");
			System.out.println("\t4. Show All Transaction");
			System.out.println("\t0. Exit");

			System.out.print("Enter your choice = ");
			int accountChoice = sc.nextInt();
			switch(accountChoice){
				case 0:
				break ACCOUNT;

				case 1:
				System.out.print("Enter deposite amount = ");
				int depAmount = sc.nextInt();

				a.deposite(depAmount);
				break;

				case 2:
				System.out.print("Enter withdraw amount = ");
				int widAmount = sc.nextInt();

				a.withdraw(widAmount);
				break;

				case 3:
				
				System.out.print("\nEnter Transfer Amount = ");
				int traAmount = sc.nextInt();
				
				Account b = new Account("Rishad","431",3000);
				a.transfer(traAmount,b);
				a.showInfo();
				b.showInfo();
				break;

				case 4:
				a.showAlltransaction();
				break;			
				}
			}
			break;
			case 4:
			Library l = new Library("Shahitto Kendro","42/c, Mogbazar");
			l.addNewBook(b1);
			l.addNewBook(b2);
			l.addNewBook(b3);
			l.addNewBook(b4);
			l.addNewBook(b5);
			l.showLibInfo();
			l.deleteBook(b5);
			//l.showLibInfo();
			l.addNewBookCopy(b2,5);

			break;
			case 0:
			break START;

		}
		
	}
		

		

		/*System.out.println("\n**************\n");

		Contact ob=new Contact("Asif","4299",21,"01776670525",'M');
		ob.showPersonInfo();
		ob.detectMobileOperator();

		System.out.println("\n**************\n");

		Book b1 = new Book("Paraiste","Asif","01","Nobel",3);
		Book b2 = new Book("Oceans","Hossian","02","Drama",5);
		Book b3 = new Book("Moon","Neloy","03","Comedy",9);
		b1.showInfo();
		b2.addBookCopy(5);
		b2.showInfo();
		b3.showTotalBookInfo();*/


	}
}