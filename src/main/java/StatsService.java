public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public long totalAmount(long[] sales) {
        long totalAmount = 0;
        for (long sale : sales) {
            totalAmount = totalAmount + sale;
        }
        return totalAmount;
    }

    public double averageAmount(long[] sales) {
        double totalAmount = 0;
        for (long sale : sales) {
            totalAmount = totalAmount + sale;
        }
        return totalAmount/sales.length;
    }

    public int minAverageMonthCount(long[] sales) {
        int monthCount = 0;
        double averageAmount = averageAmount(sales);
        for (long sale : sales) {
            if(sale < averageAmount) {
                monthCount = monthCount + 1;
            }
        }
        return monthCount;
    }

    public int maxAverageMonthCount(long[] sales) {
        int monthCount = 0;
        double averageAmount = averageAmount(sales);
        for (long sale : sales) {
            if(sale > averageAmount) {
                monthCount = monthCount + 1;
            }
        }
        return monthCount;
    }



}
