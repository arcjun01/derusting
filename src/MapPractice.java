import java.util.HashMap;
import java.util.Map;

public class MapPractice {
  public static void main(String[] args) {
    // Create a HashMap with String keys and Integer values and
    // assign it to a variable of type Map
    HashMap<String, Integer> maps = new HashMap<>();

    // Put 3 different key/value pairs in the Map
    // (it's OK to do this one-by-one)
    maps.put("coin", 2);
    maps.put("battery", 5);
    maps.put("chair", 12);

    // Get the value associated with a given key in the Map
    int batteryKey = maps.get("battery");
    System.out.println("Value for battery: " + batteryKey);

    // Find the size (number of key/value pairs) of the Map
    int mapSize = maps.size();
    System.out.println("The Map size is: " + mapSize);

    // Replace the value associated with a given key (the size of the Map shoukld not change)
    maps.put("battery", 10);

    // Check whether the Map contains a given key
    String containsKey = "battery";
    System.out.println("Contains '" + containsKey + "' key? " + maps.containsKey(containsKey));

    // Check whether the Map contains a given value
    int containsValue = 4;
    System.out.println("Contains '" + containsValue + "' value? " + maps.containsValue(containsValue));

    // Iterate over the keys of the Map, printing each key
    System.out.println("KEYS:");
    for (String key : maps.keySet()) {
      System.out.println(key);
    }

    // Iterate over the values of the map, printing each value
    System.out.println("VALUES:");
    for (int value : maps.values()) {
      System.out.println(value);
    }

    // Iterate over the entries in the map, printing each key and value
    System.out.println("Here are entries in the Map" + " (key and its value)");
    for (Map.Entry<String, Integer> entry : maps.entrySet()) {
      String key = entry.getKey();
      Integer value = entry.getValue();
      System.out.println(key + ": " + value);
    }

    /*
     * Usage tip!
     * 
     * Maps are great when you want a specific key to value mapping.
     * Example: The key could be a person's name, and the value could be their phone number
     * 
     * However if your keys are simple ascending 0-indexed integers with no gaps
     * (0, 1, 2, 3, 4...) then an array or List is likely a better choice.
     * Example: If you want to store the order of songs in a playlist.
     * 
     * If you're finding that you're just wanting to store unordered values and the keys
     * are unimportant, a Set may be a better choice.
     * Example: If you want to hold the student ID numbers of everyone in a course,
     * and you don't care about any ordering.
     */
  }
}
