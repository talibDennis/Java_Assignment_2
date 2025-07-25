
package animal;

public class Chicken extends Animal {
  private String eggColor;

  // Explicit contructor that calls 
  public Chicken(String type) {
    super(type); // calls parent's constructor
    this.eggColor = eggColor;
  } // constructor

  // getters
  public String getEggColor() {
    return this.eggColor;
  }

  // setters
  public void setEggColor(String eggColor) {
    this.eggColor = eggColor;
  }

} // class

