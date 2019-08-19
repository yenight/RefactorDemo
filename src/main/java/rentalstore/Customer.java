package rentalstore;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Rental> rentals = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental arg) {
        rentals.add(arg);
    }

    public List<Rental> getRentals() {
        return rentals;
    }

    public String getName() {
        return name;
    }

    public String htmlStatement() {
        return new HtmlStatement().statement(this);
    }

    public String textStatement() {
        return new TextStatement().statement(this);
    }

    public double getFrequentRenterPoints() {
        double frequentRenterPoints = 0;
        for (Rental each : this.rentals) {
            frequentRenterPoints = each.getFrequentRenterPoints(frequentRenterPoints);
        }
        return frequentRenterPoints;
    }

    public double getTotalAmount() {
        return this.rentals.stream().mapToDouble(Rental::getCurrentMovieAmount).sum();
    }
}
