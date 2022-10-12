package Account;
public class Account
{
	private String accId;
    private String accName;
    private int accBalance;
	public Account(){}
	public Account(String accName, String accId,int accBalance){
		this.accName=accName;
		this.accId=accId;
		this.accBalance=accBalance;
	}
	public void setAccName(String accName){this.accName=accName;}
	public void setAcId(String accId){this.accId=accId;}
	public void setBalance(int accBalance){this.accBalance = accBalance;}
	public String getAccName(){return accName;}
	public String getAccId(){return accId;}
	public int getBalance(){return accBalance;}
	public int deposite(int amount){
		accBalance +=amount;
		System.out.println("Your deposite amount : "+amount);
		System.out.println("Balance : "+accBalance);
		return accBalance;
	}
	public int withdraw(int amount){
		accBalance -=amount;
		System.out.println("Your withdraw amount : "+amount);
		System.out.println("Balance : "+accBalance);
		return accBalance;
	}
	public void showInfo()
	{
		System.out.println("Account Name :" + accName);
		System.out.println("Account id :" + accId);
		System.out.println("Balance :" + accBalance);
	}
	
	static Transaction transaction[] = new Transaction[100] ;
	static int totalNumberOfTransaction = 0;

	public void addTransaction(Account sender, Account receiver, int amount)
	{
		transaction[totalNumberOfTransaction] = new Transaction(sender , receiver,  amount);
		totalNumberOfTransaction++;
	}

	public void transfer(int amount, Account receiver){
		addTransaction(this, receiver, amount);
		int y = receiver.deposite(amount);
		System.out.println("Transfer Completed");
		System.out.println("Balance of "+this.accName+" is: "+this.accBalance);
		System.out.println("Balance of "+receiver.accName+" is: "+receiver.accBalance);
	}
	public void showAlltransaction()
	{
		for(int i = 0; i<totalNumberOfTransaction; i++)
		{
			transaction[i].showTransactionInfo();
		}	
	}
	/*public static void main(String[]args){
		Account a = new Account("Asif","42996",3000);
		Account b = new Account("Rishad","429",4000);
		a.showInfo();
		a.deposit(2000);
		a.withdraw(3500);
		a.transfer(1500,b);
		a.showAlltransaction();


	}*/
}
/* class Transaction
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
}*/