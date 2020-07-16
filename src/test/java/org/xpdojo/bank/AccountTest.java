package org.xpdojo.bank;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
    public void newAccountShouldHaveZeroBalance() {
        Account account = new Account();
        assertThat(account.balance()).isEqualTo(0);
    }

    @Test
    public void depositAnAmountToIncreaseBalance() {
        Account account = new Account();
        account.deposit(10);
        assertThat(account.balance()).isEqualTo(10);
    }

    @Test
    public void depositMultiAmountsToIncreaseBalance() {
        Account account = new Account();
        account.deposit(10);
        account.deposit(20);
        assertThat(account.balance()).isEqualTo(30);
    }

    @Test
    public void withdrawAnAmountToIncreaseBalance() {
        Account account = new Account();
        account.deposit(10);
        assertThat(account.balance()).isEqualTo(10);
        account.withdraw(3);
        assertThat(account.balance()).isEqualTo(7);
    }

    @Test
    public void transfertBetweenAcounts() {
        Account account1 = new Account();
        account1.deposit(10);
        Account account2 = new Account();
        account2.deposit(20);
        account2.transfer(5, account1);
        assertThat(account1.balance()).isEqualTo(15);
        assertThat(account1.balance()).isEqualTo(15);
    }

    @Test
    public void printOutBalanceSlip() {
        Account account = new Account();
        account.deposit(10);
        assertThat(account.printSlip()).isEqualTo("Your balance is 10");
    }
}
