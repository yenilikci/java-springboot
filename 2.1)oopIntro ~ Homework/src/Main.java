public class Main {

    public static void main(String[] args) {
        Category programlama = new Category(1, "Programlama");
        Category[] categories = {programlama};

        System.out.println("\nKategoriler: ");
        for (Category category : categories) {
            System.out.println(category._name);
        }

        Instructor enginDemirog = new Instructor(1, "Engin Demiroğ", "engindemirog.png", "Değerli bir insan değerli bir eğitmen");
        Instructor[] instructors = {enginDemirog};

        System.out.println("\nEğitmenlerimiz: ");
        for (Instructor instructor : instructors) {
            System.out.println(instructor._name);
        }

        Course progGiris = new Course(
                1,
                "Programlamaya Giriş Temel Kurs",
                "PYTHON, JAVA, C# gibi tüm programlama dilleri için temel programlama mantığını anlaşılır örneklerle öğrenin.",
                0,
                1,
                1
        );

        Course sharpAngular = new Course(
                2,
                "Yazılım Geliştirici Kampı (C# - ANGULAR)",
                "2 ay sürecek ücretsiz ve profesyonel bir programla, sıfırdan yazılım geliştirme öğreniyoruz.",
                0,
                1,
                1
        );
        Course javaReact = new Course(
                2,
                "Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)",
                "Harika bir eğitim",
                0,
                1,
                1
        );

        Course[] courses = {
                progGiris,
                sharpAngular,
                javaReact
        };

        System.out.println("Kurs Listesi: ");
        for (Course course : courses) {
            CourseManager.courseDetails(course, categories, instructors);
        }

        User melih = new User(1, "Melih Çelik", "email@email.com", "123456", "user_1_pp.png");
        UserManager userManager = new UserManager();
        userManager.editProfile(melih);

        CourseManager courseManager = new CourseManager();
        courseManager.enrollInTheCourse(javaReact);
        courseManager.takeAttendance(javaReact, melih);

        String[] uploadImages = {"odevss1.png", "odevss2.png"};
        Comment melihComment = new Comment(1, 1, 3, "Çok faydalı geçiyor", uploadImages);

        CommentManager commentManager = new CommentManager();
        commentManager.addComment(javaReact, melihComment);
        commentManager.updateComment(melihComment, "Çok faydalı ve eğlenceli geçiyor");

        courseManager.leaveTheCourse(javaReact);
        userManager.delete(melih);

    }


}
