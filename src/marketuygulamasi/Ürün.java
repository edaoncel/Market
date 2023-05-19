package marketuygulamasi;
import java.util.Date;
// ürün classının içinde gıda ve temizlik var. miras alan classlar. Ürün classı miras almayan class.
public class Ürün {
   
    String ürünAdi;
    double ürünFiyatı;
    int stokMiktarı;
    String sonKullanmaTarihi;
  
    public Ürün(String ürünAdi, double ürünFiyati, int stokMiktari, String sonKullanmaTarihi) {
        this.ürünAdi = ürünAdi;
        this.ürünFiyatı = ürünFiyati;
        this.stokMiktarı = stokMiktari;
        this.sonKullanmaTarihi = sonKullanmaTarihi;
    } 
    public Ürün(String ürünAdi, double ürünFiyati) {
        this(ürünAdi, ürünFiyati, 0, "Belirsiz");
    }

    Ürün(String ürünAdi, double ürünFiyati, int stokMiktari, Date sonKullanmaTarihi) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    Object getÜrünAdi() {
    return ürünAdi;    
    }
}

 