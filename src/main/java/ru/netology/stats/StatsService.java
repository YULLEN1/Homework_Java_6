package ru.netology.stats;

public class StatsService {
    public int calculateSumSales(int[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }

        return sum;

    }

    public int findAverage(int[] sales) {

        return calculateSumSales(sales) / sales.length;
    }


    public int findMaxSales(int[] sales) {
        int maxMonth = sales[0];
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int findMinSales(int[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;

    }

    public int salesBelowAverage(int[] sales) {
        int belowMonths = 0;
        for (long sale : sales) {
            if (sale < calculateSumSales(sales) / sales.length) {
                belowMonths++;
            }
        }
        return belowMonths;
    }

    public int salesOverAverage(int[] sales) {
        int overMonths = 0;
        for (long sale : sales) {
            if (sale > calculateSumSales(sales) / sales.length) {
                overMonths++;
            }
        }
        return overMonths;
    }
}