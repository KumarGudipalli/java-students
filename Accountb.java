package account;

public class Accountb {
 private  int balance ;
     public int getCredit()
      {
    	  return balance;
      }
    public void setCredit(int b)
    {
    	this.balance = b;
    }
    
    public int getDebit()
    {
    	return balance;
    	
    }
    public void setDebit(int d)
    {
    
    		this.balance = balance-d;
    	
    }
}
