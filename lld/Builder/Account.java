package ds;

public class Account {
    // mandatory field
    private String name;
    private int id;

    // optional fields
    private String nomineeName;
    // Immutable.
    // Read
    private Account(AccountBuilder builder){
        this.name = builder.name;
        this.id = builder.id;
        this.nomineeName = builder.nomineeName;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", nomineeName='" + nomineeName + '\'' +
                '}';
    }

    public static class AccountBuilder{
        // mandatory field
        private String name;
        private int id;

        // optional fields
        private String nomineeName;

        AccountBuilder(String name, int id){
            this.name = name;
            this.id = id;
        }
        //many optional fields
        public AccountBuilder setNomineeName(String nomineeName) {
            this.nomineeName = nomineeName;
            return this;
        }

        public Account build(){
            Account a = new Account(this);
            return a;
        }
    }



}
