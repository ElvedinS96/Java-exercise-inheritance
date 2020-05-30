package cakepackage;

public class TasteTesters {
    public static void main(String[] args) {
        Cake cake = new Cake("choco-cream");
        System.out.println("Cake flavor "+cake.getFlavor());
        System.out.println("Cake price "+cake.getPrice());

        BirthdayCake birthdayCake= new BirthdayCake();
        birthdayCake.setCandles(true);
        birthdayCake.setPrice(23.35);
        System.out.println("Birthday cake flavor "+birthdayCake.getFlavor());
        System.out.println("Birthday cake price "+birthdayCake.getPrice());
        System.out.println("Birthday cake candles "+birthdayCake.isCandles());

        WeddingCake weddingCake = new WeddingCake();
        weddingCake.setTiers(3);
        weddingCake.setPrice(104.34);
        System.out.println("Wedding cake tiers "+weddingCake.getTiers());
        System.out.println("Wedding cake flavor "+weddingCake.getFlavor());
        System.out.println("Wedding cake price "+weddingCake.getPrice());
    }
}
