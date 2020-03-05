
public class Penguen extends Kus implements IHayvanlar,IKus {
    private boolean etcilMi;
    private boolean uc;
    
    
    public Penguen(String kanat_genisligi,boolean etcilMi,boolean uc) {
        super(kanat_genisligi);
        this.etcilMi=etcilMi;
    }
    
    public void nitelik(){
        System.out.println("Vucudu yagla kapli oldugu icin usumuyor...");
    }
     @Override
    public void etcillik_sorgula() {
        if(etcilMi){
            System.out.println(getClass()+" Etcildir");
        }
        else{
            System.out.println(getClass()+" Etcil degildir");
        }
    }
        @Override
    public void ucarMi() {
        if(uc){
            System.out.println(getClass()+" Ucabilir...");
        }
        else{
            System.out.println(getClass()+"  Ucamaz...");
        }
    }
        
    
}
