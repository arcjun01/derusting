
import java.util.ArrayList;

public class StringPractice {
  public static void main(String[] args) {
    // Create a string with at least 5 characters and assign it to a variable
    String word = "Computer";

    // Find the length of the string
    int length = word.length();
    System.out.println("Length of this word is: " + length);

    // Concatenate (add) two strings together and reassign the result
    String word2 = "Table";
    String addedWord = word + word2;
    System.out.println("Concatenated Strings: " + addedWord);

    // Find the value of the character at index 3
    char findChar = word.charAt(3);
    System.out.println("Character at index 3 is: " + findChar);

    // Check whether the string contains a given substring (i.e. does the string have "abc" in it?)
    boolean containsSubsting = word.contains("abc");
    System.out.println("Does it contain 'abc'? " + containsSubsting); //false

    // Iterate over the characters of the string, printing each one on a separate line
    System.out.println("-- Prints each letter in every line -- ");
    for (int i = 0; i < word.length(); i++) {
      System.out.println(word.charAt(i));
    }

    // Create an ArrayList of Strings and assign it to a variable
    ArrayList<String> strList = new ArrayList<>();

    // Add multiple strings to the List (OK to do one-by-one)
    strList.add("Camera");
    strList.add("Pen");
    strList.add("Book");

    // Join all of the strings in the list together into a single string separated by commas
    // Use a built-in method to achieve this instead of using a loop
    String allStrings = String.join(", ", strList);
    System.out.println("Joined string: " + allStrings);

    // Check whether two strings are equal
    String word3 = "Paper";
    boolean areEqual = word.equals(word3);
    System.out.println("Are they equal? " + areEqual);

    /*
     * Reminder!
     * 
     * When comparing objects in Java we typically want to use .equals, NOT ==.
     * 
     * We use == when comparing primitives (e.g. int or char).
     */
  }
}
