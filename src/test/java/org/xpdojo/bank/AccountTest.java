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
}
