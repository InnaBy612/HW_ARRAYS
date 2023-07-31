package ru.netology.stats;

public class StatsService {
    public int sum(int[] sales) {
        int totalSale = 0;
        for (int sale : sales) {
            totalSale += sale;
        }
        return totalSale;
    }

    public int average(int[] sales) {
        int averageSale = sum(sales) / 12;
        return averageSale;
    }

    public int monthMaxSale(int[] sales) {
        int monthMax = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[monthMax]) {
                monthMax = i;
            }
        }
        return monthMax + 1;
    }

    public int monthMinSale(int[] sales) {
        int monthMin = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[monthMin]) {
                monthMin = i;
            }
        }
        return monthMin + 1;
    }

    public int belowAverage(int[] sales) {
        int counter = 0;
        int averageSale = average(sales);
        for (int sale : sales) {
            if (sale < averageSale) {
                counter++;
            }
        }
        return counter;
    }

    public int aboveAverage(int[] sales) {
        int counter = 0;
        int averageSale = average(sales);
        for (int sale : sales) {
            if (sale > averageSale) {
                counter++;
            }
        }
        return counter;
    }
}
