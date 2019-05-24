package de.mhaeusser.designpatterns.builder;

/** from https://dzone.com/articles/design-patterns-the-builder-pattern */
public class BankAccount {

    private long accountNumber;
    private String owner;
    private String branch;
    private double balance;
    private double interestRate;

    public static class Builder {
        private long accountNumber; // this is important, so we'll pass it to the constructor
        private String owner;
        private String branch;
        private double balance;
        private double interestRate;

        public Builder(long accountNumber) {
            this.accountNumber = accountNumber;
        }

        public Builder withOwner(String owner){
            this.owner = owner;
            return this; // by returning the builder each time, we can create a fluent interface
        }

        public Builder atBranch(String branch){
            this.branch = branch;
            return this;
        }

        public Builder openingBalance(double balance){
            this.balance = balance;
            return this;
        }

        public Builder atRate(double interestRate){
            this.interestRate = interestRate;
            return this;
        }

        public BankAccount build(){
            // here we create the actual bank account object, which is always in a fully initialised state when it's returned
            BankAccount account = new BankAccount(); // since the builder is in the BankAccount class, we can invoke its private constructor
            account.accountNumber = this.accountNumber;
            account.owner = this.owner;
            account.branch = this.branch;
            account.balance = this.balance;
            account.interestRate = this.interestRate;
            return account;
        }
    }

    private BankAccount() {
    }
}
