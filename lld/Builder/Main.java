package ds;

public class Main {

    public static void main(String[] args) {

        Account account1 = new Account.AccountBuilder("Aditi", 1).build();
        Account account2 = new Account.AccountBuilder("Viraj", 2).setNomineeName("xx").build();
        System.out.println(account1.toString());
        System.out.println(account2.toString());



    }

}