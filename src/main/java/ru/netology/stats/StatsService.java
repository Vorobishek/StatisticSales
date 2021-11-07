package ru.netology.stats;

public class StatsService {

    //1
    public int yearSales (int[] sales){

        int allmounth = 0;

        for (int sale : sales) {
            allmounth += sale;

        }
        return allmounth;

    }

    //2
    public int middleSalesSum (int[] sales){

        return yearSales(sales)/sales.length;

    }

    //3
    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    //4
    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    //5
    public int minAverageMounth(int[] sales){
    int middleSum = middleSalesSum(sales);
    int mounthQuantity = 0;
    for (int sale : sales){
        if (sale < middleSum){
            mounthQuantity = mounthQuantity+1;
        }
    }
        return mounthQuantity;
    }

    //6
    public int maxAverageMounth(int[] sales){
        int middleSum = middleSalesSum(sales);
        int mounthQuantity = 0;
        for (int sale : sales){
            if (sale > middleSum){
                mounthQuantity = mounthQuantity+1;
            }
        }
        return mounthQuantity;
    }
}
