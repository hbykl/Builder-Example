public class App {
    public static void main(String[] args) {

        OtoManager otoManager = new OtoManager(new Oto1());
        otoManager.Olustur();
        System.out.println(otoManager.gOtomobil());

        OtoManager otoManager2 = new OtoManager(new Oto2());
        otoManager2.Olustur();
        System.out.println(otoManager2.gOtomobil());
    }
}
