

public class Aslan extends Memeli implements IHayvanlar{
    private boolean etcilMi;
    
    public Aslan(String solunum_turu, boolean etcilMi) {
        super(solunum_turu);
        this.etcilMi=etcilMi;
    }
    
    public void Kukre(){
        System.out.println("Aslan kukruyor...");
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
