package com.other.exception;

public class EmailCheck {

    public static void main(String[] args) {
        extracted();
    }

    private static void extracted() {
        String email = "abc@something.com";
        try {
            System.out.println(isValidEmail(email));
        } catch (ComNotFound | EmailSignNotFound e) {
            System.out.println("Please add @ sign to make it legit");
        }
    }

    static boolean isValidEmail(String email) throws ComNotFound, EmailSignNotFound {
        if (!email.endsWith(".com"))
            throw new ComNotFound("Email is not Valid (.com required) " + email);
        if (!email.contains("@"))
            throw new EmailSignNotFound("Email is not Valid (\"@\") " + email);
        return true;
    }
}

