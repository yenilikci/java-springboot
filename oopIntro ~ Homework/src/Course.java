public class Course { //kurs özellik sınıfı

    int _id;
    String _title;
    String _detail;
    int _price;
    int _instuctorId;
    int _categoryId;

    public Course() {
        System.out.println("Kurs oluşturuldu!");
    }

    public Course(int id, String title, String detail, int price, int instuctorId, int categoryId) {
        this();
        this._id = id;
        this._title = title;
        this._detail = detail;
        this._price = price;
        this._instuctorId = instuctorId;
        this._categoryId = categoryId;
    }

}
