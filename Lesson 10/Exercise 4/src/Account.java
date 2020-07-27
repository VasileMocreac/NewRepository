public class Account {
    private long balance;
    private String ownerName;
    private boolean locked;

    public Account(){
    }
    public Account(long balance, String ownerName, boolean locked){
        this.balance = balance;
        this.ownerName = ownerName;
        this.locked = locked;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }
    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }
}


