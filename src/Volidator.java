import java.util.regex.Pattern;

public class Volidator {

    private static final Pattern LOGIN_PATTERN = Pattern.compile("[a-zA-Z0-9_]{1,20}");
    private static final Pattern PASSWORD_PATTERN = Pattern.compile("[a-zA-Z0-9_]{1,20}");

    public static void validate(
            String login,
            String password,
            String confirmPassword
    ) {
        if (!LOGIN_PATTERN.matcher(login).matches()) {
            throw new WrongLoginException("В логине присутствуют недопустимые символы!");
        }
        if (!PASSWORD_PATTERN.matcher(password).matches()) {
            throw new WrongPassworsException("В пароле присутствуют недопустимые символы!");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPassworsException("Пароль не совпадает!");
        }


    }
}

