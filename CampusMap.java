import java.util.ArrayList;

public class CampusMap {

    ArrayList<Building> buildings;

    /* Default constructor, initializes empty ArrayList */
    public CampusMap() {
        buildings = new ArrayList<Building>();
    }

    /**
     * Adds a Building to the map
     * @param b the Building to add
     */
    public void addBuilding(Building b) {
        System.out.println("Adding building...");
        buildings.add(b);
        System.out.println("-->Successfully added " + b.getName() + " to the map.");
    }

    /**
     * Removes a Building from the map
     * @param b the Building to remove
     * @return the removed Building
     */
    public Building removeBuilding(Building b) {
        System.out.println("Removing building...");
        buildings.remove(b);
        System.out.println("-->Successfully removed " + b.getName() + " to the map.");
        return b;
    }

    /**
     * To string method for object Campus map. Displays all the buildings stored. 
     */
    public String toString() {
        String mapString = "DIRECTORY of BUILDINGS";

        for (int i = 0; i < this.buildings.size(); i ++) {
            mapString += "\n  " + (i+1) + ". "+ this.buildings.get(i).getName() + " (" + this.buildings.get(i).getAddress() + ")";
        }
        return mapString;
    }

    /**
     * selects which building the user want to enter 
     * @param i the index selected
     * @return selected building object
     */
    public Building select (int i){
        Building temp = buildings.get(i+1);
        System.out.println("You selected "+ temp.name);
        return temp;
    }
    
    /**
     * main method 
     * @param args convention
     */
    public static void main(String[] args) {
        CampusMap myMap = new CampusMap();
        myMap.addBuilding(new Building("Ford Hall", "100 Green Street, Northampton, MA 01063", 4));
        myMap.addBuilding(new Building("Bass Hall", "4 Tyler Court, Northampton, MA 01063", 4));
        myMap.addBuilding(new Building("Hatfield Hall","3 Neilson Drive, Northampton, MA 01063",3));
        myMap.addBuilding(new Building("John M. Greene Hall", "60 Elm St, Northampton, MA 01060",2));
        myMap.addBuilding(new Cafe("Campus Center Cafe","100 Elm Street, Northampton, MA 01063",1));
        myMap.addBuilding(new Cafe("The Campass Cafe","7 Neilson Drive, Northampton, MA 01063",1 ));
        myMap.addBuilding(new House("Tyler House","199 Green Street, Northampton, MA 01063",3,true,false));
        myMap.addBuilding(new House("Capen House","26 Prospect Street, Northampton, MA 01063",3,false,false));
        myMap.addBuilding(new House("Talbot House","25 Prospect Street, Northampton, MA 01063",5));
        myMap.addBuilding(new House("Lamont House","17 Prospect Street, Northampton, MA 01063",3,true,true));
        myMap.addBuilding(new House("Ziskind House","1 Henshaw Ave, Northampton, MA 01063",2,true,true));
        myMap.addBuilding(new Library("Nelson Library","7 Neilson Drive, Northampton, MA 01063", 4));

    
        System.out.println(myMap);

        Building currentLocation = myMap.select(4);
        Cafe temp = (Cafe)currentLocation;
        temp.enter();
        temp.sellCoffee(3,4,5);



    }
    
}