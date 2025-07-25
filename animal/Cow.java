package animal;

public class Cow extends Animal {
  private int milkPerDay;

  // Explicit constructor that calls 
  public Cow(String type) {
    super(type);
    this.milkPerDay = super.randNum.nextInt(701) + 50; // 50-701
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