package Git04.AggregationAndComposition.Task4;

public class Client {
    String name;
    Account[] accounts;

    public Client(String name, Account ... accounts) {
        this.name = name;
        this.accounts = accounts;
    }

    void searchAccount(long account){
        for (int i = 0; i < accounts.length; i++) {
            if(account == accounts[i].getNumber()){
                System.out.println("Клиент иммеет счёт с номером " + account);
                return;
            }
        }
        System.out.println("У клиента отсутсвует счёт с номером " + account);
    }

    void showSortAccounts(){
        System.out.println("Список счетов в порядке убывания:");
        if(accounts.length == 0){
            System.out.println("Список пуст");
            return;
        }
        Account[] accounts = sortArray(this.accounts.clone());
        for (int i = 0; i < accounts.length; i++) {
            System.out.println(accounts[i].getNumber());
        }
    }

    private Account[] sortArray(Account[] accounts){
        long min;
        int indMin;
        for (int i = 0; i < accounts.length - 1; i++) {
            min = accounts[i].getNumber();
            indMin = i;
            for (int j = i+1; j < accounts.length; j++) {
                if(min>accounts[j].getNumber()){
                    indMin=j;
                }
            }
            Account temp = accounts[indMin];
            accounts[indMin] = accounts[i];
            accounts[i]=temp;
        }
        return accounts;
    }

    double sumByAccounts(){
        double sum =0.0;
        for (int i = 0; i < accounts.length; i++) {
            sum+=accounts[i].getMoney();
        }
        return sum;
    }

    void showDept(){
        double sum = 0.0;
        for (int i = 0; i < accounts.length; i++) {
            if(accounts[i].getMoney() <0)
                sum+=accounts[i].getMoney();
        }
        System.out.printf("Сумма долга составляет %.2f рублей",Math.abs(sum));
    }
    void showCash(){
        double sum = 0.0;
        for (int i = 0; i < accounts.length; i++) {
            if(accounts[i].getMoney() >0)
                sum+=accounts[i].getMoney();
        }
        System.out.printf("У клинета %.2f рублей\n",Math.abs(sum));
    }


}
