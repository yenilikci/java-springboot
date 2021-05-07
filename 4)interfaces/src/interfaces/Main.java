package interfaces;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Logger[] loggers = {new SmsLogger(), new EmailLogger(), new FileLogger()};
        CustomerManager customerManager = new CustomerManager(loggers);
        Customer melih = new Customer(1, "Melih", "Çelik");
        customerManager.add(melih);


    }

}
