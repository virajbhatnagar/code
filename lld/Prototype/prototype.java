package ds;

public class Main {
// Prototype
    public static void main(String[] args) throws CloneNotSupportedException {
        Account account = new Account("Viraj");
        account.setBankId("HDFC");

        Account account2 = account.clone();
        account2.setName("Aditi");

        System.out.println(account.toString());
        System.out.println(account2.toString());

    }

}


/* different file name - Account.java */

package ds;

public class Account implements Cloneable{
    private String name;
    private int bankId;

    public Account(){
    }
    public Account(String name){
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", bankId=" + bankId +
                '}';
    }

    // remote DB call
    public void setBankId(String bankName){
        System.out.println("..........Calling DB............");
        this.bankId = 1; // fetch from DB
    }



    @Override
    protected Account clone() throws CloneNotSupportedException {
        Account account = new Account();
        account.bankId = this.bankId;
        return account;
    }
}



