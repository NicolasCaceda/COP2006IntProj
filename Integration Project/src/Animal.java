/**
 * An animal is an animal and that's it.
 * 
 * @author Nicolas Caceda
 *
 */
public class Animal {
  private String name;
  private String gender;
  private int age;

  /**
   * Constructor for an animal.
   * 
   * @param name name of the animal.
   * @param gender gender of the animal.
   * @param age age of the animal.
   */
  public Animal(String name, String gender, int age) {
    System.out.println("Making an Animal");
    this.name = name;
    this.gender = gender;
    this.age = age;
  }

  /**
   * Prints the sound an animal makes.
   * 
   */
  public void makeSound() {
    System.out.println("This animal has no sound.");
  }

  /**
   * Prints the breed of the animal.
   */
  public void findBreed() {
    System.out.println("This animal has no breed");
  }

  /**
   * Gets the name of the animal.
   * 
   * @return String
   */
  public String getName() {
    return name;
  }

  /**
   * Sets the name of the animal.
   * 
   * @param name name of the animal.
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Gets the age of the animal.
   * 
   * @return int
   */
  public int getAge() {
    return age;
  }

  /**
   * Sets the age of the animal.
   * 
   * @param age age of the animal
   */
  public void setAge(int age) {
    this.age = age;
  }

  /**
   * Gets the age of the animal.
   * 
   * @return String
   */
  public String getGender() {
    return gender;
  }

  /**
   * Sets the gender of the animal.
   * 
   * @param gender gender of the animal.
   */
  public void setGender(String gender) {
    this.gender = gender;
  }
}
