public class OtoManager {

    IOto oIOto;

    public OtoManager(IOto ıIOto) {
        this.oIOto = ıIOto;
    }

    public void Olustur() {
        oIOto.setMarka();
        oIOto.setModel();
        oIOto.setVites();
    }

    public Otomobil gOtomobil() {
        return oIOto.getOtomobil();
    }

}
