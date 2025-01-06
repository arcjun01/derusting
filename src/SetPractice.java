
import java.util.HashSet;

public class SetPractice {
  public static void main(String[] args) {
    // Create a HashSet of Strings and assign it to a variable of type Set
    HashSet<String> wordSet = new HashSet<>();

    // Add 3 elements to the set
    // (It's OK to do it one-by-one)
    wordSet.add("Good");
    wordSet.add("Morning");
    wordSet.add("Everyone");

    // Check whether the Set contains a given String
    String checkString = "Hello";
    boolean contains = wordSet.contains(checkString);
    System.out.println("Does this set contains the word " + " '" + checkString + "'? " + contains);

    // Remove an element from the Set
    wordSet.remove("Good");

    // Get the size of the Set
    int size = wordSet.size();
    System.out.println("Size of Set: " + size);

    // Iterate over the elements of the Set, printing each one on a separate line
    System.out.println("Here are the elements in the set:");
    for (String word : wordSet) {
      System.out.println(word);
    }

    /*
     * Warning!
     * 
     * The iteration order over the items in a HashSet is NOT GUARANTEED.
     * 
     * Even running the exact same program multiple times may give different results.
     * Do not use a HashSet if order is important! You can use a TreeSet if you
     * want items in sorted order, or an array or List if you want them in a specified
     * order.
     * 
     * Also remember that sets do NOT have duplicates.
     */
  }
}
