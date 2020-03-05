

public class KayaKartali extends Kus implements IHayvanlar,IKus{
    private boolean etcilMi;
    private boolean uc;
    
    public KayaKartali(String kanat_genisligi,boolean etcilMi,boolean uc) {
        super(kanat_genisligi);
        this.etcilMi=etcilMi;
    }
    
    public void besle(){
        System.out.println("Yavrularini besliyor...");
    }
             @Override
    public void etcillik_sorgula() {
        if(etcilMi){
            System.out.println(getClass()+" Etcildir");
        }
        else{
            System.out.println(getClass()+" Etçil degildir");
        }
        
    }
    @Override
    public void ucarMi() {
        if(uc){
            System.out.println(getClass()+" Uçabilir..");
        }
        else{
            System.out.println(getClass()+" Uçamaz");
        }
    }
}
