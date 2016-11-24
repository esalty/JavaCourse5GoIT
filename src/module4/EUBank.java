package module4;

/**
 * Created by GodMod on 11/23/2016.
 */
public class EUBank extends Bank {
    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {

        int limitOfWithdrawal = 0;
        if (getCurrency() == Currency.USD) {
            limitOfWithdrawal = 2000;
        }
        if (getCurrency().equals(Currency.EURO)) {
            limitOfWithdrawal = 2200;
        }
        return limitOfWithdrawal;
    }

    @Override
    int getLimitOfFunding() {
        int limitOfFund = 0;

        if (getCurrency() == Currency.USD) {
            limitOfFund = 10000;
        }
        if (getCurrency().equals(Currency.EURO)) {
            limitOfFund = 20000;
        }
        return limitOfFund;
    }

    @Override
    int getMonthlyRate() {

        int monthRate = 0;
        if (getCurrency() == Currency.USD) {
            monthRate = 0;
        }
        if (getCurrency().equals(Currency.EURO)) {
            monthRate = 1;
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
                commission = 2;
            else commission = 4;
        }
        return commission;

    }
}
