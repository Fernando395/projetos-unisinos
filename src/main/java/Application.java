public class Application {
    public static void main(String[] args) {

        Register register = new Register();
        Menu menu = new Menu();

        menu.greetings();
        register.enterTheData();
        register.accountChoice();
    }
}
