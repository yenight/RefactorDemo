package rentalstore;

import sun.awt.geom.AreaOp;

public class Rental {
    private Movie movie;
    private int dayRented;

    public Rental(Movie movie, int dayRented) {
        this.movie = movie;
        this.dayRented = dayRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public int getDayRented() {
        return dayRented;
    }

    public double getCurrentMovieAmount() {
        double currentMovieAmount = 0;

        switch (getMovie().getPriceCode()) {
            case Movie.REGULAR:
                currentMovieAmount = new RegularType().getAmount(this);
                break;
            case Movie.NEW_RELEASE:
                currentMovieAmount = new NewReleaseType().getAmount(this);
                break;
            case Movie.CHILDRENS:
                currentMovieAmount = new ChildrenType().getAmount(this);
                break;
            case Movie.LITERARY:
                currentMovieAmount += getDayRented() * 6;
        }
        return currentMovieAmount;
    }

    public double getFrequentRenterPoints(double frequentRenterPoints) {
        if (getMovie().getPriceCode() == Movie.LITERARY) {
            frequentRenterPoints += 1.5;
        } else {
            frequentRenterPoints++;
        }
        if ((getMovie().getPriceCode() == Movie.NEW_RELEASE) && getDayRented() > 1) {
            frequentRenterPoints++;
        }
        return frequentRenterPoints;
    }
}
