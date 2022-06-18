package carrent;

public class CarRider {
    private String nama;
    private int umur;
    private String nomor;
    
    public CarRider(String nama, int umur, String nomor) {
        this.nama = nama;
        this.umur = umur;
        this.nomor = nomor;
    }
    
    public String getName() {
        return nama;
    }
    
    public int getAge() {
        return umur;
    }
    
    public String getPhone() {
        return nomor;
    }
}