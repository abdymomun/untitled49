public class Car {
    private int id;
    private int number;
    private CharacteristicCar auto;

    public Car(int id, int number, CharacteristicCar auto) {
        this.id = id;
        this.number = number;
        this.auto = auto;
    }

    @Override
    public String toString() {
        return "Car " +
                "\nid " + id +
                "\nnumber " + number +
                "\nauto " + auto +
                "";
    }
}
