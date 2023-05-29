package assign;


public class runclient {
		public static void main(String []args) {
			 Account account = new Account ( 1 , 5.6);
			 Client new_client= new Client("1","2","3","4",account);
			 System.out.println ( new_client);
			
		}

}
