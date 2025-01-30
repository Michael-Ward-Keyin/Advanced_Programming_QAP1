public class TestAccount {
    public static void main(String[] args) {
        Account acc1 = new Account("A1", "Tommy", 5000);
        Account acc2 = new Account("A2", "Tommy", 4000);
    

    System.out.println("A1 Balance: $" + acc1.getBalance());
    System.out.println("A2 Balance: $" + acc2.getBalance());

    acc1.transferTo(acc2, 1000);
      
    System.out.println("A1 Balance: $" + acc1.getBalance());
    System.out.println("A2 Balance: $" + acc2.getBalance());
    }
}