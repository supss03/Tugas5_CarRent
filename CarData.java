package carrent;

import java.util.ArrayList;

public class CarData {
    ArrayList<Car> carList = new ArrayList<Car>();
    
    public void addCar(String tipeMobil, String plat, String merk) {
        carList.add(new Car(tipeMobil, plat, merk));
    }
    
    public void listOfCar() {
        System.out.println("-----------------------------");
        System.out.println("DAFTAR MOBIL");
        System.out.println("-----------------------------");
        for (Car input : carList) {
            System.out.println("TIPE MOBIL : " + input.getTipeMobil());
            System.out.println("NO. POLISI : " + input.getPlat());
            System.out.println("MERK MOBIL : " + input.getMerk());
            System.out.println("-----------------------------");
        }
    }

}