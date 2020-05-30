package cakepackage;

public class WeddingCake extends Cake{
    public int tiers;
    public WeddingCake(){
        super("cream");
    }

    public int getTiers() {
        return tiers;
    }

    public void setTiers(int tiers) {
        this.tiers = tiers;
    }
}
