package Git04.SimpleObjects.Task8;

import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class BaseCustomers {
    private Customer[] customers = new Customer[5];

    public BaseCustomers() {
        for (int i = 0; i < customers.length; i++) {
            customers[i]=new Customer(BD.ides[i], BD.lastNames[i], BD.firstNames[i], BD.secondNames[i],BD.addresses[i], BD.creditCardes[i], BD.accountNumbers[i] );
        }
    }

    public void show(){
        for (int i = 0; i < customers.length; i++) {
            System.out.println(customers[i]);
        }
        System.out.println();
    }

    public void sortByFIO(){
        Collections.sort(Arrays.asList(customers), new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                int lastName = o1.getLastName().compareTo(o2.getLastName());
                if(lastName == 0){
                    int firstName = o1.getFirstName().compareTo(o2.getFirstName());
                    if(firstName == 0){
                        return o1.getSecondName().compareTo(o2.getSecondName());
                    }
                    return firstName;
                }
                return lastName;
            }
        });
    }

    public void showWithAccountNumberBetween(int start, int end){
        for (int i = 0; i < customers.length; i++) {
            if(start <= customers[i].getAccountNumber() && end >= customers[i].getAccountNumber())
                System.out.println(customers[i]);
        }
        System.out.println();
    }

}
