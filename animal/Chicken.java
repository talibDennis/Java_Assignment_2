
package animal;

public class Chicken extends Animal {
  private int numOfEggs;

  // Explicit contructor that calls 
  public Chicken(String type) {
    super(type); // calls parent's constructor
    this.numOfEggs = super.randNum.nextInt(9) + 1; // 1-9
  } // constructor

  // getters
  public int getNumOfEggs() {
    return this.numOfEggs;
  }

  // setters
  public void setNumOfEggs(int numOfEggs) {
    this.numOfEggs = numOfEggs;
  }

} // class

