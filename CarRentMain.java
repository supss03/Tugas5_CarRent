package carrent;

public class CarRentMain {

    public static void main(String[] args) {
        CarRider ming = new CarRider("Lin MIng", 19, "08000000000");
        CarRider youhan = new CarRider("Bei Youhan", 20, "08111111111");
        CarRider ling = new CarRider("Ling'er", 31, "08222222222");
        CarRider yusuf = new CarRider("Yusuf Alhafiz", 19, "08333333333");
        
        CarData data = new CarData();
        data.addCar("SUV", "N 1111 AB", "Honda");
        data.addCar("SPORT", "N 2222 AB", "SSC Tuatara");
        data.addCar("TRUCK", "N 3333 AB", "Suzuki");
        data.addCar("SEDAN", "N 4444 AB", "Toyota");
        
        data.listOfCar();
        
        RentArchive arsip = new RentArchive();
        arsip.Rent(ming, data.carList.get(1), 9);
        arsip.Rent(youhan, data.carList.get(0), 3);
        arsip.Rent(ming, data.carList.get(1), 1);
        arsip.Rent(yusuf, data.carList.get(3), 5);
        
        System.out.println("");
        arsip.info();
    
    }
}