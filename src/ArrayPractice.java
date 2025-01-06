public class ArrayPractice {
  public static void main(String[] args) {
    // Create an array of Strings of size 4
    String[] array = new String[4];

    // Set the value of the array at each index to be a different String
    // It's OK to do this one-by-one
    array[0] = "Dog";
    array[1] = "Cat";
    array[2] = "Duck";
    array[3] = "Wombat";

    // Get the value of the array at index 2
    String index2Value = array[2];
    System.out.println("Index 2 contains the word: " + index2Value);

    // Get the length of the array
    int arrayLength = array.length;
    System.out.println("Length of the array: " + arrayLength);

    // Iterate over the array using a traditional for loop and print out each item
    System.out.println("FOR-LOOP:");
    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }

    // Iterate over the array using a for-each loop and print out each item
    System.out.println("FOR-EACH LOOP: ");
    for (String word : array) {
      System.out.println(word);
    }
    /*
     * Reminder!
     * 
     * Arrays start at index 0
     */
  }
}
