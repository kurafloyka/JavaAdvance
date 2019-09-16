
public class Test {
    public static void main(String[] args) {

        //Interface
        IKisiBilgileri ogretimGorevlisi = new OgretimGorevlisi();
        ogretimGorevlisi.getAdSoyad();

        ICalisanBilgileri ogretimGorevlisi2 = new OgretimGorevlisi();
        ogretimGorevlisi2.getDepartman();

        //GenericsPerso
        Generics<String, Integer> obj =
                new Generics<String, Integer>("GfG", 15);

        obj.print();

        //enums

        Level myVar = Level.MEDIUM;
        System.out.println(myVar);
    }


}
