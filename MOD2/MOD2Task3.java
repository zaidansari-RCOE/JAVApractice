public class MOD2Task3 {
    public static void main(String[] args) {
        System.out.println("\t\tCreating Appliances");
        washingMachine myWasher = new washingMachine("Samsung", 2000, 8);
        System.out.println("Washing Machine Actions");
        myWasher.turnOn();
        myWasher.displayInfo();

        Fridge myFridge = new Fridge("LG", 150, 400);
        System.out.println("\nRefrigerator Actions");
        myFridge.turnOn();
        myFridge.displayInfo();
    
    }
}

class Appliance{
    protected String brand;
    protected int powerWatts;

    public Appliance(String brand,int powerWatts){
        this.brand=brand;
        this.powerWatts=powerWatts;
    }

    public void turnOn(){
        System.out.println("Appliance is turning on...\n");
    }
    
    public void displayInfo(){
        System.out.println("Appliance brand: "+brand+"\nAppliance power consumption: "+powerWatts+ "WATTS\n");
    }
}


class washingMachine extends Appliance{
    private int capacity;

    public washingMachine(String brand,int powerWatts,int capacity) {
        super(brand, powerWatts);
        this.capacity=capacity;
    }

    @Override
    public void turnOn(){
        System.out.println("Appliance is turning on with capacity "+capacity+ " KGs");
    }

    @Override
    public void displayInfo(){
         System.out.println("Appliance brand: "+brand+"\nAppliance power consumption: "+powerWatts+ "WATTS\nCapacity: "+capacity+" kgs");
    }
}

class Fridge extends Appliance{
    private int capacity;

    public Fridge(String brand,int powerWatts,int capacity) {
        super(brand, powerWatts);
        this.capacity=capacity;
    }
    @Override
    public void turnOn(){
        System.out.println("Appliance is turning on with capacity "+capacity+"litres");
    }

    @Override
    public void displayInfo(){
         System.out.println("Appliance brand: "+brand+"\nAppliance power consumption: "+powerWatts+ "WATTS\nCapacity: "+capacity+ " litres");
    }
}
