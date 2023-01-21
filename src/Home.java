public class Home {

    private  int houseNumber;
    private  ColorEnum color;
    private Roof door;
    private int amountApartaments;


    public  Home(int houseNumber, ColorEnum color, Roof door, int amountApartaments){
        this.houseNumber = houseNumber;
        this.color = color;
        this.door = door;
        this.amountApartaments = amountApartaments;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public ColorEnum getColor() {
        return color;
    }

    public Roof getDoor() {
        return door;
    }

    public int getAmountApartaments() {
        return amountApartaments;
    }

    public String getInfo(){
        return  "House number: " + houseNumber + "/nHouse color:" + color + "/nRoof door: " + (door.isDoor() ? "Door is open!" : "Door is closed!") + "/nNumber of apartaments: " + amountApartaments;
    }
}
