/* This is a stub for the Library class */
import java.util.Enumeration;
import java.util.Hashtable;

public class Library extends Building{
  
    private Hashtable <String,Boolean> collection;

    /**
     * Constructor 
     * @param name Library's name
     * @param address Library's adress
     * @param nFloors number of total floors
     * @param elevator true if elevator is available.
     */
    public Library(String name, String address, int nFloors) {
      super (name,address,nFloors);
      this.collection = new Hashtable<String,Boolean>();
      System.out.println("You have built a library: 📖");
    }

    /**
     * overloaded constructor
     * @param name Library's name
     * @param address Library's adress
     * @param nFloors number of total floors
     */
    public Library(String name, String address){
      super(name,address,4);
      this. collection = new Hashtable<String,Boolean>();
      System.out.println("You have built a library: 📖");
    }

    /**
     * overloaded constructor
     */
    public Library(){
      super();
      this.collection = new Hashtable<String,Boolean>();
      System.out.println("You have built a library: 📖");
    }

    /**
     * add the book from the collection 
     * @param title book title 
     */
    public void addTitle(String title){
      this.collection.put(title,true);

    }
    
    /**
     * remove the book from the collection 
     * @param title book title 
     * @return confirmation message
     */
    public String removeTitle(String title){
      this.collection.remove(title);
      return title + " has removed";
    }

    /**
     * update the collection when the book is checked out. 
     * @param title book title 
     */
    public void checkOut(String title){
      this.collection.replace(title, false);
    }
    
    /**
     * update the collection when the book is returned. 
     * @param title book title 
     */
    public void returnBooks (String title){
      this.collection.replace(title, true);
    }

    /**
     * returns true if the title appears as a key in the Libary's collection, false otherwise
     * @param title book title
     * @return is the book inside the collection or not
     */
    public boolean containsTitle(String title){
      return this.collection.contains(title);
    } 

    /**
     * returns true if the title is currently available, false otherwise
     * @param title book title
     * @return availability of books
     */
    public boolean isAvailable(String title){
      return this.collection.get(title);

    } 
    
    /**
     * Enumerate the hashmap and prints out the entire collection in an easy-to-read way
     */
    public void printCollection(){
      Enumeration titles;
      String temp;
      titles = collection.keys();
      while(titles.hasMoreElements()) {
         temp = (String) titles.nextElement();
         System.out.println(temp + ": " +
         collection.get(temp));
      }

    } 

    /**
     * showOptions overrides
     */
    public void showOptions() {
      System.out.println("Available options at " + this.name + ":\n + enter() \n + exit() \n + goUp() \n + goDown()\n + goToFloor(n)\n + addTitle()\n + removeTitle()\n + checkOut()\n + returnBooks()\n + containsTitle()\n + isAvailable()\n + printCollection()");
  
    }

  /**
   * If the elevator is available, then operate goToFloor(). Else error message is printed. 
   * @param n floors to go to
   */
    public void goToFloor(int n){
        super.goToFloor(n);
    }

    /**
     * Main, used for testing
     * @param args Convention
     */
    public static void main(String[] args) {
      Library library = new Library("Nelson","something",5);
      library.showOptions();
      library.enter();
      library.goToFloor(3);

    }
  
  }