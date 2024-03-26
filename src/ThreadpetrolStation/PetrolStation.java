package ThreadpetrolStation;

public class PetrolStation {

    Object petrol = new Object();
    Object diesel = new Object();

    public synchronized void petrol(String VehicleNumber, int noOfLitres) {
        for (int i = 0; i < noOfLitres; i++) {
            System.out.println("Vehicle Number :" + VehicleNumber + "   nooflitres: " + i);
        }
    }

    public synchronized void diesel(String VehicleNumber, int noOfLitres) {
        for (int i = 0; i < noOfLitres; i++) {
            System.out.println("Vehicle Number :" + VehicleNumber + "  nooflitres: " + i);

        }

    }

    public void synchronizedblockpetrol(String VehicleNumber, int noOfLitres) {
        System.out.println("From SynchronisedBlockPetrol");
        synchronized (petrol) {

            for (int i = 0; i < noOfLitres; i++) {
                System.out.println("Vehicle Number:" + VehicleNumber + "nooflitres petrol: " +i);
            }
        }
    }

    public void synchronizedBlockdiesel(String VehicleNumber, int noOfLitres) {
        System.out.println("From Synchronised diesel");
        synchronized (diesel) {
            for (int i = 0; i < noOfLitres; i++) {
                System.out.println("Vehicle Number:" + VehicleNumber + "nooflitres diesel:" + i);

            }
        }
    }
}
