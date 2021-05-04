package inheritance2;

public class Main {
    public static void main(String[] args) {

        CustomerManager customerManager = new CustomerManager();
        customerManager.add(new DatabaseLogger());
        customerManager.add(new FileLogger());
        customerManager.add(new EmailLogger());

    }
}

