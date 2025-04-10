package Exception;

import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter age:");
        int age = sc.nextInt();
        sc.close();  // Close the scanner after use

        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            throw new TestVote("You are not eligible to vote (age < 18)");
        }
    }
}

