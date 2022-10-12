package Mobile;
import AddressBook.*;
public class Mobile
{
	 private String mobileOwnerName ;
	 private String mobileNumber;
	 private double mobileBalance ;
	 private String mobileOSName  ;
	 private boolean lock =false;
	 public Mobile(){}
	 public Mobile(String mobileOwnerName, String mobileNumber,double mobileBalance ,String mobileOSName, boolean lock)
	 {
		 this.mobileOwnerName=mobileOwnerName;
		 this.mobileNumber=mobileNumber;
		 this.mobileBalance=mobileBalance;
		 this.mobileOSName=mobileOSName;
		 this.lock=lock;
	 }

	public void showInfo()
	{
		if(lock==false){System.out.println("Phone is locked");}
		else{System.out.println("Name : "+mobileOwnerName+"\nMobile number  : "+mobileNumber+"\nMobile Balance : "+mobileBalance);}
	}
	public void recharge(int amount )
	{
		if(lock==false){System.out.println("Phone is locked");}
		else{
		mobileBalance+=amount;
		System.out.println("Recharge Amount = "+amount);
		System.out.println("Balance = "+mobileBalance);}
	}
	public void callSomeone(int timeDuration)
	{
		if(lock==false){System.out.println("Phone is locked");}
		else{
		int cost=1;
		cost=cost*timeDuration;
		System.out.println("Total cost="+cost);
		System.out.println("Minute talk="+timeDuration);}
	}
	public void showAddressBook(){
		AddressBook a = new AddressBook();
		a.showAllContactInfo();
	}
	/*public static void main(String[]args){
		Mobile mb=new Mobile("Asif","01776670525",150.0,"Android",true);
		mb.showInfo();
		mb.recharge(40);
		mb.callSomeone(4);
	}*/	 
}