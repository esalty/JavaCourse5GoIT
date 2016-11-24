package module4;

/**
 * Created by GodMod on 11/23/2016.
 */
public class USBank extends Bank {
    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {

        int limitOfWithdrawal = 0;
        if (getCurrency() == Currency.USD) {
            limitOfWithdrawal = 1000;
        }
        if (getCurrency().equals(Currency.EURO)) {
            limitOfWithdrawal = 1200;
        }
        return limitOfWithdrawal;
    }

    @Override
    int getLimitOfFunding() {
        int limitOfFund = 0;

        if (getCurrency() == Currency.USD) {
            limitOfFund = 0;
        }
        if (getCurrency().equals(Currency.EURO)) {
            limitOfFund = 10000;
        }
        return limitOfFund;
    }

    @Override
    int getMonthlyRate() {

        int monthRate = 0;
        if (getCurrency() == Currency.USD) {
            monthRate = 1;
        }
        if (getCurrency().equals(Currency.EURO)) {
            monthRate = 2;
        }
        return monthRate;

    }

    @Override
    int getCommission(int amount) {

        int commission = 0;
        if (getCurrency() == Currency.USD) {
            if (amount < 1000)
                commission = 5;
            else commission = 7;
        }
        if (getCurrency().equals(Currency.EURO)) {
            if (amount < 1000)
                commission = 6;
            else commission = 8;
        }
        return commission;

    }

}