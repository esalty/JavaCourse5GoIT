package module4;

/**
 * Created by GodMod on 11/23/2016.
 */
public class ChinaBank extends Bank {

    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }
    @Override
    int getLimitOfWithdrawal() {

        int limitOfWithdrawal = 0;
        if (getCurrency() == Currency.USD) {
            limitOfWithdrawal = 100;
        }
        if (getCurrency().equals(Currency.EURO)) {
            limitOfWithdrawal = 150;
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
            limitOfFund = 5000;
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
            monthRate = 0;
        }
        return monthRate;

    }

    @Override
    int getCommission(int amount) {

        int commission = 0;
        if (getCurrency() == Currency.USD) {
            if (amount < 1000)
                commission = 3;
            else commission = 5;
        }
        if (getCurrency().equals(Currency.EURO)) {
            if (amount < 1000)
                commission = 10;
            else commission = 11;
        }
        return commission;

    }

}
