package Git04.AggregationAndComposition.Task4;

public class Solution {

    public static void main(String[] args) {
        Client client = new Client("Женя", new Account(4444_2222_1111_0000L),new Account(1111_2222_4444_0000L),new Account(2222_2222_4444_0000L));
        client.searchAccount(4444_2222_1111_0000L);
        client.searchAccount(4444_2222_1111_0001L);
        client.showSortAccounts();
        System.out.println("Общая сумма клиента " + client.sumByAccounts());
        client.showCash();
        client.showDept();
    }
}
