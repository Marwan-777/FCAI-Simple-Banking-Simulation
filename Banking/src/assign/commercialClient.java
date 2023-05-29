package assign;

public class commercialClient extends Client{
	String commercialID ;
	commercialClient(String name,String id,String phone,String add,Account a){
		 nationalID = "00000000000000";
		    this.name=name;
			this.commercialID=id;
			this.address=add;
			this.phone=phone;
			this.account=a;
	}
	
	@Override
	public String toString() {
		String info =" name : "+name +" \n "+ "commercial Id : "+commercialID+ "\n " +"phone : "+ phone + "\n " +"adress : "+ address+ "\n";
		String acc_info = account.toString();
		String all_info = info + acc_info ;
		return all_info;
		
	}
}