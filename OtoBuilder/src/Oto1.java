public class Oto1 implements IOto {
    Otomobil oto;

    public Oto1() {
        oto = new Otomobil();
    }

    @Override
    public void setMarka() {
        oto.setMarka("citröen");
    }

    @Override
    public void setModel() {
        oto.setModel("berlingo");
    }

    @Override
    public void setVites() {
        oto.setVites("düz");
    }

    @Override
    public Otomobil getOtomobil() {
        return oto;
    }

}