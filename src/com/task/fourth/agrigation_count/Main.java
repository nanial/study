package com.task.fourth.agrigation_count;

//Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность
// блокировки/разблокировки счета. Реализовать поиск и сортировку счетов.
// Вычисление общей суммы по счетам. Вычисление суммы по всем счетам,
// имеющим положительный и отрицательный балансы отдельно

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {

        Bank belarusBank = new Bank();
        belarusBank.euroAccount();
        belarusBank.BYNAccount();
        belarusBank.dollarAccount();
        belarusBank.RURAccount();
        belarusBank.wholeSumOfAccounts();
        belarusBank.sumOfNegativeAccounts();
        belarusBank.sumOfPositiveAccounts();
        belarusBank.searchCerainAccount(new BigInteger("123456711144"));
        System.out.println();
        belarusBank.searchAccountOfCertainClient(1);
    }
}
