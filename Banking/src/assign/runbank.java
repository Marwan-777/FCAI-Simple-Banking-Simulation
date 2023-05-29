package assign;

public class runbank {
  public static void main(String[] args) {
	Bank bank=new Bank();
	Account account=new Account (1,1);
	Client client = new Client("1","2","3","4",account);
	bank.addclient(client);
	bank.display();
}
}
