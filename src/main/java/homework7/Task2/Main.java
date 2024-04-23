package homework7.Task2;


import static homework7.Task2.EmailValidator.isEmailValid;

public class Main {
    public static void main(String[] args) {

        String email1 = "test@test.com";
        String email2 = "test@.com";
        System.out.println("email " + email1 + " is valid?: " + isEmailValid(email1));
        System.out.println("email " + email2 + " is valid?: " + isEmailValid(email2));

    }

}
