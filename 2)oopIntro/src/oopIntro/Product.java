package oopIntro;

public class Product { //özellik sınıfı

    int id;
    String name;
    double unitPrice;
    String detail;

    public Product() {
        System.out.println("Ben çalıştım");
    }

    public Product(int id, String name, double unitPrice, String detail) {
        this(); //default constructor'ı çağırır
        this.id = id;
        this.name = name;
        this.unitPrice = unitPrice;
        this.detail = detail;
    }

}

