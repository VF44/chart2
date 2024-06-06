package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VacationServiceTest {
    @Test
    public void test() {
        VacationService service = new VacationService();
        int expected = 3;
        int actual = service.calculete(10000, 3000, 20000);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        VacationService service = new VacationService();
        int expected = 2;
        int actual = service.calculete(100000, 60000, 150000);
        Assertions.assertEquals(expected, actual);


    }


}
