

public class AynaliSazan extends Balik implements IHayvanlar {
    private boolean etcilMi;
    
    public AynaliSazan(String yuzgec_sayisi,boolean etcilMi) {
        super(yuzgec_sayisi);
        this.etcilMi=etcilMi;
    }
    
    public void yumurtla(){
        System.out.println("Yumurtluyor...");
    }
     @Override
    public void etcillik_sorgula() {
        if(etcilMi){
            System.out.println(getClass()+" Etcildir");
        }
        else{
            System.out.println(getClass()+" Etcil degirdir");
        }
        
    }
}
