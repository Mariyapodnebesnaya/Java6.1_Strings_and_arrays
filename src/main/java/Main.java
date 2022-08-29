public class Main {
    public static void main(String[] args) {
        long[] stat = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        System.out.println(service.minSales(stat));
        System.out.println(service.maxSales(stat));
        System.out.println(service.totalAmount(stat));
        System.out.println(service.averageAmount(stat));
        System.out.println(service.minAverageMonthCount(stat));
        System.out.println(service.maxAverageMonthCount(stat));


    }

}
