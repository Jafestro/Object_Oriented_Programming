package module05.Task5_4.task01;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeCheckerTest {

   private static PalindromeChecker palindromeChecker;

    @BeforeAll
    static void initialize(){
        palindromeChecker = new PalindromeChecker();
    }
    @Test
    void  checkWithUpperCaseWord(){
        assertEquals(true, palindromeChecker.isPalindrome("Racecar"));
        assertEquals(true, palindromeChecker.isPalindrome("RaCeCAr"));
    }
    @Test
    void checkWithLowerCaseWord(){
      assertEquals(true, palindromeChecker.isPalindrome("racecar"));
    }
    @Test
    void checkWithNumbers(){
       assertEquals(true, palindromeChecker.isPalindrome(123321));
       assertEquals(false, palindromeChecker.isPalindrome(225454548));
    }
    @Test
    void checkWithSymbols(){
      assertEquals(true, palindromeChecker.isPalindrome("+--+"));
      assertEquals(false, palindromeChecker.isPalindrome("++++/*/*/"));
    }

    @Test
    void checkWithMixedInput() {
       assertEquals(true, palindromeChecker.isPalindrome("7racecar7"));
       assertEquals(true, palindromeChecker.isPalindrome("+-+racecar+-+"));
    }
    @Test
    void checkIfWorksWhenGivenNotAPalindromeWord(){
       assertEquals(false, palindromeChecker.isPalindrome("notapalindrome"));
       assertEquals(false, palindromeChecker.isPalindrome(48488112));
       assertEquals(false, palindromeChecker.isPalindrome("dfadf6ad54fa54"));
    }
}