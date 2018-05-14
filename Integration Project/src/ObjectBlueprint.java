
/** ObjectBlueprint is a class used for showing constructors getters and setters.
 * @author Nicolas Caceda
 *
 */
public class ObjectBlueprint {

  // fields are almost always private
  private int field1;
  private int field2;
  private int field3;

  /**
   * constructor that sets the fields.
   * 
   * @param f1 Generic Parameter.
   * @param f2 Generic Parameter.
   * @param f3 Generic Parameter.
   */
  public ObjectBlueprint(int f1, int f2, int f3) {

    field1 = f1;
    field2 = f2;
    field3 = f3;

  }


  /**
   * Base Constructor.
   */
  public ObjectBlueprint() {}

  /**
   * Sets field 1.
   * 
   * @param f1 Generic Parameter.
   */
  public void setField1(int f1) {

    field1 = f1;

  }

  /**
   * Gets field 1.
   * 
   * @return int
   */
  public int getField1() {

    return field1;

  }


  /**
   * Sets field 2.
   * 
   * @param f2 Generic Parameter.
   */
  public void setField2(int f2) {

    field2 = f2;

  }


  /**
   * Gets field 2.
   * 
   * @return int
   */
  public int getField2() {

    return field2;

  }


  /**
   * Sets field 3.
   * 
   * @param f3 Generic Parameter.
   */
  public void setField3(int f3) {

    field3 = f3;

  }


  /**
   * Gets field 3.
   * 
   * @return int
   */
  public int getField3() {

    return field3;

  }

}
