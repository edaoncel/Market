package marketuygulamasi;

public class alışverişTamamla {
    
    private String müşteriAdi;
    private String müşteriSoyadi;
    private String telefonNumarasi;
    private String adresiniz;
    private String kartNumarası;
    private String kartÜzerindekiİsim;
    private String sonTarih;
    private String güvenlikKodu;
    
     // Yapıcı metot
    public alışverişTamamla(String müşteriAdi, String müşteriSoyadi, String telefonNumarasi, String adresiniz, String kartNumarası, String kartÜzerindekiİsim, String sonTarih, String güvenlikKodu) {
        this.müşteriAdi = müşteriAdi;
        this.müşteriSoyadi = müşteriSoyadi;
        this.telefonNumarasi = telefonNumarasi;
        this.adresiniz = adresiniz;
        this.kartNumarası = kartNumarası;
        this.kartÜzerindekiİsim = kartÜzerindekiİsim;
        this.sonTarih = sonTarih;
        this.güvenlikKodu = güvenlikKodu;
    }
}