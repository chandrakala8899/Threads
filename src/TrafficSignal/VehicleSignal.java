package TrafficSignal;

public class VehicleSignal extends  Thread {
        public String direction;
        public Trafficsignals signal;

        public VehicleSignal(String direction, Trafficsignals signal) {
            this.direction = direction;
            this.signal = signal;
        }

        public void run() {
            if (direction.equals("North-South")) {
              signal.allowNorthSouth();
            } else {
              signal.allowEastWest();
            }
        }
    }



