
import animal.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Barn {
  private static Scanner input = new Scanner(System.in);
  private static ArrayList<Cow> cows = new ArrayList<Cow>();
  private static ArrayList<Chicken> chickens = new ArrayList<Chicken>();

  public static void main(String[] args) {

    System.out.print("How many animals would you like to add? ");
    int barnCount = input.nextInt();

    // loop for barn creation
    for(int i = 0; i <barnCount; i++) {
      System.out.print("1) New Cow 2) New Chicken ");
      int type = input.nextInt();

      if(type == 1) { // cow
        Cow cow = new Cow("Cow"); // creates a new cow
        cows.add(cow);
      }
      else {
        Chicken chicken = new Chicken("Chicken"); // creates a new chicken
        chickens.add(chicken);
      }
    } // for

    // printing barn details
    // print cows
    for(int i = 0; i < cows.size(); i++) {
      System.out.printf("Type: %s Milk Per Day: %d (Liters)%n", cows.get(i).getType(), cows.get(i).getMilkPerDay());
    } // cow for

    // print chickens
    for(int i = 0; i < chickens.size(); i++) {
      System.out.printf("type: %s Color of Egg: %dcc%n", chickens.get(i).getType(), chickens.get(i).getEggColor());
    } // chickens

    input.close();

  } // main
  
} // class
