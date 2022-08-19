import java.util.Date;


public class Transaction {
    private char type; // can be 'D' for deposit or 'W' for withdrawl
    private double amount;
    private double balance;
    private Date date;
    private String description;

    public Transaction(char type, double amount, double balance, String description) {
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;

        this.date = new Date();
    }


}
