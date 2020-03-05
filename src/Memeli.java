

   public class Memeli extends AHayvan implements IHayvan {
    protected String solunum_turu;
    

    public Memeli(String solunum_turu) {
        this.solunum_turu = solunum_turu;
        
    }

    @Override
    public String hareket(String hareketTuru) {
        return "Hareket ediyor.."+hareketTuru;
    }

    @Override
    public String ureme(String ureme_sekli) {
          return "Memeli canlinin ureme sekli: " +ureme_sekli;
    }

    @Override
    public void sinif() {
        System.out.println("Bu canli memeliler sinifina aittir.");
        
    }
    
    
    
  
}
