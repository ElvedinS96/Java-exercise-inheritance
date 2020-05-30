package cakepackage;

public class BirthdayCake extends Cake {
    public boolean candles;
    public BirthdayCake (){
        super("vanilla");
    }

    public boolean isCandles() {
        return candles;
    }

    public void setCandles(boolean candles) {
        this.candles = candles;
    }
}
