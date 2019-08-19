package rentalstore;

public class Rental {
    private Movie movie;
    private int dayRented;

    public Rental(Movie movie, int dayRented) {
        this.movie = movie;
        this.dayRented = dayRented;
    }

    Movie getMovie() {
        return movie;
    }

    private int getDayRented() {
        return dayRented;
    }

    double calAmount() {
        switch (getMovie().getPriceCode()) {
            case Movie.REGULAR:
                return getMovie().calPriceForRent(getDayRented());
            case Movie.NEW_RELEASE:
                return getDayRented() * 3;
            case Movie.CHILDRENS:
                return getDayRented() > 3 ? (getDayRented() - 3) * 1.5 + 1.5 : 1.5;
            case Movie.Literary:
                return getDayRented() * 6;
        }
        return 0;
    }

    double calFrequentRenterPoints() {
        return isMoreThanTwoDaysNewReleaseRental() ? 2
                : getMovie().getPriceCode() == Movie.Literary ? 1.5
                : 1;
    }

    private boolean isMoreThanTwoDaysNewReleaseRental() {
        return (getMovie().getPriceCode() == Movie.NEW_RELEASE) && getDayRented() > 1;
    }
}
