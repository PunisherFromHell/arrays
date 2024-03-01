package ru.netology.stats;

public class StatsService {
    public long sumOfSales(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }


    public long averageSumOfSales(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum / sales.length;
    }


    public long maxSales(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > sales[maxMonth]) {
                maxMonth = i;
            }

        }
        return maxMonth + 1;
    }


    public long minSales(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public long salesLessAverage(long[] sales) {
        int numberOfMonths = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSumOfSales(sales)) {
                numberOfMonths++;
            }
        }
        return numberOfMonths;
    }

    public long salesMoreAverage(long[] sales) {
        int numberOfMonths = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSumOfSales(sales)) {
                numberOfMonths++;
            }
        }
        return numberOfMonths;
    }
}










