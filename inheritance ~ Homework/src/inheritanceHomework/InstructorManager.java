package inheritanceHomework;

public class InstructorManager extends UserManager {

    @Override
    public void add(User user) {
        super.add(user);
    }

    @Override
    public void update(User user) {
        super.update(user);
    }

    @Override
    public void delete(User user) {
        super.delete(user);
    }

    public void instructorBranchAdd(Instructor instructor) {
        System.out.println("Eğitmen branşı eklendi");
    }

    public void instructorBranchUpdate(Instructor instructor) {
        System.out.println("Eğitmen branşı güncellendi");
    }

    public void instructorBranchDelete(Instructor instructor) {
        System.out.println("Eğitmen branşı silindi");
    }

}
