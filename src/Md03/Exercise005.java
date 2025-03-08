package Md03;
import java.util.Scanner;

public class Exercise005 {
    public static void main(String[] args) {
        //Palindrome
        //Request a word and determine if it is a palindrome (if it reads the same forwards and backwards).

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = sc.nextLine();

        boolean isPalindrome = true;

        for (int i = 0; i < word.length() / 2; i++) {

            isPalindrome &= (word.charAt(i) == word.charAt(word.length() - 1 - i));
        }

        System.out.println(isPalindrome ? "It is a palindrome." : "It is not a palindrome.");
    }
}
