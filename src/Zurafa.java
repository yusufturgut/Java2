

public class Zurafa extends Memeli implements IHayvanlar {
    private boolean etcilMi;
    
    public Zurafa(String solunum_turu,boolean  etcilMi) {
        super(solunum_turu);
        this.etcilMi=etcilMi;
    }
    
    public void ye(){
        System.out.println("Agactan yaprak yiyor...");
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
}
