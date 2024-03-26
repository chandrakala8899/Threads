package ThreadpetrolStation;

public class Vehicle extends Thread {
    int litres;
    String type;
    String status;
    PetrolStation petrolStation;

    public Vehicle(int litres, String type, String status, PetrolStation petrolStation) {
        this.litres = litres;
        this.type = type;
        this.status = status;
        this.petrolStation = petrolStation;
    }
    public void run() {
      if(type.equals("petrol")){
          System.out.println(Thread.currentThread().getName());
          petrolStation.synchronizedblockpetrol(Thread.currentThread().getName(),this.litres);
      }else {
          System.out.println(Thread.currentThread().getName());
          petrolStation.synchronizedBlockdiesel(Thread.currentThread().getName(),this.litres);
      }

    }
}
