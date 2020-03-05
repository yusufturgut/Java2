

public abstract class AHayvan {
      protected String isim;  
      protected String family;
      protected  String ortKilo;
      protected  String yasamAlani;
      private int ortYavruSayisi;
     
      

    public AHayvan() {
        this.family = family;
        this.ortKilo = ortKilo;
        this.yasamAlani = yasamAlani;
        this.isim =isim;
    }
    
    abstract String hareket(String hareketTuru);
        
    

   
    public String getFamily() {
        System.out.println("Aile: ");
        return family;
    }

    
    public void setFamily(String family) {
        this.family = family;
    }

   
    public String getOrtKilo() {
        System.out.println("Ortalama kilo: ");
        return ortKilo;
    }

   
    public void setOrtKilo(String ortKilo) {
        this.ortKilo = ortKilo;
    }

   
    public String getYasamAlani() {
        System.out.println("Yasam Alani: ");
        return yasamAlani;
    }

   
    public void setYasamAlani(String yasamAlani) {
        this.yasamAlani = yasamAlani;
    }


    
    public String getIsim() {
        return isim;
    }

    
    public void setIsim(String isim) {
        this.isim = isim;
    }

    
    public int getOrtYavruSayisi() {
        System.out.println("Ortalama yavru sayisi: ");
        return ortYavruSayisi;
    }

    
    public void setOrtYavruSayisi(int ortYavruSayisi) {
        this.ortYavruSayisi = ortYavruSayisi;
    }

      
    
}
