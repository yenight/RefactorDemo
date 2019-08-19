package rentalstore;

public class ChildrenType extends MovieType {
    public final static double MONEY_BY_LESS_THAN_4_DAY = 1.5;
    public final static double MONEY_BY_MORE_THAN_3_DAY = 1.5;
    public final static double DISCOUNT_DAY = 3;

    @Override
    public double getAmount(Rental rental) {
        double amount = 0.0;
        amount += MONEY_BY_LESS_THAN_4_DAY;
        if (rental.getDayRented() > DISCOUNT_DAY) {
            amount += (rental.getDayRented() - DISCOUNT_DAY) * MONEY_BY_MORE_THAN_3_DAY;
        }
        return amount;
    }
}
