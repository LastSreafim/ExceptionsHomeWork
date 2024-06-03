public class Main {
    public static void main(String[] args) {

        String login = "login134_";
        String password = "1234a";
        String confirmPassword = "1234a";

        try {
            Volidator.validate(login, password, confirmPassword);
        } catch (WrongLoginException | WrongPassworsException exception) {
            exception.printStackTrace();
        }

        System.out.println("Что-то для проверки кода");
    }
}