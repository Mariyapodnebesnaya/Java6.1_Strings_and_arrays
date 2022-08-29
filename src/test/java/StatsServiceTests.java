import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTests {
    @Test
    void minSales() {
        StatsService service = new StatsService();
        long [] stats = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMinMonth = 9;
        int actualMinMonth = service.minSales(stats);
        Assertions.assertEquals(expectedMinMonth, actualMinMonth);
    }

    @Test
    void maxSales() {
        StatsService service = new StatsService();
        long [] stats = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMaxMonth = 8;
        int actualMaxMonth = service.maxSales(stats);
        Assertions.assertEquals(expectedMaxMonth,actualMaxMonth);
    }

    @Test
    void totalAmount() {
        StatsService service = new StatsService();
        long [] stats = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedTotalAmount = 180;
        long actualTotalAmount = service.totalAmount(stats);
        Assertions.assertEquals(expectedTotalAmount,actualTotalAmount);
    }

    @Test
    void averageAmount() {
        StatsService service = new StatsService();
        long [] stats = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double expectedAverageAmount = 15.0;
        double actualAverageAmount = service.averageAmount(stats);
        Assertions.assertEquals(expectedAverageAmount,actualAverageAmount);
    }

    @Test
    void minAverageMonthCount() {
        StatsService service = new StatsService();
        long [] stats = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMinAverageAmount = 5;
        int actualMinAverageAmount = service.minAverageMonthCount(stats);
        Assertions.assertEquals(expectedMinAverageAmount,actualMinAverageAmount);
    }

    @Test
    void maxAverageMonthCount() {
        StatsService service = new StatsService();
        long [] stats = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMaxAverageAmountCount = 5;
        int actualMinAverageAmountCount = service.maxAverageMonthCount(stats);
        Assertions.assertEquals(expectedMaxAverageAmountCount,actualMinAverageAmountCount);
    }
}
