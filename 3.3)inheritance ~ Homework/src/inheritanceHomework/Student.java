package inheritanceHomework;

public class Student extends User {

    private String schoolName;
    private String schoolWebsiteUrl;

    public Student() {
        super();
    }

    public Student(int id, String fullName, String emailAdress, String password, String imageUrl, String schoolName, String schoolWebsiteUrl) {
        super(id, fullName, emailAdress, password, imageUrl);
        this.schoolName = schoolName;
        this.schoolWebsiteUrl = schoolWebsiteUrl;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolWebsiteUrl() {
        return schoolWebsiteUrl;
    }

    public void setSchoolWebsiteUrl(String schoolWebsiteUrl) {
        this.schoolWebsiteUrl = schoolWebsiteUrl;
    }

}

