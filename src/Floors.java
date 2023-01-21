public class Floors extends Home{
    private int amountFloors;

    public Floors(int houseNumber, ColorEnum color, Roof door, int amountApartments, int amountFloors) {
        super(houseNumber, color, door, amountApartments);
        this.amountFloors = amountFloors;
    }

    public int getAmountFloors() {
        return amountFloors;
    }

    public void intercomCode(){
        System.out.println("No intercom!");
    }
    public final void intercomCode(int code){
        if (code == 123){
            System.out.println("Open!");
        }else {
            System.out.println("Wrong code entered!");
        }
    }
    @Override
    public String getInfo() {
        return super.getInfo() + "\nNumber of floors: " + amountFloors;
    }
}