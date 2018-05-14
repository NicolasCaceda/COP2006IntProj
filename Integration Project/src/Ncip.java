import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * Welcome to my integration project. This is a conglomeration of everything I
 * have learned.
 * 
 * @author Nicolas Caceda
 */
public class Ncip {

  static Scanner scan = new Scanner(System.in);

  /**
   * The main method runs automatically when the program starts.
   * 
   * @param arg
   *          Default parameter for main
   */
  public static void main(String[] args) {

    organizeProgram();

    scan.close();
  }

  /**
   * Makes a neat little line.
   */
  public static void makeLine() {
    System.out.println("--------------------------");
  }

  /**
   * Controls my entire program with its switch block.
   */
  public static void organizeProgram() {

    makeLine();

    System.out.println("Do you wish to continue viewing my code? Y/N");

    String answer = scan.next();

    if (answer.equalsIgnoreCase("Y")) {

      System.out.println(
          "Methods:" + '\n' + "1 - Intro Print" + '\n' + "2 - Math" + '\n'
              + "3 - Getter And Setters" + '\n' + "4 - callWithArgument(6)"
              + '\n' + "5 - demonstrateConstructor(1, 2, 3)" + '\n'
              + "6 - Addition Array" + '\n' + "7 - Find The Smallest Value"
              + '\n' + "8 - Explain Relation and Conditional Operators" + '\n'
              + "9 - Dictionary" + '\n' + "10 - Seach Array for Value" + '\n'
              + "11 - Demonstrate String Maniupulation" + '\n'
              + "12 - 2D Array Search" + '\n'
              + "13 - Polymorphism and Inheirtance" + '\n'
              + "14 - Demonstrate Queues" + '\n' + "15 - Demonstrate Stacks");

      System.out.print("Please select a NUMBER to explore a method: ");

      // Requires a user to input a number
      while (!scan.hasNextInt()) {

        System.out.println("Not a number. Try again.");
        scan.next();

      }

      int section = scan.nextInt();

      // Switch statement to organize my program
      switch (section) {
        case 1:
          System.out.println("");
          showPrint();
          break;
        case 2:
          System.out.println("");
          doMath();
          break;
        case 3:
          System.out.println("");
          makeObjects();
          break;
        case 4:
          System.out.println("");
          System.out.println(callWithArgument(6));
          break;
        case 5:
          System.out.println("");
          demonstrateConstructor();
          break;
        case 6:
          System.out.println("");
          addArray();
          break;
        case 7:
          System.out.println("");
          findSmallestValue();
          break;
        case 8:
          System.out.println("");
          explainOperators();
          break;
        case 9:
          System.out.println("");
          demonstrateMap();
          break;
        case 10:
          System.out.println("");
          locateValue();
          break;
        case 11:
          System.out.println("");
          demonstrateStringManipulation();
          break;
        case 12:
          System.out.println("");
          demonstrate2DArray();
          break;
        case 13:
          System.out.println("");
          demonstratePolyAndInherit();
          break;
        case 14:
          System.out.println("");
          demonstrateQueues();
          break;
        case 15:
          System.out.println("");
          demonstrateStacks();
          break;
        default:
          System.out.println("Not a valid number. Please try again");
          organizeProgram();
          break;
      }
      organizeProgram();
    } else if (answer.equalsIgnoreCase("N")) {
      System.out.print("See ya.");
    } else {
      System.out.println("What? Try again.");
      organizeProgram();
    }

  }

  /**
   * Creates a string and then prints it.
   */
  public static void showPrint() {

    String greeting = "Hello, world! Welcome to my Intergration Project.";

    System.out.println(greeting);

  }

  /**
   * Shows some arithmetic.
   */
  public static void doMath() {

    /*
     * Here I declare two variables: variableX and variableY. A variable is just
     * memory that contains a data type or getting a box to put stuff in. You
     * can declare a variable like I did here or declare a variable and assign
     * something to it immediately, which I also did. There are 8 primitive data
     * types in java: byte, short, int, long, float, double, char, and boolean.
     * byte- 8 bit signed twos complement integer. Max value of 127 and min
     * value of -128. short- 16 bit signed twos complement integer. Max value of
     * 32767 and min value of -32768 int- 32 bit signed twos complement integer.
     * Max value of [(2^31) - 1] and min value of -(2^31) long- 64 bit signed
     * tows complement integer. max value [(2^63) -1] and min value of -(2^63)
     * float- A less precise double that needs to end in an f or F. 32 bit
     * precision. double- 64 bit precision. Can also end in a D or D char- A
     * single 16 bit unicode character. boolean- A boolean can either be true or
     * false
     */

    // Next comment gives an error
    /// float error = 3.2;
    // correct format
    // float a = 3.2f;
    // Also acceptable:
    // double S = 3.2d;
    // double S = 3.2D;
    // double S = 3.2;

    System.out.println("Math demonstration:");

    int variableX = 3;
    int variableY = 2;
    int result;
    double resultDouble;

    System.out.println("Your 2 integers are: " + variableX + " & " + variableY);

    result = variableX + variableY;
    System.out.println("Addition of the two integers: " + result);

    result = variableX - variableY;
    System.out.println("Subtraction of the two integers: " + result);

    result = variableX * variableY;
    System.out.println("Multiplication of the two integers: " + result);

    /*
     * This is integer division. The fractional part of the result is
     * "thrown out". If you divide 3 by 2 your answer would be 1 + (1/2), which
     * is 1.5. Integer division would give you the answer of 1. It just floors
     * the answer.
     */
    result = variableX / variableY;
    System.out.println("Integer division of the two integers: " + result);

    // This is called casting. It temporarily turns into another data type.
    resultDouble = (double) variableX / variableY;
    System.out.println("Division of the two integers: " + resultDouble);

    result = variableX % variableY;
    System.out.println("The remainder of the two integers:" + result);

    resultDouble = Math.pow((double) variableX, (double) variableY);
    System.out.println(variableX + "^" + variableY + ": " + resultDouble);

  }

  /**
   * Creates objects from the Objectblueprint class.
   */
  public static void makeObjects() {

    System.out.println("Getter and setter demonstration:");

    ObjectBlueprint object1 = new ObjectBlueprint();
    object1.setField1(7);
    System.out.println(object1.getField1());

    ObjectBlueprint object2 = new ObjectBlueprint();
    object2.setField2(3);
    System.out.println(object2.getField2());

    ObjectBlueprint object3 = new ObjectBlueprint();
    object3.setField3(6);
    System.out.println(object3.getField3());

  }

  /**
   * Is a method with a parameter that is an integer.
   * 
   * @param parameter
   *          a number that is going to be added to 36
   * @return int
   */
  public static int callWithArgument(int parameter) {

    System.out.println("Parameter and argument demonstration:");

    // Adds 36 to whatever the argument was
    return parameter + 36;

  }

  /**
   * Constructor is used and then printed out to the screen.
   */
  public static void demonstrateConstructor() {

    System.out.println("Constructor demonstration:");

    ObjectBlueprint constructor1 = new ObjectBlueprint(1, 2, 3);
    System.out.println(constructor1.getField1());
    System.out.println(constructor1.getField2());
    System.out.println(constructor1.getField3());

  }

  /**
   * Uses a for loop to iterate through an array and add them all together.
   */
  public static void addArray() {

    int[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    System.out.println(
        "Your array contains the integers: " + Arrays.toString(intArray));

    int result = 0;

    for (int i = 0; i < intArray.length; i++) {

      result += intArray[i];

    }

    System.out.println("Your sum is: " + result);

  }

  /**
   * Uses a for look to locate the smallest number in the array and its index.
   */
  public static void findSmallestValue() {

    int[] intArray = { 113, 42, 36, 42, 11425, 65, 87, 89, 9, 100 };
    System.out.println(
        "Your array contains the integers: " + Arrays.toString(intArray));

    int smallest = intArray[0];
    int index = 0;

    for (int i = 0; i < intArray.length; i++) {

      if (intArray[i] < smallest) {

        smallest = intArray[i];
        index = i;

      }

    }
    System.out.println(
        "Smallest value is: " + smallest + '\n' + "The index is " + index);
  }

  /**
   * Explains the basic conditional operators and relational operators.
   */
  public static void explainOperators() {
    System.out.println("Java has Relation and Conditional Operators" + '\n'
        + "==, !=, >, >=, <, <=, &&, and ||." + '\n'
        + "each of these respectively means equal to, not equal to, greater "
        + "than," + " "
        + "greater than or equal to, less than, less than or equal to, "
        + "AND, and OR. " + '\n'
        + "You can use each of these in while, do while, if-then-else"
        + " statmement to control the flow of your program.");

    System.out.println("");

    int a = 3;
    int b = 5;

    System.out.println("A is assigned: " + a + "\n" + "B is assigned " + b);

    // Tests equivalence
    if (a == b) {
      System.out.println("A and B are equal");
    } else if (a > b) {
      System.out.println("A is greater than A.");
    } else if (a < b) {
      System.out.println("A is less than B");
    } else {
      System.out.println("How did you get here?");
    }

    // Tests sign
    if (a < 0 && b < 0) {
      System.out.println("Both numbers are negative.");
    } else if (a > 0 && b > 0) {
      System.out.println("Both numbers are positive.");
    } else if (a > 0 || b > 0) {
      System.out.println("At least 1 number is positive");
    } else {
      System.out.println("Once again, how did you get here?");
    }

  }

  /**
   * Demonstrates map by putting things into a map and displaying one.
   */
  public static void demonstrateMap() {

    // Creates a map
    Map<String, Integer> map = new HashMap<String, Integer>();

    // Puts things into the map Key - Value
    map.put("One", 1);
    map.put("Two", 2);
    map.put("Three", 3);

    // Uses the key to put the value into memory
    int mapInt = map.get("Two");

    // Prints the value
    System.out.println(mapInt);
  }

  /**
   * Checks if a value is in the Array.
   */
  public static void locateValue() {

    int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

    int number = ("Why tho.").length();
    boolean match = false;
    boolean goodInput = false;

    while (goodInput == false) {
      try {
        System.out.print("Enter a number to check if it's in the Array: ");
        number = scan.nextInt();

        goodInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("Not a number" + '\n');
        scan.nextLine();
      }
    }

    // Searches array
    for (int i = 0; i < array.length; i++) {
      if (array[i] == number) {
        /*
         * Flips the value of match to being true and doesn't allow the next if
         * statement to run
         */
        match = !match;
        System.out.println(number + " is in the array at index " + i);
        System.out.println();
      }
    }

    // This allows me to not spam the user if the value isn't found
    if (!match) {
      System.out.println("Value was not found.");
      System.out.println();
    }

    // Commented out for future reference
    // Arrays.sort(array);
    //
    // //Array must be sorted before a binarySearch
    // if (Arrays.binarySearch(array, number) >= 0) {
    // System.out.println(number + " is in the Array.");
    // } else {
    // System.out.println(number + " is not in the Array.");
    // }
  }

  /**
   * Shows some string manipulation with StringBuilder and normal strings for
   * palindromes.
   */
  public static void demonstrateStringManipulation() {

    String textOne = "Hello";
    String textTwo = "Racecar";
    System.out.println("textOne is assigned: " + "Hello" + '\n'
        + "textTwo is assigned: " + "Racecar");

    textOne = textOne.toLowerCase();

    int lengthTextOne = textOne.length();
    char[] textOneArray = new char[lengthTextOne];
    char[] testArray = new char[lengthTextOne];

    // puts textOne in an array
    for (int i = 0; i < lengthTextOne; i++) {
      textOneArray[i] = textOne.charAt(i);
    }

    // reverses the textOne array
    for (int j = 0; j < lengthTextOne; j++) {
      testArray[j] = textOneArray[lengthTextOne - 1 - j];
    }

    if (Arrays.equals(textOneArray, testArray)) {
      System.out.println("textOne is a palindrome");
    } else {
      System.out.println("textOne is not a palindrome");
    }

    StringBuilder textTwoEnchanced = new StringBuilder(textTwo.toLowerCase());
    textTwoEnchanced.reverse();

    if (textTwo.equalsIgnoreCase(textTwoEnchanced.toString())) {
      System.out.println("textTwo is a palindrome");
    } else {
      System.out.println("textTwo is not a palindrome");
    }

  }

  /**
   * Demonstrates a 2D array by searching through the first row and each
   * individual column then then next row and each of columns.
   */
  public static void demonstrate2DArray() {

    // 2D array with with 1 row and 10 columns
    int[][] arrayButDifferent = { { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 },
        { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 } };

    // same set up as locate Value
    int number = ("Why tho.").length();
    boolean match = false;
    boolean goodInput = false;

    while (goodInput == false) {
      try {
        System.out.print("Enter a number to check if it's in the Array: ");
        number = scan.nextInt();
        goodInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("Not a number" + '\n');
        scan.nextLine();
      }
    }

    // Searches for i being zero first then searches each column
    for (int i = 0; i < arrayButDifferent.length; i++) {
      for (int j = 0; j < arrayButDifferent[i].length; j++) {
        if (arrayButDifferent[i][j] == number) {
          match = !match;
          System.out.println("Number was found in row " + i + " column " + j);
        }
      }
    }

    if (!match) {
      System.out.println("Value was not found.");
      System.out.println();
    }

  }

  /**
   * Demonstrates Polymorphism and Inheritance.
   */
  public static void demonstratePolyAndInherit() {
    /*
     * First of all I need to define what inheritance is. Inheritance is a
     * "Is a" relationship. This is when an object is a specialized version of
     * another object. In my example I use an animal and a cat.
     * 
     * While polymorphism allows the SUBCLASSES to have methods with the same
     * name as the SUPER CLASS. In my example I use the makeSound and findBreed
     * methods to show this.
     */

    // Miller is one of my cats.
    Cat miller = new Cat("Miller", "Male", 4, "mrrrrr", "Unknown");
    Animal cow = new Animal("Daisy", "Male", 4);

    // An Animal is an Animal
    cow.getName();
    cow.getGender();
    cow.getAge();
    cow.makeSound();
    cow.findBreed();

    // A cat is an animal, but an animal is not a cat.
    miller.getName();
    miller.getGender();
    miller.getAge();
    miller.makeSound();
    miller.findBreed();

  }

  /**
   * Just shows some useful stuff for queues. A Queue is a FIRST IN FIRST OUT
   * data structure. Think of it like putting marbles into a downward tube with
   * holes on both ends.
   */
  public static void demonstrateQueues() {

    Queue<Integer> queue1 = new ArrayBlockingQueue<Integer>(3);

    // Puts in a few digits to the queue.
    for (int i = 0; i < 3; i++) {
      System.out.println("Adding '" + i + "' to queue.");
      queue1.add(i);
    }

    // Shows the head of the queue
    System.out.println("The head of the queue is " + queue1.peek());
    System.out.println("");

    // Tries to add a 4th thing to the queue.
    try {
      System.out.println("Attempting to add 1515123 to Queue.");
      queue1.add(1515123);
    } catch (IllegalStateException e) {
      System.out.println("Attempt failed.");
    }

    System.out.println("");

    // Displays items in queue
    System.out.println("Items in queue are:");
    for (Integer value : queue1) {
      System.out.println(value);
    }

    System.out.println("");

    // Removes the head of the queue
    System.out.println("Removing from queue...");
    queue1.remove();

    // Displays items in queue
    System.out.println("Items in queue are:");
    for (Integer value : queue1) {
      System.out.println(value);
    }

    System.out.println("The head of the queue is now " + queue1.peek());

  }

  /**
   * Shows some useful stuff for stacks. A Stack is a FIRST IN LAST OUT data
   * structure. Think of it of stacking cards, but then to remove them you have
   * to only take off the top.
   */
  public static void demonstrateStacks() {

    Stack<Integer> stack = new Stack<Integer>();

    // adds three to a stack
    for (int i = 0; i < 3; i++) {
      System.out.println("Adding '" + i + "' to stack.");
      stack.push(i);
    }

    System.out.println("");

    // Trying to remove 4 from stack.
    try {
      for (int j = 0; j < 4; j++) {
        System.out.println("Top of the stack is " + stack.peek());
        System.out.println("Removing one");
        stack.pop();
        System.out.println(stack);
      }
    } catch (EmptyStackException e) {
      System.out.println("Can't remove anymore; stack is empty.");
    }

  }

}
