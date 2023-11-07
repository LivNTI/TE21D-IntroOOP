public class BankMain {
    public static void main(String[] args) {
        System.out.println("Tiny Bank");

        Customer myCust = new Customer();

        Account myAcc = new Account(500, "Edgar", 0, myCust);
        Account myAcc2 = new Account(1000000000, "Jeff", 1, myCust);

        printAccData(myAcc);
        printAccData(myAcc2);

        myAcc2.transferMoney(myAcc, 1000000);
        printAccData(myAcc);
        try {
            myAcc2.setMoney(-1000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        printAccData(myAcc2);

    }

    public static void printAccData(Account acc) {
        System.out.println(acc.getOwner().name + "'s account " + acc.getAccountNo() + " has the sum of " + acc.getMoney());
    }
}

