import java.util.Arrays;

public class CourseManager { //iş sınıfı

    //kursa kaydolma işlemi
    public void enrollInTheCourse(Course course) {
        System.out.println("================================================================================");
        System.out.println(course._title + " kursuna başarıyla kaydoldunuz!");
        System.out.println("================================================================================");
    }

    //kurstan ayrılma
    public void leaveTheCourse(Course course) {
        System.out.println("================================================================================");
        System.out.println(course._title + " kursundan başarıyla ayrıldınız.");
        System.out.println("================================================================================");
    }

    //yoklama almak
    public void takeAttendance(Course course, User user) {
        System.out.println("================================================================================");
        System.out.println("Sayın, " + user._name + " " + course._title + " kursu için yoklamanız alındı!");
        System.out.println("================================================================================");
    }

    public static void courseDetails(Course course, Category[] categories, Instructor[] instructors) {
        System.out.println("==================================== Kurs " + course._id + " ====================================");
        System.out.println("Kurs adı: " + course._title);
        System.out.println("Kurs metni: " + course._detail);
        System.out.println("Kurs fiyatı: " + course._price);
        System.out.println("Kurs eğitmeni: " + instructors[(course._instuctorId) - 1]._name);
        System.out.println("Kurs kategorisi: " + categories[(course._categoryId) - 1]._name);
        System.out.println("================================================================================");
    }

}
