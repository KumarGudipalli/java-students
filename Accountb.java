package account;

public class Accountb {
 private  int balance = 0 ;
 public int credit() {
	 return balance;
 }
 public int debit() {
	 return balance;
 }
 
     public int getCredit()
      {
    	  return credit();
      }
     
     
    public void setCredit(int b)
    {
    	if(b>0) {
    	this.balance = b+balance;

    	}
    	}
    
    public int getDebit()
    {
    	return debit();
    	
    }
    public void setDebit(int d)
    {
    if(d > 0)
    {
    		this.balance = balance-d;
    }	
    }
}
