public class Oto2 implements IOto {
    Otomobil oto;

    public Oto2() {
        oto = new Otomobil();
    }

    @Override
    public void setMarka() {
        oto.setMarka("renault");
    }

    @Override
    public void setModel() {
        oto.setModel("clio");
    }

    @Override
    public void setVites() {
        oto.setVites("otomatik");
    }

    @Override
    public Otomobil getOtomobil() {
        return oto;
    }

}