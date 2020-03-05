

public class Ayi extends Memeli implements IHayvanlar{
    private boolean etcilMi;
    
    public Ayi(String solunum_turu,boolean etcilMi) {
        super(solunum_turu);
        this.etcilMi=etcilMi;
    }
    
    public void uyu(){
        System.out.println("Ayi kıs uykusunda uyuyor...");
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
