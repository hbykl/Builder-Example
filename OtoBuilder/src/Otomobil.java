public class Otomobil {
    private String marka;
    private String model;
    private String vites;

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVites() {
        return vites;
    }

    public void setVites(String vites) {
        this.vites = vites;
    }

    @Override
    public String toString() {
        return "marka " + this.marka + " model " + this.model + " vites " + this.vites;
    }

}
