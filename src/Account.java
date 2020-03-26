public class Account {
    private int id;
    private String name;
    private int balance;

    Account(int id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getBalance() {
        return this.balance;
    }

    public void credit(int amount) {
        if (amount <= 0) {
            System.out.println("Tiền đâu ra mà nạp??");
        } else {
            this.balance += amount;
        }
    }

    public void debit(int amount) {
        if (amount > this.balance) {
            System.out.println("Không đủ tiền để thanh toán!!");
        } else {
            this.balance -= amount;
        }
    }

    public void tranferTo(Account account, int amount) {
        if (amount > this.balance) {
            System.out.println("Không đủ tiền để chuyển ông nội!");
        } else {
            this.balance -= amount;
            account.credit(amount);
        }
    }


}
