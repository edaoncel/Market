package marketuygulamasi;
import javax.swing.JOptionPane;


public class Formmarket extends javax.swing.JFrame {
    
// Formun yapıcı metod
    public Formmarket() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Müşteri = new javax.swing.JPanel();
        ürünAdı = new javax.swing.JTextField();
        ürünAdı2 = new javax.swing.JLabel();
        adetMiktari = new javax.swing.JLabel();
        adetMiktariTextField = new javax.swing.JTextField();
        sepetTutarı = new javax.swing.JLabel();
        sepetTutarıTextField = new javax.swing.JTextField();
        kullanıcıAdı = new javax.swing.JLabel();
        kullanıcıAdıTextField = new javax.swing.JTextField();
        sifreTextField = new javax.swing.JTextField();
        girisButton = new javax.swing.JButton();
        sifre = new javax.swing.JLabel();
        sepetTutarınıHesaplaButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        alisverisTamamla = new javax.swing.JPanel();
        müşteriAdi = new javax.swing.JLabel();
        müşteriAdiTextField = new javax.swing.JTextField();
        müşteriSoyadi = new javax.swing.JLabel();
        müşteriSoyadiTextField = new javax.swing.JTextField();
        telefonNumarasi = new javax.swing.JLabel();
        telefonNumarasiTextField = new javax.swing.JTextField();
        musteriAdresiTextField = new javax.swing.JTextField();
        kartBilgileriLabel = new javax.swing.JLabel();
        kartNumarası = new javax.swing.JLabel();
        kartNumarasiTextField = new javax.swing.JTextField();
        kartÜzerindekiİsim = new javax.swing.JLabel();
        kartÜzerindekiİsimTextField = new javax.swing.JTextField();
        sonTarih = new javax.swing.JLabel();
        sonTarihTextField = new javax.swing.JTextField();
        güvenlikKodu = new javax.swing.JLabel();
        güvenlikKoduTextField = new javax.swing.JTextField();
        ödeButton = new javax.swing.JButton();
        adresiniz = new javax.swing.JLabel();
        tutarÖdeTextField = new javax.swing.JTextField();
        tutarÖde = new javax.swing.JLabel();
        marketOlustur = new javax.swing.JPanel();
        marketOluşturButton = new javax.swing.JButton();
        marketAdresiTextField = new javax.swing.JTextField();
        marketAdresi = new javax.swing.JLabel();
        marketAdiTextField = new javax.swing.JTextField();
        marketAdı = new javax.swing.JLabel();
        ürün = new javax.swing.JPanel();
        ürünAdi = new javax.swing.JLabel();
        ürünAdiTextField = new javax.swing.JTextField();
        ürünFiyatı = new javax.swing.JLabel();
        ürünFiyatiTextField = new javax.swing.JTextField();
        stokMiktarı = new javax.swing.JLabel();
        stokMiktarıTextField = new javax.swing.JTextField();
        sonKullanmaTarihi = new javax.swing.JLabel();
        sonKullanmaTarihiTextField = new javax.swing.JTextField();
        organikMiComboBox = new javax.swing.JComboBox<>();
        organikMi = new javax.swing.JLabel();
        kullanımYeri = new javax.swing.JLabel();
        kullanımAlanıComboBox = new javax.swing.JComboBox<>();
        sepeteEkleButton = new javax.swing.JButton();
        sepettenCikarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(252, 233, 212));

        Müşteri.setBackground(new java.awt.Color(235, 243, 252));

        ürünAdı.setBackground(new java.awt.Color(205, 231, 253));
        ürünAdı.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ürünAdıActionPerformed(evt);
            }
        });

        ürünAdı2.setText("ÜRÜN ADI:");

        adetMiktari.setText("ADET MİKTARI:");

        adetMiktariTextField.setBackground(new java.awt.Color(205, 231, 253));

        sepetTutarı.setText("SEPET TUTARINIZ:");

        sepetTutarıTextField.setBackground(new java.awt.Color(233, 242, 254));
        sepetTutarıTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sepetTutarıTextFieldActionPerformed(evt);
            }
        });

        kullanıcıAdı.setText("KULLANICI ADI:");

        kullanıcıAdıTextField.setBackground(new java.awt.Color(205, 231, 253));
        kullanıcıAdıTextField.setText("orn@gmail.com");

        sifreTextField.setBackground(new java.awt.Color(205, 231, 253));

        girisButton.setBackground(new java.awt.Color(153, 204, 255));
        girisButton.setText("GİRİŞ");
        girisButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                girisButtonActionPerformed(evt);
            }
        });

        sifre.setText("ŞİFRE:");

        sepetTutarınıHesaplaButton.setBackground(new java.awt.Color(153, 204, 255));
        sepetTutarınıHesaplaButton.setText("SEPET TUTARINI HESAPLA:");
        sepetTutarınıHesaplaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sepetTutarınıHesaplaButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("KULLANICI BİLGİLERİ:");

        javax.swing.GroupLayout MüşteriLayout = new javax.swing.GroupLayout(Müşteri);
        Müşteri.setLayout(MüşteriLayout);
        MüşteriLayout.setHorizontalGroup(
            MüşteriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MüşteriLayout.createSequentialGroup()
                .addGroup(MüşteriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MüşteriLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ürünAdı2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MüşteriLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(sepetTutarınıHesaplaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MüşteriLayout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(girisButton, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MüşteriLayout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(MüşteriLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MüşteriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ürünAdı)
                    .addGroup(MüşteriLayout.createSequentialGroup()
                        .addGroup(MüşteriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(adetMiktariTextField)
                            .addGroup(MüşteriLayout.createSequentialGroup()
                                .addComponent(adetMiktari, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MüşteriLayout.createSequentialGroup()
                        .addGroup(MüşteriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(MüşteriLayout.createSequentialGroup()
                                .addComponent(sifre, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sifreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(MüşteriLayout.createSequentialGroup()
                                .addComponent(kullanıcıAdı, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(kullanıcıAdıTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(MüşteriLayout.createSequentialGroup()
                                .addComponent(sepetTutarı, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                                .addComponent(sepetTutarıTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(23, 23, 23))))
        );
        MüşteriLayout.setVerticalGroup(
            MüşteriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MüşteriLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(ürünAdı2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ürünAdı, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(adetMiktari, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(adetMiktariTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(sepetTutarınıHesaplaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(MüşteriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sepetTutarıTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sepetTutarı, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(MüşteriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kullanıcıAdıTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kullanıcıAdı))
                .addGap(24, 24, 24)
                .addGroup(MüşteriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sifre, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sifreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(girisButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(441, 441, 441))
        );

        alisverisTamamla.setBackground(new java.awt.Color(235, 243, 252));

        müşteriAdi.setText("MÜŞTERİ ADI:");

        müşteriSoyadi.setText("MÜŞTERİ SOYADI:");

        telefonNumarasi.setText("TELEFON NUMARASI:");

        kartBilgileriLabel.setText("KART BİLGİLERİ:");

        kartNumarası.setText("KART NUMARASI:");

        kartÜzerindekiİsim.setText("KART ÜZERİNDEKİ İSİM:");

        sonTarih.setText("SON KULLANMA TARİHİ (ay / yıl) :");

        güvenlikKodu.setText("GÜVENLİK KODU:");

        ödeButton.setBackground(new java.awt.Color(153, 204, 255));
        ödeButton.setText("ÖDE");
        ödeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ödeButtonActionPerformed(evt);
            }
        });

        adresiniz.setText("ADRESİNİZ:");

        tutarÖde.setText("TUTAR:");

        javax.swing.GroupLayout alisverisTamamlaLayout = new javax.swing.GroupLayout(alisverisTamamla);
        alisverisTamamla.setLayout(alisverisTamamlaLayout);
        alisverisTamamlaLayout.setHorizontalGroup(
            alisverisTamamlaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(alisverisTamamlaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(alisverisTamamlaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(kartÜzerindekiİsim, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kartNumarasiTextField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, alisverisTamamlaLayout.createSequentialGroup()
                        .addGroup(alisverisTamamlaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tutarÖdeTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                            .addComponent(güvenlikKoduTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sonTarihTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kartÜzerindekiİsimTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sonTarih, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(güvenlikKodu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(alisverisTamamlaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(müşteriAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(kartNumarası, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(alisverisTamamlaLayout.createSequentialGroup()
                            .addGroup(alisverisTamamlaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(müşteriSoyadi, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(telefonNumarasi, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(adresiniz, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(13, 13, 13)
                            .addGroup(alisverisTamamlaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(telefonNumarasiTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                                .addComponent(müşteriAdiTextField)
                                .addComponent(müşteriSoyadiTextField)
                                .addComponent(musteriAdresiTextField)))))
                .addGap(37, 37, 37))
            .addGroup(alisverisTamamlaLayout.createSequentialGroup()
                .addGroup(alisverisTamamlaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(alisverisTamamlaLayout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(kartBilgileriLabel))
                    .addGroup(alisverisTamamlaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tutarÖde, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(alisverisTamamlaLayout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(ödeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        alisverisTamamlaLayout.setVerticalGroup(
            alisverisTamamlaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(alisverisTamamlaLayout.createSequentialGroup()
                .addGroup(alisverisTamamlaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(alisverisTamamlaLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(müşteriAdi))
                    .addGroup(alisverisTamamlaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(müşteriAdiTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(alisverisTamamlaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(alisverisTamamlaLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(müşteriSoyadi))
                    .addGroup(alisverisTamamlaLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(müşteriSoyadiTextField)))
                .addGap(30, 30, 30)
                .addGroup(alisverisTamamlaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefonNumarasi)
                    .addComponent(telefonNumarasiTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(alisverisTamamlaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adresiniz, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(musteriAdresiTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(kartBilgileriLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kartNumarası)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kartNumarasiTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kartÜzerindekiİsim)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kartÜzerindekiİsimTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sonTarih, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sonTarihTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(güvenlikKodu, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(güvenlikKoduTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tutarÖde, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tutarÖdeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(ödeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(441, 441, 441))
        );

        marketOlustur.setBackground(new java.awt.Color(235, 243, 252));

        marketOluşturButton.setBackground(new java.awt.Color(153, 204, 255));
        marketOluşturButton.setText("MARKET OLUŞTUR");
        marketOluşturButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marketOluşturButtonActionPerformed(evt);
            }
        });

        marketAdresi.setText("MARKET ADRESİ:");

        marketAdı.setText("MARKET ADI:");

        javax.swing.GroupLayout marketOlusturLayout = new javax.swing.GroupLayout(marketOlustur);
        marketOlustur.setLayout(marketOlusturLayout);
        marketOlusturLayout.setHorizontalGroup(
            marketOlusturLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(marketOlusturLayout.createSequentialGroup()
                .addGroup(marketOlusturLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(marketAdiTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(marketAdresiTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(marketOlusturLayout.createSequentialGroup()
                        .addGroup(marketOlusturLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(marketOlusturLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(marketAdı))
                            .addComponent(marketAdresi, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(marketOlusturLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(marketOluşturButton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        marketOlusturLayout.setVerticalGroup(
            marketOlusturLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, marketOlusturLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(marketAdı, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(marketAdiTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(marketAdresi, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(marketAdresiTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(marketOluşturButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ürün.setBackground(new java.awt.Color(235, 243, 252));

        ürünAdi.setText("ÜRÜN ADI:");

        ürünAdiTextField.setBackground(new java.awt.Color(233, 242, 254));

        ürünFiyatı.setText("ÜRÜN FİYATI:");

        ürünFiyatiTextField.setBackground(new java.awt.Color(233, 242, 254));

        stokMiktarı.setText("STOK MİKTARI:");

        stokMiktarıTextField.setBackground(new java.awt.Color(233, 242, 254));
        stokMiktarıTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stokMiktarıTextFieldActionPerformed(evt);
            }
        });

        sonKullanmaTarihi.setText("SON KULLANMA TARİHİ;");

        sonKullanmaTarihiTextField.setBackground(new java.awt.Color(233, 242, 254));

        organikMiComboBox.setBackground(new java.awt.Color(233, 242, 254));
        organikMiComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Evet", "Hayır" }));

        organikMi.setText("ORGANİK Mİ:");

        kullanımYeri.setText("KULLANIM ALANI:");

        kullanımAlanıComboBox.setBackground(new java.awt.Color(233, 242, 254));
        kullanımAlanıComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gıda", "Temizlik" }));
        kullanımAlanıComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kullanımAlanıComboBoxActionPerformed(evt);
            }
        });

        sepeteEkleButton.setBackground(new java.awt.Color(153, 204, 255));
        sepeteEkleButton.setText("SEPETE EKLE");
        sepeteEkleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sepeteEkleButtonActionPerformed(evt);
            }
        });

        sepettenCikarButton.setBackground(new java.awt.Color(153, 204, 255));
        sepettenCikarButton.setText("SEPETTEN ÇIKAR");
        sepettenCikarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sepettenCikarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ürünLayout = new javax.swing.GroupLayout(ürün);
        ürün.setLayout(ürünLayout);
        ürünLayout.setHorizontalGroup(
            ürünLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ürünLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kullanımAlanıComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ürünLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ürünLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(organikMiComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ürünAdiTextField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ürünFiyatiTextField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ürünLayout.createSequentialGroup()
                        .addGroup(ürünLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(stokMiktarı, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ürünAdi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ürünFiyatı, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kullanımYeri, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ürünLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(sepeteEkleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(sepettenCikarButton)
                .addGap(61, 61, 61))
            .addGroup(ürünLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sonKullanmaTarihi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(ürünLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sonKullanmaTarihiTextField)
                .addContainerGap())
            .addGroup(ürünLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(organikMi, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(ürünLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(stokMiktarıTextField)
                .addContainerGap())
        );
        ürünLayout.setVerticalGroup(
            ürünLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ürünLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(ürünAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ürünAdiTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ürünFiyatı, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ürünFiyatiTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(stokMiktarı, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(stokMiktarıTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sonKullanmaTarihi, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(sonKullanmaTarihiTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(organikMi, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(organikMiComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(kullanımYeri, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(kullanımAlanıComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addGroup(ürünLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sepettenCikarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sepeteEkleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(marketOlustur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ürün, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Müşteri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(alisverisTamamla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(marketOlustur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ürün, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addComponent(Müşteri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(alisverisTamamla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sepeteEkleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sepeteEkleButtonActionPerformed
   ürünAdiTextField.getText();
        ürünAdı.setText(null);
        ürünAdı.setText(ürünAdiTextField.getText());
        
        // Textfieldden ürün adını al
        String ürünAdi = ürünAdiTextField.getText();
        String ürünFiyatı = ürünFiyatiTextField.getText();
        String stokMiktarı = stokMiktarıTextField.getText();
        String sonKullanmaTarihi = sonKullanmaTarihiTextField.getText();

        // Boş değer girilmişse uyar
        if (ürünAdi.isEmpty() ||  ürünFiyatı.isEmpty() || stokMiktarı.isEmpty() ||  sonKullanmaTarihi.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Lütfen sepete eklemek istediğiniz ürün adını girin.");
            return;
        }
        

        // Başarılı mesajı göster
        JOptionPane.showMessageDialog(this, "Ürün başarıyla sepete eklendi.");     
    
    }//GEN-LAST:event_sepeteEkleButtonActionPerformed

    private void sepettenCikarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sepettenCikarButtonActionPerformed
        // ürün adını alıyoruz
        String ürünAdi = ürünAdiTextField.getText();
        String ürünFiyatı = ürünFiyatiTextField.getText();
        String stokMiktarı = stokMiktarıTextField.getText();
        String sonKullanmaTarihi = sonKullanmaTarihiTextField.getText();
        // ürün boş mu kontrol ediyor
        if (ürünAdi.isEmpty() ||  ürünFiyatı.isEmpty() || stokMiktarı.isEmpty() ||  sonKullanmaTarihi.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Lütfen sepetten çıkarmak istediğiniz ürün adını girin.");
            return;
        }
        

        JOptionPane.showMessageDialog(this, "Ürün başarıyla sepetten çıkarıldı.");
        ürünAdı.setText(null); // ürünadı seçeneğine kullanıcı bir şey giremiyor
        sepetTutarıTextField.setText(null); // sepettutarı kısmına kullanıcı bir şey giremiyor
    }//GEN-LAST:event_sepettenCikarButtonActionPerformed

    private void ürünAdıActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ürünAdıActionPerformed
        //yanlışlıkla açtım
    }//GEN-LAST:event_ürünAdıActionPerformed

    private void sepetTutarıTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sepetTutarıTextFieldActionPerformed
      // yanlışlıkla açtım
    }//GEN-LAST:event_sepetTutarıTextFieldActionPerformed

    private void girisButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_girisButtonActionPerformed
        //kullanıcı adı ve şifreyi kullanıcıdan alıyoruz
        String kullanıcıAdı = kullanıcıAdıTextField.getText();
        String sifre = sifreTextField.getText();
        if ("edaoncel@gmail.com".equals(kullanıcıAdı) && "12345".equals(sifre)) 
            {
            JOptionPane.showMessageDialog(this, "Kullanıcı adınız ve şifreniz doğru.");
           

}
        else
            {
        JOptionPane.showMessageDialog(this, "Kullanıcı adınız ve şifreniz yanlış.");
            }
        
        
      // Boş değer girilmişse veya yanlış girilmişse uyar
if ((kullanıcıAdı.isEmpty() || sifre.isEmpty()) || !("edaoncel@gmail.com".equals(kullanıcıAdı) && "12345".equals(sifre))) {
   
    JOptionPane.showMessageDialog(this, "Lütfen girişinizi tamamlayınız.");
    }
        
        
    }//GEN-LAST:event_girisButtonActionPerformed

    private void ödeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ödeButtonActionPerformed
        //müşteri bilgilerini al
        String müşteriAdi = müşteriAdiTextField.getText();
        String müşteriSoyadi = müşteriSoyadiTextField.getText();
        String telefonNumarasi = telefonNumarasiTextField.getText();
        String adresiniz = musteriAdresiTextField.getText();
        String kartNumarası = kartNumarasiTextField.getText();
        String kartÜzerindekiİsim = kartÜzerindekiİsimTextField.getText();
        String sonTarih = sonTarihTextField.getText();
        String güvenlikKodu = güvenlikKoduTextField.getText();
        
        
          
        if (müşteriAdi.isEmpty() || müşteriSoyadi.isEmpty() || telefonNumarasi.isEmpty() || adresiniz.isEmpty()|| 
            kartNumarası.isEmpty() || kartÜzerindekiİsim.isEmpty() || sonTarih.isEmpty() || güvenlikKodu.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Lütfen müşteri ve kart bilgilerini girin.");
            return;
        }

        double sepetTutari = Double.parseDouble(sepetTutarıTextField.getText());
         
       
  if (sepetTutari >= 200) {
  
    JOptionPane.showMessageDialog(this, "Sepet tutarınız 200 TL ve üzerinde olduğu için kargo ücretsizdir.");
   
    tutarÖdeTextField.setText(null);
    tutarÖdeTextField.setText(sepetTutarıTextField.getText());// sepet tutarını sepet ödeye otomatik yaz
    }
  else
    {
  
    JOptionPane.showMessageDialog(this, "Sepet tutarınız 200 TL'nin altında olduğu için kargo ücreti olarak 50 TL eklenecektir.");
   
    tutarÖdeTextField.setText(null);
    tutarÖdeTextField.setText(String.valueOf(sepetTutari + 50));
    }  
            
         if ("1234 1234 1234 1234".equals(kartNumarası) && "123".equals(güvenlikKodu)) 
           {
            JOptionPane.showMessageDialog(this, "SİPARİŞİNİZ ALINMIŞTIR BİZİ TERCİH ETTİĞİNİZ İÇİN TEŞEKKÜRLER.");
           }
         else
            
            {
        JOptionPane.showMessageDialog(this, "Hesap bilgileriniz yanlış.");
            }
       

// Textfieldleri sadece okunabilir yaptık
        müşteriAdiTextField.setEditable(true);
        müşteriSoyadiTextField.setEditable(true);
        telefonNumarasiTextField.setEditable(true);
        musteriAdresiTextField.setEditable(true);
        kartNumarasiTextField.setEditable(true);
        kartÜzerindekiİsimTextField.setEditable(true);
        sonTarihTextField.setEditable(true);
        güvenlikKoduTextField.setEditable(true);
    }//GEN-LAST:event_ödeButtonActionPerformed

    private void marketOluşturButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marketOluşturButtonActionPerformed
     
        String marketAdi = marketAdiTextField.getText();
        String marketAdresi = marketAdresiTextField.getText();

        // Boş değer girilmişse uyar
        if (marketAdi.isEmpty() || marketAdresi.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Lütfen market adını ve adresini girin.");
            return;
        }

        // Textfieldleri sadece okunabilir yaptık
        marketAdiTextField.setEditable(true);
        marketAdresiTextField.setEditable(true);

        JOptionPane.showMessageDialog(this, "Market başarıyla oluşturuldu.");
    
    }//GEN-LAST:event_marketOluşturButtonActionPerformed

    private void stokMiktarıTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stokMiktarıTextFieldActionPerformed
        // yanlışlıkla açtım
    }//GEN-LAST:event_stokMiktarıTextFieldActionPerformed

    private void kullanımAlanıComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kullanımAlanıComboBoxActionPerformed
        // yanlışlıkla açtım
    }//GEN-LAST:event_kullanımAlanıComboBoxActionPerformed

    private void sepetTutarınıHesaplaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sepetTutarınıHesaplaButtonActionPerformed

        int adetMiktarı = Integer.parseInt(adetMiktariTextField.getText());
       double ürünFiyatı = Double.parseDouble(ürünFiyatiTextField.getText());
       double sepetTutarı = ürünFiyatı * adetMiktarı;
       sepetTutarıTextField.setText(String.valueOf(sepetTutarı));
       
       if (Integer.parseInt(stokMiktarıTextField.getText()) < Integer.parseInt(adetMiktariTextField.getText())) {
            JOptionPane.showMessageDialog(this, "Market stok miktarı istediğiniz adet miktarını karşılayamamaktadır.");
        }

    }//GEN-LAST:event_sepetTutarınıHesaplaButtonActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(() -> {
            new Formmarket().setVisible(true);
        });
    }
                
                
                

       
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Müşteri;
    private javax.swing.JLabel adetMiktari;
    private javax.swing.JTextField adetMiktariTextField;
    private javax.swing.JLabel adresiniz;
    private javax.swing.JPanel alisverisTamamla;
    private javax.swing.JButton girisButton;
    private javax.swing.JLabel güvenlikKodu;
    private javax.swing.JTextField güvenlikKoduTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel kartBilgileriLabel;
    private javax.swing.JTextField kartNumarasiTextField;
    private javax.swing.JLabel kartNumarası;
    private javax.swing.JLabel kartÜzerindekiİsim;
    private javax.swing.JTextField kartÜzerindekiİsimTextField;
    private javax.swing.JLabel kullanıcıAdı;
    private javax.swing.JTextField kullanıcıAdıTextField;
    private javax.swing.JComboBox<String> kullanımAlanıComboBox;
    private javax.swing.JLabel kullanımYeri;
    private javax.swing.JTextField marketAdiTextField;
    private javax.swing.JLabel marketAdresi;
    private javax.swing.JTextField marketAdresiTextField;
    private javax.swing.JLabel marketAdı;
    private javax.swing.JPanel marketOlustur;
    private javax.swing.JButton marketOluşturButton;
    private javax.swing.JTextField musteriAdresiTextField;
    private javax.swing.JLabel müşteriAdi;
    private javax.swing.JTextField müşteriAdiTextField;
    private javax.swing.JLabel müşteriSoyadi;
    private javax.swing.JTextField müşteriSoyadiTextField;
    private javax.swing.JLabel organikMi;
    private javax.swing.JComboBox<String> organikMiComboBox;
    private javax.swing.JLabel sepetTutarı;
    private javax.swing.JTextField sepetTutarıTextField;
    private javax.swing.JButton sepetTutarınıHesaplaButton;
    private javax.swing.JButton sepeteEkleButton;
    private javax.swing.JButton sepettenCikarButton;
    private javax.swing.JLabel sifre;
    private javax.swing.JTextField sifreTextField;
    private javax.swing.JLabel sonKullanmaTarihi;
    private javax.swing.JTextField sonKullanmaTarihiTextField;
    private javax.swing.JLabel sonTarih;
    private javax.swing.JTextField sonTarihTextField;
    private javax.swing.JLabel stokMiktarı;
    private javax.swing.JTextField stokMiktarıTextField;
    private javax.swing.JLabel telefonNumarasi;
    private javax.swing.JTextField telefonNumarasiTextField;
    private javax.swing.JLabel tutarÖde;
    private javax.swing.JTextField tutarÖdeTextField;
    private javax.swing.JButton ödeButton;
    private javax.swing.JPanel ürün;
    private javax.swing.JLabel ürünAdi;
    private javax.swing.JTextField ürünAdiTextField;
    private javax.swing.JTextField ürünAdı;
    private javax.swing.JLabel ürünAdı2;
    private javax.swing.JTextField ürünFiyatiTextField;
    private javax.swing.JLabel ürünFiyatı;
    // End of variables declaration//GEN-END:variables
}