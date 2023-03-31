public class Main {
    public static void main(String[] args) {
        String login = "user";
        String password = "password";
        String confirmPassword = "password1";

        System.out.println(Validator.validate(login,password,confirmPassword));
    }
}