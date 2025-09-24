package org.example.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {
    @Test
    public void test1() {
        Palindrome string5Task = new Palindrome();
        boolean palindrome = string5Task.isPalindrome("A man, a plan, a canal: Panama");
        assertTrue(palindrome);
    }

    @Test
    public void test2() {
        Palindrome string5Task = new Palindrome();
        boolean palindrome = string5Task.isPalindrome(".");
        assertTrue(palindrome);
    }

    @Test
    public void test3() {
        Palindrome string5Task = new Palindrome();
        boolean palindrome = string5Task.isPalindrome("0P");
        assertFalse(palindrome);
    }

    @Test
    public void test4() {
        Palindrome string5Task = new Palindrome();
        boolean palindrome = string5Task.isPalindrome2("A man, a plan, a canal: Panama");
        assertTrue(palindrome);
    }

    @Test
    public void test5() {
        Palindrome string5Task = new Palindrome();
        boolean palindrome = string5Task.isPalindrome2(".");
        assertTrue(palindrome);
    }

    @Test
    public void test6() {
        Palindrome string5Task = new Palindrome();
        boolean palindrome = string5Task.isPalindrome2("0P");
        assertFalse(palindrome);
    }

}