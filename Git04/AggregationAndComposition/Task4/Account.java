package Git04.AggregationAndComposition.Task4;

public class Account {
    private long number;
    private boolean isBlocked = false;
    private double money;

    public Account(long number) {
        this.number = number;
        this.money = Math.random() * 1000 - 500;
    }

    public void blockCard(){
        isBlocked = true;
    }

    public void unBlockCard(){
        isBlocked = false;
    }

    public long getNumber() {
        return number;
    }

    private void setMoney(double money) {
        if(isBlocked)
            System.out.println("Карточка заблокированна");
        else
            this.money = money;
    }

    public double getMoney() {
        return money;
    }

    public void putMoney(double money){
        setMoney(this.money+money);
    }

    void takeMoney(double money){
        double res = this.money-money;
        if(res < 0)
            System.out.println("На счёте недостаточно средств");
        else
            setMoney(res);
    }



}
