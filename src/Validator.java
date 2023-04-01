import exception.WrongLoginException;
import exception.WrongPasswordException;

import java.util.regex.Pattern;

public class Validator {
    public static boolean validate(
            String login,
            String password,
            String confirmPassword
    ) {
        try {
            if (!Pattern.matches("^[a-zA-Z8-9]{1,9}$", login)) {
                throw new WrongLoginException("Неверный формат логина");
            }
            if (!Pattern.matches("^[a-zA-Z8-9]{1,9}$", password)) {
                throw new WrongPasswordException("Неверный формат пароля");
            }
            if(!password.equals(confirmPassword)) {
                throw new WrongPasswordException("Пароли не совпадают");
            }

        } catch (WrongLoginException wrongLoginException) {
            System.out.println(wrongLoginException.getMessage());
            return false;
        } catch (WrongPasswordException wrongPasswordException) {
            System.out.println(wrongPasswordException.getMessage());
            return false;
        }
        return true;
    }
}
