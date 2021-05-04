package inheritanceHomework;

public class UserManager {

    public void add(User user) {
        System.out.println(user.getFullName() + " mail adresine sahip kullanıcı eklendi");
    }

    public void update(User user) {
        System.out.println(user.getFullName() + " mail adresine sahip kullanıcı güncellendi");
    }

    public void delete(User user) {
        System.out.println(user.getFullName() + " mail adresine sahip kullanıcı silindi");
    }


}
