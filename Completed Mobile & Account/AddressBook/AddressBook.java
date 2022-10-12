package AddressBook;
import Contact.*;
public class AddressBook{
	private String ownerName;
	private String info;
	public static Contact [] con = new Contact[1000];
	public static int totalContact=0;
	
	public AddressBook(){totalContact=0;}
	
	public AddressBook(String ownerName, String info){
		this.ownerName=ownerName;
		this.info=info;
		totalContact=0;
	}

	public void showAllContactInfo(){
		System.out.println("Owner Name: "+ownerName+"\nInfo : "+info);
		for(int i=0;i<totalContact;i++){
			con[i].showPersonInfo();
		}
	}
	public void addContact(Contact cons){
		con[totalContact]=cons;
		System.out.println("Contact id "+con[totalContact].personId+" is added");
		totalContact++;
	}
}