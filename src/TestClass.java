
import java.util.Scanner;



public class TestClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("-----------------------------------------------------");
        System.out.println("******************* HOSGELDINIZ *******************");
        System.out.println("-----------------------------------------------------");
        System.out.println("");
        
        
        for(;;){
            int secim;
            
        System.out.println(" 1-)  Aslan bilgilerine ulasmak icin '1'i seciniz ");
        System.out.println(" 2-)  Ayi bilgilerine ulasmak icin '2'yi seciniz ");
        System.out.println(" 3-)  Zurafa bilgilerine ulasmak icin '3'ü seciniz ");
        System.out.println(" 4-)  Aynali Sazan bilgilerine ulasmak icin '4'ü seciniz ");
        System.out.println(" 5-)  Deve Kusu bilgilerine ulasmak icin '5'i seciniz ");
        System.out.println(" 6-)  Kaya Kartali bilgilerine ulasmak icin '6'yı seciniz ");
        System.out.println(" 7-)  Penguen bilgilerine ulasmak icin '7'yi seciniz ");
        System.out.println(" 8-)  Cikis icin '8'i seciniz ");
       
            
            
            
            secim=scan.nextInt();
            
            switch(secim){
                case 1:
                    
                    Aslan aslan = new Aslan("Akciger solunumu yapar.", true);
                    aslan.setIsim("ASLAN");
                    aslan.setFamily("Felidae (Kedigiller)");
                    aslan.setOrtKilo("240 Kg");
                    aslan.setYasamAlani("Vahsi Doga");
                    aslan.setOrtYavruSayisi(4);
        
                    System.out.println("");
                    System.out.println(aslan.getIsim());
                    System.out.println(aslan.getFamily());
                    System.out.println(aslan.getOrtKilo());
                    System.out.println(aslan.getYasamAlani());
                    System.out.println(aslan.hareket("Kosuyor."));
                    aslan.sinif();
                    System.out.println(aslan.ureme("Eseyli Ureme"));
                    aslan.etcillik_sorgula();
                    System.out.println(aslan.solunum_turu);
                    System.out.println(aslan.getOrtYavruSayisi());
                    aslan.Kukre();
                    System.out.println("");
                    System.out.println("********************************");
                    System.out.println("");
                    break;
                    
                case 2:
                    Ayi ayi = new Ayi("Akciger solunumu yapar.", true);
                    ayi.setIsim("Ayi");
                    ayi.setFamily("Ursidae (Ayigiller)");
                    ayi.setOrtKilo("400 KG");
                    ayi.setYasamAlani("Vahsi Doga");
                    ayi.setOrtYavruSayisi(3);
        
                    System.out.println("");
                    System.out.println(ayi.getIsim());
                    System.out.println(ayi.getFamily());
                    System.out.println(ayi.getOrtKilo());
                    System.out.println(ayi.getYasamAlani());
                    System.out.println(ayi.hareket("Avlaniyor."));
                    ayi.sinif();
                    System.out.println(ayi.ureme("Eseyli Ureme"));
                    ayi.etcillik_sorgula();
                    System.out.println(ayi.solunum_turu);
                    System.out.println(ayi.getOrtYavruSayisi());
                    ayi.uyu();
                    System.out.println("");
                    System.out.println("********************************");
                    System.out.println("");
                    break;
                    
                    
                case 3:
                    Zurafa zurafa = new Zurafa("Akciger solunumu yapar.", true);
                    zurafa.setIsim("Zurafa");
                    zurafa.setFamily("Giraffidae (Zurafagiller)");
                    zurafa.setOrtKilo("1 TON");
                    zurafa.setYasamAlani("Tropikal bolgeler.");
                    zurafa.setOrtYavruSayisi(3);

                    System.out.println("");
                    System.out.println(zurafa.getIsim());
                    System.out.println(zurafa.getFamily());
                    System.out.println(zurafa.getOrtKilo());
                    System.out.println(zurafa.getYasamAlani());
                    System.out.println(zurafa.hareket("Yemek yiyor."));
                    zurafa.sinif();
                    System.out.println(zurafa.ureme("Eseyli Ureme"));
                    zurafa.etcillik_sorgula();
                    System.out.println(zurafa.solunum_turu);
                    System.out.println(zurafa.getOrtYavruSayisi());
                    zurafa.ye();
                    System.out.println("");
                    System.out.println("********************************");
                    System.out.println("");
                    break;
                    
                case 4:
                    AynaliSazan aynali_sazan = new AynaliSazan("Yuzgec Sayisi: 4", false);
                    aynali_sazan.setIsim("Aynali Sazan");
                    aynali_sazan.setFamily("Cyprinidae (Sazangiller)");
                    aynali_sazan.setOrtKilo("15 KG");
                    aynali_sazan.setYasamAlani("Goller,Denizler");
                    aynali_sazan.setOrtYavruSayisi(100);

                    System.out.println(""); 
                    System.out.println(aynali_sazan.getIsim());
                    System.out.println(aynali_sazan.getFamily());
                    System.out.println(aynali_sazan.getOrtKilo());
                    System.out.println(aynali_sazan.getYasamAlani());
                    System.out.println(aynali_sazan.hareket("Yuzuyor."));
                    aynali_sazan.sinif();
                    System.out.println(aynali_sazan.ureme("Yumurtlayarak Ureme"));
                    aynali_sazan.etcillik_sorgula();
                    System.out.println(aynali_sazan.yuzgec_sayisi);
                    System.out.println(aynali_sazan.getOrtYavruSayisi());
                    aynali_sazan.yumurtla();
                    System.out.println("");
                    System.out.println("********************************");
                    System.out.println("");
                    break;
                    
                case 5:
                     DeveKusu deve_kusu = new DeveKusu("Kanat Genisligi: 1.5M", true,false);
                    deve_kusu.setIsim("Deve Kusu");
                    deve_kusu.setFamily("Struthionidae (Deve Kusugiller)");
                    deve_kusu.setOrtKilo("100 KG");
                    deve_kusu.setYasamAlani("Afrika Bolgesi");
                    deve_kusu.setOrtYavruSayisi(5);

                    System.out.println("");
                     System.out.println(deve_kusu.getIsim());
                    System.out.println(deve_kusu.getFamily());
                    System.out.println(deve_kusu.getOrtKilo());
                    System.out.println(deve_kusu.getYasamAlani());
                    System.out.println(deve_kusu.hareket("Kafasini kuma gomuyor."));
                    deve_kusu.sinif();
                    System.out.println(deve_kusu.ureme("Yumurtlayarak Ureme"));
                    deve_kusu.etcillik_sorgula();
                    System.out.println(deve_kusu.kanat_genisligi);
                    System.out.println(deve_kusu.getOrtYavruSayisi());
                    deve_kusu.ucarMi();
                    deve_kusu.kos();
                    System.out.println("");
                    System.out.println("********************************");
                    System.out.println("");
                    break;
                    
                case 6:
                     KayaKartali kaya_kartaKartali = new KayaKartali("Kanat Genisligi: 2 M", true,true);
                    kaya_kartaKartali.setIsim("Kaya Kartali");
                    kaya_kartaKartali.setFamily("Accipitridae (Atmacagiller)");
                    kaya_kartaKartali.setOrtKilo("4 KG");
                    kaya_kartaKartali.setYasamAlani("Afrika Bolgesi ve Tropikal Bolgeler");
                    kaya_kartaKartali.setOrtYavruSayisi(5);

                    System.out.println("");
                     System.out.println(kaya_kartaKartali.getIsim());
                    System.out.println(kaya_kartaKartali.getFamily());
                    System.out.println(kaya_kartaKartali.getOrtKilo());
                    System.out.println(kaya_kartaKartali.getYasamAlani());
                    System.out.println(kaya_kartaKartali.hareket("Ucuyor."));
                    kaya_kartaKartali.sinif();
                    System.out.println(kaya_kartaKartali.ureme("Yumurtlayarak Ureme"));
                    kaya_kartaKartali.etcillik_sorgula();
                    System.out.println(kaya_kartaKartali.kanat_genisligi);
                    System.out.println(kaya_kartaKartali.getOrtYavruSayisi());
                    kaya_kartaKartali.ucarMi();
                    kaya_kartaKartali.besle();
                    System.out.println("");
                    System.out.println("********************************");
                    System.out.println("");
                    break;
        
                case 7:
                    
                     Penguen penguen = new Penguen("Kanat genisligi: 1M", true, true);
                    penguen.setIsim("Penguen");
                    penguen.setFamily("Penguengiller (Spheniscidae)");
                    penguen.setOrtKilo("35 KG");
                    penguen.setYasamAlani("Kutuplar");
                    penguen.setOrtYavruSayisi(15);

                    System.out.println("");
                     System.out.println(penguen.getIsim());
                    System.out.println(penguen.getFamily());
                    System.out.println(penguen.getOrtKilo());
                    System.out.println(penguen.getYasamAlani());
                    System.out.println(penguen.hareket("Yuzuyor"));
                    penguen.sinif();
                    System.out.println(penguen.ureme("Yumurtlayarak Ureme"));
                    penguen.etcillik_sorgula();
                    System.out.println(penguen.kanat_genisligi);
                    System.out.println(penguen.getOrtYavruSayisi());
                    penguen.ucarMi();
                    penguen.nitelik();
                    System.out.println("");
                    System.out.println("********************************");
                    System.out.println("");
                    break;
        
                case 8:
                    
                   System.out.println("");
                    System.out.println("*********************************************");
                    System.out.println("Basarili sekilde cikis yaptiniz. Tesekkr Ederiz... ");
                    System.out.println("*********************************************");
                    return; 

                    default:
                  System.out.println("");
                  System.out.println("***********************************");
                  System.out.println("!!! Gecersiz bir sayi girdiniz !!!");
                  System.out.println("***********************************");
                  System.out.println("Lutfen gecerli bir sayi giriniz.");
                  System.out.println("***********************************");
                  System.out.println("");
                    
            }
            
            
            
            
        }
        
        
        
    }
    
}
