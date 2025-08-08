package ch11_access_modifier.bank;

import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
        Bank bank1 = new Bank();
        bank1.setAccountNum(123456);
        bank1.setAccountHolder("홍길동");
        bank1.setBalance(10000);
        bank1.setPinNumber(1234);
        bank1.showAccountInfo();

        bank1.deposit(100000, 1234);

        bank1.withdraw(50000, 1234);

        Bank bank4 = new Bank(13579, "김사", -3000, 789456);
        bank4.showAccountInfo();

    }
}
