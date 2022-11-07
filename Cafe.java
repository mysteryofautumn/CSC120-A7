import javax.print.event.PrintEvent;

/* This is a stub for the Cafe class */
public class Cafe extends Building{
    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number cups remaining in inventory

    /**
     * Constructor for class Cafe
     * @param name Cafe's name
     * @param address Cafe's adress
     * @param nFloors number of total floors
     * @param nCoffeeOunces amount of coffee in stock
     * @param nSugarPackets amount of sugar in stock
     * @param nCreams amount of cream in stock
     * @param nCups amount of cups in stock
     */
    public Cafe(String name, String address, int nFloors, int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        super(name,address,nFloors);
        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = nCreams;
        this.nCups = nCups;
        System.out.println("You have built a cafe: ☕");
    }
    

    /**
     * overloaded constructor
     * @param name Cafe's name
     * @param address Cafe's adress
     * @param nFloors number of total floors
     */
    public Cafe(String name, String address, int nFloors){
        super(name,address,nFloors);
        this.nCoffeeOunces = 20;
        this.nSugarPackets = 20;
        this.nCreams = 20;
        this.nCups = 20;
        System.out.println("You have built a cafe: ☕");
        
       }
    
    /**
     * overloaded constructor.
     */
    public Cafe(){
        super();
        this.nCoffeeOunces = 20;
        this.nSugarPackets = 20;
        this.nCreams = 20;
        this.nCups = 20;
        System.out.println("You have built a cafe: ☕");
    }
    
    /**
     * reduce the stock amount when coffee is sold
     * @param size amount of coffee sold 
     * @param nSugarPackets amount of sugar sold
     * @param nCreams amount of cream sold 
     */
    public void sellCoffee(int size, int nSugarPackets, int nCreams){
        if (this.nCoffeeOunces<size || this.nSugarPackets<nSugarPackets || this.nCreams<nCreams||this.nCups<1){
            this.restock(20, 20, 20, 20);
        }

        this.nCoffeeOunces = this.nCoffeeOunces - size;
        this.nSugarPackets = this.nSugarPackets - nSugarPackets;
        this.nCreams = this.nCreams -  nCreams;
        this.nCups = this.nCups - 1;
        
    }

    /**
     * restock/increase the stock level
     * @param nCoffeeOunces amount of coffee restock 
     * @param nSugarPackets amount of sugar restock 
     * @param nCreams amount of cream restock 
     * @param nCups amount of cup restock 
     */
    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
        this.nCoffeeOunces = this.nCoffeeOunces + nCoffeeOunces;
        this.nSugarPackets = this.nSugarPackets + nSugarPackets;
        this.nCreams = this.nCreams + nCreams;
        this.nCups = this.nCups + nCups;

    }

    /**
     * showOptions overrides
     */
    public void showOptions() {
        System.out.println("Available options at " + this.name + ":\n + enter() \n + exit() \n + goUp() \n + goDown()\n + sellCofee()\n + restock()");

    }

    /**
     * If the elevator is available, then operate goToFloor(). Else error message is printed. 
     * @param n floors to go to
     */
    public void goToFloor(int n){
        System.out.println("Sorry, the user cannot go to other floors.");
    }


    /**
     * Main, used for testing
     * @param args Convention
     */
    public static void main(String[] args) {
       Cafe cafe = new Cafe("Cafe","14 Elm Street",3,20,20,20,20);
       cafe.showOptions();
       cafe.enter();
       cafe.goToFloor(3);
    }
    
}
