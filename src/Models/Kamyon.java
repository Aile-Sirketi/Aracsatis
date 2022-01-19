package Models;

public abstract class Kamyon extends Arac {
    private int yukKapasitesi;
    private int tekerSayisi;
    private boolean damper;
    private boolean klima;

    public Kamyon(String modelAdi, String motorHacmi, boolean damper) {
        super(modelAdi, motorHacmi, 120);
        this.damper = damper;
        this.klima = true;
    }

    @Override
    public void frenYap() {
        if(isCalismaDurumu() && hiz > 5){ 
            hiz-=5;
        }

    }

    @Override
    public void gazaBas() {
        if(isCalismaDurumu() && hiz > 5){ 
            hiz+=5;
        }
    }

    public int getYukKapasitesi() {
        return yukKapasitesi;
    }

    public int getTekerSayisi() {
        return tekerSayisi;
    }

    public boolean isDamper() {
        return damper;
    }

    public boolean isKlima() {
        return klima;
    }

}