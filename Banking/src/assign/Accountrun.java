package assign;

public class Accountrun {
	 public static void main(String[] args)
	    {
	        Account acc = new Account();
	        SpecialAccount acc_special = new SpecialAccount();
	        acc.set_acc_number(1);
	        acc.set_balance(4000); 
	        System.out.println("(At Normal Account) : ");
	        System.out.println("Before : " + acc);
	        acc.deposite(1000);
	        acc.withdraw(6000);
	        System.out.println("After  : " + acc);
	        System.out.println("*********"  );
	        System.out.println("(At Special Account): ");
	        acc_special.set_acc_number(2);
	        acc_special.set_balance(2000);
	        System.out.println("Before : " + acc_special);
	        acc_special.deposite(1000);
	        acc_special.withdraw(4000);
	        System.out.println("After  : " + acc_special);
	    }
}
