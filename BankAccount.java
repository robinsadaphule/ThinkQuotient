package Morning;

public class BankAccount {
	
	private int accountId;
    private String accountType;
    private int balance;
    public int getAccountId()
    {
        return accountId;
        
    }
    public String getAccountType()
    {
        return accountType;
    }
    public int getBalance()
    {
        return balance;
        
    }
    public void setAccountId1(int id)
    {
        accountId=id;
    }
    public void setAccountType(String s)
    {
        accountType=s;
    }
    public void setBalance(int b)
    {
        balance=b;
    }
    public boolean withdraw(int w)
    {
        if(getBalance()<w)
        {
            System.out.println("Sorry!!! No enough balance");
            return false;
        }
        else
        {
            System.out.println("Balance amount after withdraw: "+(getBalance()-w));
            return true;
        }
		
	}
	public void setAccountId(int nextInt) {
		// TODO Auto-generated method stub
		
	}
	

}


