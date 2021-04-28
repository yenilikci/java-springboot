public class UserManager { //iş sınıfı

    public void editProfile(User user) {
        System.out.println("================================================================================");
        System.out.println("Sayın, " + user._name + " profilinizi düzenleme işleminiz başarılı");
        System.out.println("================================================================================");
    }

    public void delete(User user) {
        System.out.println("================================================================================");
        System.out.println("Sayın, " + user._name + " " + user._email + " adresinize gelen hesap silme onay mailindeki linkten, hesabınızı silme işlemini başarıyla tamamlayabilirsiniz.");
        System.out.println("================================================================================");
    }


}
