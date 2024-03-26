package TrafficSignal;

public class Trafficsignals {
     boolean greenLight;

    public Trafficsignals() {

        greenLight = true;
    }

    synchronized void allowNorthSouth() {
        while (!greenLight) {
            try {
                wait();

            } catch (InterruptedException e) {
            }
        }
        System.out.println("Vehicle moving North-South");
        System.out.println("Vehicle Stopped East-West waiting for greenlight");
    }
            public synchronized void allowEastWest(){
                while (greenLight) {
                    try {
                        wait();
                    } catch (InterruptedException e) {

                    }
                }
                System.out.println("Vehicle moving East-West");
                System.out.println("Vehicle Stopped North-South waiting for greenlight");
            }

            synchronized void changeSignals() {
                greenLight = !greenLight;
                notifyAll();

            }
        }
















