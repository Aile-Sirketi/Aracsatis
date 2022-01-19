package Models;

public abstract class Minibus extends Arac{
    private int koltukSayisi;
    private boolean klima;
    private boolean otoKapi;

    public Minibus(String modelAdi, String motorHacmi) {
        super(modelAdi, motorHacmi,160);
        this.klima=true;
        this.otoKapi=true;
        //TODO Auto-generated constructor stub
    }

    public boolean isOtoKapi() {
        return otoKapi;
    }

    public boolean isKlima() {
        return klima;
    }

    public int getKoltukSayisi() {
        return koltukSayisi;
    }

    @Override
    public void frenYap() {
        //hiz -10
        
    }

    @Override
    public void gazaBas() {
        //hiz +10
        
    }
    
}
