

public class Kus extends AHayvan implements IHayvan{
    protected String kanat_genisligi;
    

    public Kus(String kanat_genisligi) {
        
        this.kanat_genisligi = kanat_genisligi;
    }
    
    @Override
    public String hareket(String hareketTuru) {
        return "Hareket ediyor.."+hareketTuru;
    }

    @Override
    public String ureme(String ureme_sekli) {
        return "Kuslarin ureme sekli: " +ureme_sekli;
    }

    @Override
    public void sinif() {
        System.out.println("Bu canli kuslar sinifina aittir.");
      
    }
    
    
    
}
