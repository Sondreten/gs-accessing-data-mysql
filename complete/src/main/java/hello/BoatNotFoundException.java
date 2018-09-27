package hello;

class BoatNotFoundException extends RuntimeException {


    BoatNotFoundException(int boatImo) {
        super("Could not find the boat " + boatImo);
    }
}


