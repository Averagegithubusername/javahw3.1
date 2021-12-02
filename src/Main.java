public class Main {
    public static void main(String[] args) {
//        float price = (float) 15999.2;
//        int count = 20;
//        int miles = (int) (price / count);
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price);
        System.out.println(miles + " миль начислено");
    }
}
