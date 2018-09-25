package hello;

class BoatNotFoundException extends RuntimeException {


    BoatNotFoundException(int id) {
        super("Could not find the boat " + id);
    }
}


