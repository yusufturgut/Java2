

public class Balik extends AHayvan implements IHayvan {
    protected String yuzgec_sayisi;
   

    public Balik(String yuzgec_sayisi) {
        this.yuzgec_sayisi = yuzgec_sayisi;
    }
    
    @Override
    public String hareket(String hareketTuru) {
        return "Hareket ediyor.."+hareketTuru;
    }

    @Override
    public String ureme(String ureme_sekli) {
         return "Baliklarin ureme sekli: " +ureme_sekli;
    }

    @Override
    public void sinif() {
        System.out.println("Bu canli baliklar siniifina aittir.");
    }
}
