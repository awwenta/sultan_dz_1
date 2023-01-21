public final class Apartments extends Floors {
    private int numberApartments;

    public Apartments(int houseNumber, ColorEnum color, Roof door,
                      int amountApartments, int amountFloors, int numberApartments) {
        super(houseNumber, color, door, amountApartments, amountFloors);
        this.numberApartments = numberApartments;
    }

    public int getNumberApartments() {
        return numberApartments;
    }

    public void bell(){
        System.out.println("No bell!");
    }
    public void bell(String bell){
        System.out.println(bell);
    }
    @Override
    public String getInfo() {
        return super.getInfo() + "\nApartment number: " + numberApartments;
    }
}