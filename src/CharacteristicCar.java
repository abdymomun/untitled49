public class CharacteristicCar {
    private String Model;
    private int year;
    private String color;
    private int price;
private String dollar;
    public CharacteristicCar(String model, int year, String color, int price,String dollar) {
        Model = model;
        this.year = year;
        this.color = color;
        this.price = price;
this.dollar = dollar;
    }

    @Override
    public String toString() {
        return "CharacteristicCar " +
                "Model " + Model +
                "\nyear " + year +
                "\ncolor " + color +
                "price " + price +
                " "+ dollar;
    }
}
