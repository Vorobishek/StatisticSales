package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldYearSales() {
        StatsService service = new StatsService();
        int sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.yearSales(sales);

        assertEquals(expected, actual);

    }

    @Test
    void shouldMiddleSalesSum() {
        StatsService service = new StatsService();
        int sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.middleSalesSum(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldMaxSales() {
        StatsService service = new StatsService();
        int sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.maxSales(sales);

        assertEquals(expected, actual);
    }
    @Test
    void shouldMinSales() {
        StatsService service = new StatsService();
        int sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.minSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldMinAverageMounth() {
        StatsService service = new StatsService();
        int sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.minAverageMounth(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldMaxAverageMounth() {
        StatsService service = new StatsService();
        int sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.maxAverageMounth(sales);

        assertEquals(expected, actual);
    }
    }