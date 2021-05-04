public class User { //kullanıcı özellik sınıfı

    int _id;
    String _name;
    String _email;
    String _password;
    String _imageUrl;

    public User() {
        System.out.println("Kullanıcı oluşturuldu!");
    }

    public User(int id, String name, String email, String password, String imageUrl) {
        this();
        this._id = id;
        this._name = name;
        this._email = email;
        this._password = password;
        this._imageUrl = imageUrl;
    }

}
