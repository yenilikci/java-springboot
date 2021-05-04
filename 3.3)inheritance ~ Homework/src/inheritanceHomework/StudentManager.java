package inheritanceHomework;

public class StudentManager extends UserManager {

    @Override
    public void add(User user) {
        super.add(user);
        System.out.println("Hoşgeldin " + user.getFullName());
    }

    @Override
    public void update(User user) {
        super.update(user);
        System.out.println("Artık güncelsin " + user.getFullName());
    }

    @Override
    public void delete(User user) {
        super.delete(user);
        System.out.println("Aramızdan ayrılmana üzüldük " + user.getFullName());
    }

    public void schoolNameAdd(Student student) {
        System.out.println(student.getFullName() + " için okul bilgisi eklendi");
    }

    public void schoolNameUpdate(Student student) {
        System.out.println(student.getFullName() + " için okul bilgisi güncellendi");
    }

    public void schoolNameDelete(Student student) {
        System.out.println(student.getFullName() + " için okul bilgisi silindi");
    }

}
