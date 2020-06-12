public class Account
{
   private String id;
   private String name;
   private double balance;
   

   public Account(String id, String name, double balance)
   {
      this.id = id;
     this.name = name;
      this.balance =balance;
   }
      public Account(String id, String name)
   {
      this.id = id;
      this.name = name;
   }
   public String getId()
   {
      return id;
      
   }
   public String getName()
   {
      return name;
   }
   public double getBalance()
   {
      return balance;
   }
   public void credit(double amount)
   {
        this.balance += amount;
   }
    public boolean debit(double amount)
   {
      if (amount>this.balance)
      {
         System.out.println("Amount Exceed");
         return false;
      }
      else
      {
         this.balance -= amount;
         return true;
      }
   }
   public void transferTo(Account another, double amount)
   {
         if(this.balance>amount)
         {
            System.out.println("Transfer completed");
            this.balance = this.balance - amount;
            another.balance = another.balance + amount;
            
         }
         else
         {System.out.println("Account exceeded");
         

         }
   }
   public String accountDetails()
   {
      return this.name + ", the current balance in your account " + this.id + " is " + this.balance;
   }
           
}