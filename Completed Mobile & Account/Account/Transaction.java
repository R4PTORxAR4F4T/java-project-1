package Account;
public class Transaction
{
	 Account sender;
	 Account receiver;
	 int amount;
	
	 Transaction(){};
	 Transaction(Account sender, Account receiver, int amount){
	 	this.amount=amount;
	 	this.receiver=receiver;
	 	this.sender=sender;
	 }
	 public void setSender(Account sender){this.sender = sender;}
	 public void setReceiver(Account receiver){this.receiver = receiver;}
	
	 public void showTransactionInfo(){
		System.out.println("Transacted amount :" +amount);
		System.out.println("Sender Account name :" +sender.getAccName());
		System.out.println("Sender Account id :" +sender.getAccId());
    	System.out.println("Receiver Account name :" +receiver.getAccName());
		System.out.println("Receiver Account id :" +receiver.getAccId()+"\n");
	 }
}