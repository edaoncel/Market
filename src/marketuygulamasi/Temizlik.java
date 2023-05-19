package marketuygulamasi;



public class Temizlik extends Ürün// ürün classının alt classı olmak için
{
    private boolean organikMi;
     
    public Temizlik(String ürünAdi, double ürünFiyati, int stokMiktari, String sonKullanmaTarihi, boolean organikMi) {
        super(ürünAdi, ürünFiyati, stokMiktari, sonKullanmaTarihi); //Üst sınıfın yapıcı metodunu çağırıyoruz. Ürün classının özelliklerini alıyoruz
        this.organikMi = organikMi;
      
    }
 
}

