package ru.netology.services;

public class VacationService {
    public int calculete(int income, int expenses, int threshold){
        int month = 0;
        int money = 0;
        for (int i=0; i < 12; i++) {
            if (money >= threshold) {
                month++;
                money -= expenses;
                money/= 3;
            }else {
                money += income;
                money -= expenses;
            }
        }
        return month;

    }

}
