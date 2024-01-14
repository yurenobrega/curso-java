package entities;

import model.exceptions.WithdrawException;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdawLimit;

    public Account(){}

    public Account(Integer number, String holder, Double balance, Double withdawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdawLimit = withdawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getWithdawLimit() {
        return withdawLimit;
    }

    public void setWithdawLimit(Double withdawLimit) {
        this.withdawLimit = withdawLimit;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount) throws WithdrawException {
        if (amount > balance){
            throw new WithdrawException("The amount exceeds balance");
        }
        if (amount > withdawLimit){
            throw new WithdrawException("The amount exceeds withdraw limit");
        }
        balance -= amount;
    }
}
