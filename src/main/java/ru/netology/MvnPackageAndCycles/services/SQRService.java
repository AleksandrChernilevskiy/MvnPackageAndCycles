package ru.netology.MvnPackageAndCycles.services;

public class SQRService {
    public int calcSqrt(int lowBorder, int upBorder) {
        int amount = 0;
        for (int i = 10; i < 100; i++) {
            if (i * i >= lowBorder) {
                if (i * i <= upBorder) {
                    amount++;
                }
            }
        }
        return amount;
    }
}