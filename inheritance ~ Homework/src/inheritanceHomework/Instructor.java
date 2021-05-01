package inheritanceHomework;

public class Instructor extends User {

    private String branch;
    private String biography;

    public Instructor() {
        super();
    }

    public Instructor(int id, String fullName, String emailAdress, String password, String imageUrl, String branch, String biography) {
        super(id, fullName, emailAdress, password, imageUrl);
        this.branch = branch;
        this.biography = biography;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

}
