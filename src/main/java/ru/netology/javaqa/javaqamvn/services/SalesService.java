package ru.netology.javaqa.javaqamvn.services;

import java.util.Arrays;

public class SalesService {


    public int sumSales(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    public int avgSumSales(int[] sales) {
        int sumAvg = sumSales(sales);
        return sumAvg / sales.length;
    }


    public int getMaxSales(int[] sales) {
        int maxDay = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxDay]) {
                maxDay = i;
            }
        }
        return maxDay + 1;

    }

    public int getMinSales(int[] sales) {
        int minDay = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[minDay]) {
                minDay = i;
            }
        }
        return minDay + 1;

    }

    public int getMinAvgSales(int[] sales) {
        int minAvgSales = avgSumSales(sales);
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < minAvgSales) sum++;
        }
        return sum;
    }

    public int getMaxAvgSales(int[] sales) {
        int maxAvgSales = avgSumSales(sales);
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > maxAvgSales) sum++;
        }
        return sum;
    }

}

