package assign;

public class SpecialAccount extends Account{
	SpecialAccount(){};
	SpecialAccount(int num, double bal){
		account_number = num;
		balance = bal;
	}
    public double withdraw(int withdraw_no) {
        
         if((balance-withdraw_no)>=-1000)
         { balance-=withdraw_no;
         return balance;}
         
         else
         {System.out.println("Failed OPeration...The required Withdraw exceeds max limit(1000) "); return 0;}
        
    }
}
