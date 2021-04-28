public class Category { //kategori özellik sınıfı

    int _id;
    String _name;

    public Category() {
        System.out.println("Kategori oluşturuldu!");
    }

    public Category(int id, String name) {
        this();
        this._id = id;
        this._name = name;
    }

}
