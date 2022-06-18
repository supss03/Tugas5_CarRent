package carrent;

public class Car {
    private String tipeMobil;
    private String plat;
    private String merk;
    private boolean status = true;
    
    public Car(String tipeMobil, String plat, String merk, boolean status) {
        this.tipeMobil = tipeMobil;
        this.plat = plat;
        this.merk = merk;
    }
    
    public String getTipeMobil() {
        return tipeMobil;
    }
    
    public String getPlat() {
        return plat;
    }
    
    public String getMerk() {
        return merk;
    }
    
    public boolean isStatus() {
        return status;
    }
    
    public void setStatus(boolean status) {
        this.status = status;
    }
}