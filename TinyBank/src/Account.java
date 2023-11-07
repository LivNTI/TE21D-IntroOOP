public class Account {
    // Attributes
    private int money;
    private String name;
    private int accountNo;
    private Customer owner;

    // Constructor
    public Account(int money, String name, int accountNo, Customer owner) {
        this.money = money;
        this.name = name;
        this.accountNo = accountNo;
        this.owner = owner;
    }

    // Methods
    public void transferMoney(Account reciver, int amount) {
        int recMoney = reciver.getMoney();

        try {
            reciver.setMoney(reciver.getMoney() + amount);
        } catch (Exception e) {

        }
        //reciver.money = reciver.money + amount;


    }

    private void test() {
        System.out.println("This is a private method");
    }


    // Getters & Setter
    public int getMoney() {
        return this.money;
    }

    public void setMoney(int money) throws Exception {
        if (money < 0) {
            throw new Exception("No negative sums!");
        } else {
            this.money = money;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public Customer getOwner() {
        return owner;
    }

    public void setOwner(Customer owner) {
        this.owner = owner;
    }
}
