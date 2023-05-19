
import marketuygulamasi.Ürün;
import java.util.ArrayList;
import marketuygulamasi.Ürün;

public class Market { 

    // Değişkenler 

    private String marketAdi; 

    private String marketAdresi; 

    private ArrayList<Ürün> ürünListesi; 

  

    // Yapıcı metot 

    public Market(String marketAdi, String marketAdresi) { 

        this.marketAdi = marketAdi; 

        this.marketAdresi = marketAdresi; 

        this.ürünListesi = new ArrayList<>(); 

    } 

  

    // Ürün ekleme metodu 

    public void ürünEkle(Ürün ürün) { 

        this.ürünListesi.add(ürün); 

    } 

  

    // Ürün silme metodu 

    public void ürünSil(Ürün ürün) { 

        this.ürünListesi.remove(ürün); 

    } 

  

    // Ürün güncelleme metodu 

    public void ürünGüncelle(Ürün eskiÜrün, Ürün yeniÜrün) { 

        int index = this.ürünListesi.indexOf(eskiÜrün); 

        if (index != -1) { 

            this.ürünListesi.set(index, yeniÜrün); 

        } 

    } 

  

    // Ürün listesi getirme metodu 

    public ArrayList<Ürün> getÜrünListesi() { 

        return this.ürünListesi; 

    } 

} 