package animal;

public class Cow extends Animal {
  private int milkPerDay;

  // Explicit constructor that calls 
  public Cow(String type) {
    super(type);
    this.milkPerDay = super.randNum.nextInt(20) + 1; // 1-20
  } // constructor

  // getters
  public int getMilkPerDay() {
    return this.milkPerDay;
  }

  // setters
  public void setMilkPerDay(int milkPerDay) {
    this.milkPerDay = milkPerDay;
  }

} // clas