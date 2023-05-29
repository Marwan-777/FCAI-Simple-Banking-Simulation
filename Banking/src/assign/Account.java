package assign;

public class Account {
	 int account_number=0;
	  double balance=0.0;
	 Account(){}
	  
	  Account(int num , double bal)
	  {
	  account_number = num ;
	  balance = bal;
	  }      
	   public void set_acc_number(int acc_num) 
	    {
	        account_number=acc_num;
	        
	    }

	public int get_acc_number() 
	    {
	       return account_number;
	        
	    }

	   public void set_balance(double bal) 
	    {
	        balance=bal;
	        
	    }

	public double get_balance() 
	    {
	       return balance;
	        
	    }

	    @Override
	    public String toString() {
	        return "Account{" + " Number = " + account_number + ", Balance = " + balance + '}';
	    }

	public double withdraw(int withdraw_no)
	{
	  if(balance >= withdraw_no)
	  {
	 balance-=withdraw_no;
	 return balance ;
	  }
	  else 
	  {
	      System.out.println("Failed OPeration...No Enough Balance to Wirhdraw");
	  }
	      return 0;
	  }


	public double deposite(int deposite_no)
	{
	 balance+=deposite_no;
	 return balance ;
	}
	}
	
	
	
