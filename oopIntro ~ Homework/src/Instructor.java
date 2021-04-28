public class Instructor { //eğitmen özellik sınıfı

    int _id;
    String _name;
    String _imageUrl;
    String _about;

    public Instructor() {
        System.out.println("Eğitmen oluşturuldu!");
    }

    public Instructor(int id, String name, String imageUrl, String about) {
        this();
        this._id = id;
        this._name = name;
        this._imageUrl = imageUrl;
        this._about = about;
    }

}
