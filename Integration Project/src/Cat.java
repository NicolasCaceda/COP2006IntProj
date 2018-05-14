
/**
 * A Cat is an Animal, but an animal is not a cat.
 * Cat inherits everything from Animal.
 * 
 * @author Nicolas Caceda
 *
 */
public class Cat extends Animal {
  private String sound;
  private String breed;

  /**
   * Constructor for making a cat.
   * 
   * @param name Name of the cat
   * @param gender Gender of the cat
   * @param age Age of the cat
   * @param sound Sound the cat makes
   * @param breed Breed of the cat
   */
  public Cat(String name, String gender, int age, String sound, String breed) {
    super(name, gender, age);
    setSound(sound);
    setBreed(breed);
  }

  /*
   * (non-Javadoc)
   * 
   * @see Animal#makeSound()
   */
  @Override
  public void makeSound() {
    System.out.println("This animal makes a " + "'" + sound + "'" + " sound.");
  }

  /*
   * (non-Javadoc)
   * 
   * @see Animal#findBreed()
   */
  @Override
  public void findBreed() {
    System.out.println("This animal's breed is: " + breed);
  }

  /**
   * Gets the sound the cat makes.
   * 
   * @return String
   */
  public String getSound() {
    return sound;
  }

  /**
   * Sets the sound the cat makes.
   * 
   * @param sound the sound the cat makes.
   */
  public void setSound(String sound) {
    this.sound = sound;
  }

  /**
   * Gets the breed the cat is.
   * 
   * @return String
   */
  public String getBreed() {
    return breed;
  }

  /**
   * Sets the cat's breed.
   * 
   * @param breed breed of the cat.
   */
  public void setBreed(String breed) {
    this.breed = breed;
  }

}

