package inheritance;

public class Main {

    public static void main(String[] args) {

        IndividualCustomer engin = new IndividualCustomer();
        engin.customerNumber = "12345";

        CorporateCustomer hepsiBurada = new CorporateCustomer();
        hepsiBurada.customerNumber = "78910";

        UnionCustomer union1 = new UnionCustomer();
        union1.customerNumber = "99999";

        CustomerManager customerManager = new CustomerManager();
        //polymorphism
        //customerManager.add(hepsiBurada);
        //customerManager.add(engin);

        Customer[] customers = {engin, hepsiBurada, union1};
        customerManager.addMultiple(customers);

    }

}
