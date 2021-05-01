public class Main {

    public static void main(String[] args) {

        Product product = new Product();
        product.setId(1);
        product.setName("Laptop");
        product.setDescription("Asus Laptop");
        product.setPrice(5000);
        product.setStockAmount(3);

        ProductManager productManager = new ProductManager();
        productManager.Add(product);

        System.out.println(product.getKod());

        Product product1 = new Product(2, "Laptop2", "Asus Laptop2", 3000, 2, "Siyah");
        System.out.println(product1.getKod());


    }

}
