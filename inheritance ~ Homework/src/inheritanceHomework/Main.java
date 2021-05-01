package inheritanceHomework;

public class Main {

    public static void main(String[] args) {

        Student ogrenci1 = new Student(1, "Melih Çelik", "melih@mail.com", "1234567", "melih.png", "Kodlama.io", "https://www.kodlama.io/");
        StudentManager studentManager = new StudentManager();
        ogrenci1.setEmailAdress("melih@mailyeni.com");
        studentManager.update(ogrenci1);
        studentManager.schoolNameAdd(ogrenci1);


        Student ogrenci2 = new Student();
        ogrenci2.setId(1);
        ogrenci2.setFullName("Muhammed Çelik");
        ogrenci2.setEmailAdress("muhammed@mail.com");
        ogrenci2.setPassword("987654321");
        ogrenci2.setImageUrl("muhammed.png");
        ogrenci2.setSchoolName("Kodlama.io");
        ogrenci2.setSchoolWebsiteUrl("https://www.kodlama.io/");
        studentManager.update(ogrenci2);
        studentManager.schoolNameUpdate(ogrenci2);
        studentManager.schoolNameDelete(ogrenci2);
        studentManager.delete(ogrenci2);


        Instructor instructor1 = new Instructor(1, "Eğitmen1", "egitmen1@mail.com", "4569871230", "egitmen1.png", "Java", "Burası bio");
        InstructorManager instructorManager = new InstructorManager();
        instructorManager.update(instructor1);
        instructorManager.instructorBranchAdd(instructor1);
        instructorManager.instructorBranchUpdate(instructor1);
        instructorManager.instructorBranchDelete(instructor1);
        instructorManager.delete(instructor1);

        
        Instructor instructor2 = new Instructor();
        instructor2.setId(1);
        instructor2.setFullName("Eğitmen2");
        instructor2.setEmailAdress("egitmen2@mail.com");
        instructor2.setPassword("123987456");
        instructor2.setBiography("Burası bio 2");
        instructor2.setImageUrl("egitmen2.png");
        instructor2.setBranch("C#");
        instructorManager.update(instructor2);
        instructorManager.instructorBranchAdd(instructor2);
        instructorManager.instructorBranchUpdate(instructor2);
        instructorManager.instructorBranchDelete(instructor2);
        instructorManager.delete(instructor2);

    }
}
