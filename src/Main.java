import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer,Car > hashMap = new HashMap<>();
        hashMap.put(1,new Car(200505,777,new CharacteristicCar("Mercedes cls 63 Amg",2022,"Black ",22000,"$ dollar")));
        System.out.println(hashMap.entrySet());

}
}