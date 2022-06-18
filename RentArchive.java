package carrent;

import java.util.ArrayList;

public class RentArchive {
    ArrayList<CarRent> rentData = new ArrayList<CarRent>();
    
    public void Rent(CarRider rider, Car car, int lamaRental) {
        if (car.isStatus() == true) {
            System.out.println("MOBIL BERHASIL DISEWA");
            car.setStatus(false);
            rentData.add(new CarRent(rider, car, lamaRental));
        }
        else {
            System.out.println("MAAF, MOBIL SUDAH DISEWA");
        }
    }
    
    public void info() {
        System.out.println("-----------------------------");
        System.out.printf("INFORMASI\tPELANGGAN");
        System.out.println("-----------------------------");
        for (CarRent input : rentData) {
            System.out.println("NAMA PEMINJAM : " + input.getRider().getName());
            System.out.println("TIPE MOBIL : " + input.getCar().getTipeMobil());
            System.out.println("NO. POLISI : " + input.getCar().getPlat());
            System.out.println("LAMA RENTAL : " + input.getLamaRental());
        }
    }
}