package TrafficSignal;

public class SignalTest {
    public static void main(String[] args) throws InterruptedException {

        Trafficsignals signal = new Trafficsignals();
        for (int i =0;i<5;i++){
            VehicleSignal northSouth = new VehicleSignal("North-South",signal);
            VehicleSignal  eastWest = new VehicleSignal("East-West",signal);
            northSouth.start();
            eastWest.start();
            try {
                Thread.sleep(20000);
            }catch (InterruptedException e){

            }
            signal.changeSignals();
            try {
                Thread.sleep(20000);
            }catch (InterruptedException e){

            }
            signal.changeSignals();
        }

    }
}

