package ThreadpetrolStation;

public class StationTest {
    public static void main(String[] args) {

        PetrolStation petrolStation = new PetrolStation();
        Thread pulsar = new Vehicle(2, "petrol", "empty", petrolStation);
        pulsar.setName("Pulsar");
        Thread bike = new Vehicle(2, "petrol", "empty", petrolStation);
        bike.setName("Bike");


        Thread car = new Vehicle(2,"diesel","empty",petrolStation);
        car.setName("Car");
        Thread duke = new Vehicle(2,"diesel","empty",petrolStation);
        duke.setName("Duke");

        pulsar.start();
        bike.start();
        car.start();
        duke.start();
    }
}
