package Contact;
public class Contact{
	
	public String personName;
	public String personId;
	public int age;
	public String mobileNumber;
	public char gender;
	
	public Contact(){}
	
	public Contact(String personName, String personId, int age, String mobileNumber, char gender){
		this.personName=personName;
		this.personId=personId;
		this.age=age;
		this.mobileNumber=mobileNumber;
		this.gender=gender;
	}
	
	public void showPersonInfo(){
		System.out.println("Name : "+personName+"\nID : "+personId+"\nAge : "+age+"\nMobile Number : "+mobileNumber+"\nGender : "+gender);
	}

	public void detectMobileOperator(){
		char ch;
		if((ch=mobileNumber.charAt(2))=='7'){System.out.println("Grameenphone operator");}
		if((ch=mobileNumber.charAt(2))=='4' || (ch=mobileNumber.charAt(2))=='3' || (ch=mobileNumber.charAt(2))=='9'){System.out.println("Banglalink operator");}
		if((ch=mobileNumber.charAt(2))=='8'){System.out.println("Robi operator");}
	}
	/*public static void main(String[]args){
		Contact ob=new Contact("Asif","4299",21,"01776670525",'M');
		ob.showPersonInfo();
		ob.detectMobileOperator();
	}*/
}