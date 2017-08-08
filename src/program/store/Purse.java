package program.store;

public class Purse {
    private int purse;

    public int getSum() {
        return purse;
    }

    public void addPurse(int money) {
        purse = purse + money;
    }
}
