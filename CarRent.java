package carrent;

public class CarRent {
    private Car car;
    private CarRider rider;
    private int lamaRental;
    
    public CarRent(CarRider rider, Car car, int lamaRental) {
        this.rider = rider;
        this.car = car;
        this.lamaRental = lamaRental;
    }
    
    public CarRider getRider() {
        return rider;
    }
    
    public Car getCar() {
        return car;
    }
    
    public int getLamaRental() {
        return lamaRental;
    }
}