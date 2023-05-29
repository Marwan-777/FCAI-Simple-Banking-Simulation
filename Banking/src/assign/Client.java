package assign;

import java.util.Scanner;

public class Client {
	protected String name  ;
	protected String nationalID;
	protected String address;
	protected String phone;
	protected Account account;
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNationalID() {
		return nationalID;
	}
	public void setNationalID(String nationalID) {
		this.nationalID = nationalID;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	Client (){}
	Client(String name,String id,String phone,String add,Account a){
		this.name=name;
		this.nationalID=id;
		this.address=add;
		this.phone=phone;
		this.account=a;
	}
	@Override
	public String toString() {
		String info = " name : "+name +" \n "+ "national Id : "+nationalID + " \n " +"phone : "+ phone + " \n " +"adress : "+ address+ "\n";
		String acc_info = account.toString();
		String all_info = info +  acc_info ; 
		return all_info ;
		
		}
	}

