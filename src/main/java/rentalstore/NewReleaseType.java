package rentalstore;

public class NewReleaseType extends MovieType {

    public final static double MONEY_BY_DAY = 3;

    @Override
    public double getAmount(Rental rental) {
        double amount = 0.0;
        amount += rental.getDayRented() * MONEY_BY_DAY;
        return amount;
    }
}
