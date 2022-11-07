/* This is a stub for the House class */
import java.util.ArrayList;

public class House extends Building {
  private ArrayList<String> residents;
  private boolean hasDiningRoom;
  private boolean elevator;

  /**
   * Constructor 
   * @param name House's name
   * @param address House's adress
   * @param nFloors number of total floors
   * @param hasDiningRoom whether the house has a dining room or not
   * @param elevator true if elevator is available.
   */
  public House(String name, String address, int nFloors, boolean hasDiningRoom, boolean elevator) {
    super(name, address, nFloors);
    this.residents = new ArrayList<String>();
    this.hasDiningRoom = hasDiningRoom;
    this.elevator = elevator;
    System.out.println("You have built a house: 🏠");
  }

  /**
   * overloaded constructor
   * @param name House's name
   * @param address House's adress
   * @param nFloors number of total floors
   */
  public House(String name, String address, int nFloors){
    super(name,address,nFloors);
    this.elevator = false;
    this.hasDiningRoom = false;
    System.out.println("You have built a house: 🏠");
   }

   /**
    * overloaded constructor
    */
   public House(){
    super();
    this.elevator = false;
    this.hasDiningRoom = false;
    System.out.println("You have built a house: 🏠");
   }


  /**
   * accessor for hasDiningRoom
   * @return true/false
   */
  public boolean hasDiningRoom(){
    return this.hasDiningRoom;
  }

  /**
   * accessor for the size of the residents array
   * @return int
   */
  public int nResidents(){
    return this.residents.size();
  }

  /**
   * add a student into the residents array
   * @param name student's name
   */
  public void moveIn(String name){
    this.residents.add(name);
  }

  /**
   * remove a student from the residents array
   * @param name student's name
   * @return confirmation message
   */
  public String moveOut(String name){
    this.residents.remove(name);
    return name + " has moved out";
  }

  /**
   * determines whether a student lives in the house or not
   * @param person student's name
   * @return true/false
   */
  public boolean isResident(String person){
    return this.residents.contains(person);
  }

  
  /**
   * If the elevator is available, then operate goToFloor(). Else error message is printed. 
   * @param n floors to go to
   */
  public void goToFloor(int n){
    if (this.elevator == true){
      super.goToFloor(n);
    }else{
      System.out.println("Elevator unavailable, try goUP() and goDown()");
    }
  }

  /**
   * showOptions overrides
   */
  public void showOptions() {
    System.out.println("Available options at " + this.name + ":\n + enter() \n + exit() \n + goUp() \n + goDown()\n + goToFloor(n)\n + hasDiningRoom()\n + nResidents()\n + moveIn()\n + moveOut()\n + isResident()");

}

  /**
   * Main, used for testing
   * @param args Convention
   */
  public static void main(String[] args) {
    House house = new House("Capen", "16 Elm Street",3,false,true);
    house.showOptions();
    house.enter();
    house.goToFloor(2);
    
  }

}