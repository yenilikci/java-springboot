public class CommentManager { //iş sınıfı

    //kursa yorum atma
    public void addComment(Course course, Comment comment) {
        System.out.println("================================================================================");
        System.out.println(course._title + " kursuna " + comment._detail + " yorumunuz başarıyla eklenmiştir!");
        System.out.println("================================================================================");
    }

    //kurs yorum düzenleme
    public void updateComment(Comment comment, String updateComment) {
        comment._detail = updateComment;
        System.out.println("================================================================================");
        System.out.println("Yorumunuz düzenlendi!");
        System.out.println("================================================================================");
    }

}
