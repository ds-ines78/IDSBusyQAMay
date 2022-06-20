package assignfive;

import java.util.Scanner;

public class VotingAgeTest {
    static int age;

    static void checkAge() throws VotingAgeException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        age = sc.nextInt();

        if (age < 18)
            throw new VotingAgeException("You are not eligible to vote");
        else
            System.out.println("You can vote");
    }

    public static void main(String[] args) {
        try {
            checkAge();
        } catch (Exception e) {
            System.out.println("Caught an Exception: \n " + e);
        } finally {
            System.out.println("Test done");
        }
    }
}

