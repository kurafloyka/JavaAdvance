public class Ogrenci implements IKisiBilgileri {

    private String adSoyad;
    private String ePosta;
    private String telefon;

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getEPosta() {
        return ePosta;
    }

    public void setEPosta(String ePosta) {
        this.ePosta = ePosta;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
}
