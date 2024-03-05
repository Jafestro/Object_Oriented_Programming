package module05.Task5_4.task01;

public class PalindromeChecker {

    public boolean isPalindrome(String palindrome){
        String processedInput = palindrome.replaceAll(" ", "");
        String word = processedInput.toLowerCase();
        String reversedWord = new StringBuilder(word).reverse().toString();
        return word.equals(reversedWord);
    }
    public boolean isPalindrome(double palindrome){
        return isPalindrome(String.valueOf(palindrome));
    }
    public boolean isPalindrome(int palindrome){
        return isPalindrome(String.valueOf(palindrome));
    }
}
