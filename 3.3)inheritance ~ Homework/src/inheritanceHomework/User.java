package inheritanceHomework;

public class User {

    private int id;
    private String fullName;
    private String emailAdress;
    private String password;
    private String imageUrl;

    public User() {

    }

    public User(int id, String fullName, String emailAdress, String password, String imageUrl) {
        this.id = id;
        this.fullName = fullName;
        this.emailAdress = emailAdress;
        this.password = password;
        this.imageUrl = imageUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }


}
