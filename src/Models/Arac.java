package Models;

import java.time.LocalDateTime;

public abstract class Arac {
    public String modelAdi;
    public int hiz;
    private int uretimYili;
    public String motorHacmi;
    private int maxHiz;
    private static int adet=0;
    private boolean calismaDurumu;


    public Arac(String modelAdi, String motorHacmi, int maxHiz) {
        this.modelAdi = modelAdi;
        this.hiz = 0;
        this.motorHacmi = motorHacmi;
        this.maxHiz = maxHiz;
        this.uretimYili=LocalDateTime.now().getYear();
        Arac.adet+=1;
        this.calismaDurumu=false;
    }

    public boolean isCalismaDurumu() {
        return calismaDurumu;
    }
    public int getAdet() {
        return adet;
    }

    public int getUretimYili() {
        return uretimYili;
    }

    public int getMaxHiz() {
        return maxHiz;
    }
    public void start() {
        calismaDurumu=true;
        System.out.println("Araç çalıştı.");
    }
    public void stop() {
        calismaDurumu=false;
        System.out.println("Araç durdu.");
    }
    public abstract void gazaBas();
    public abstract void frenYap();
}
