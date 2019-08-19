package rentalstore;

public class Movie {
    static final int REGULAR = 0;
    static final int NEW_RELEASE = 1;
    static final int CHILDRENS = 2;
    static final int Literary = 3;

    private String title;
    private int priceCode;

    Movie(String title, int priceCode) {
        this.title = title;
        setPriceCode(priceCode);
    }

    int getPriceCode() {
        return priceCode;
    }

    public void setPriceCode(int priceCode) {
        this.priceCode = priceCode;
    }

    String getTitle() {
        return title;
    }

    double calPriceForRent(int dayRented) {
        return dayRented > 2 ? (dayRented - 2) * 1.5 + 2 : 2;
    }
}
