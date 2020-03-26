public class Main {
    public static void main(String[] args) {
        Account account1 = new Account(1,"Thinh", 100);
        Account account2 = new Account(2,"Kanh", 80);
        System.out.println("Balance Thinh: " + account1.getBalance() );
        System.out.println("Balance KAnh: " + account2.getBalance());
        System.out.println();

        //cong tien vao tk
        account1.credit(20);
        account2.credit(40);
        System.out.println("Balance Thinh: " + account1.getBalance() );
        System.out.println("Balance KAnh: " + account2.getBalance());
        System.out.println();

        //tru tien vao tk
        account1.debit(100);
        account2.debit(30);
        System.out.println("Balance Thinh: " + account1.getBalance() );
        System.out.println("Balance KAnh: " + account2.getBalance());
        System.out.println();

        //chuyen tien den tk khac
        account1.tranferTo(account2, 80);
        System.out.println("Balance Thinh: " + account1.getBalance() );
        System.out.println("Balance KAnh: " + account2.getBalance());
        System.out.println();
    }
}
