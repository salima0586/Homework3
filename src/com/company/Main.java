package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BankAcount bankAcount = new BankAcount();
        bankAcount.deposit(10000);
        System.out.println("банковский счет"+ bankAcount.getAmount()+"som");
        System.out.println("сколько хотите взять");
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextByte();

        while (true) {
            try {
                System.out.println(bankAcount.getAmount());
                bankAcount.withdraw(m);


            } catch (LimitExpetion r) {
                System.out.println(r.getMessage());
                try {
                    bankAcount.withdraw((int) bankAcount.getAmount());


                } catch (LimitExpetion limitExpetion) {
                    limitExpetion.printStackTrace();
                }
                break;
            }

        }
    }
}



