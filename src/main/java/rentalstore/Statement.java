package rentalstore;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

public abstract class Statement {

    Customer customer;

    public Statement(Customer customer) {
        this.customer = customer;
    }

    String render() {
        double totalAmount = sumTotalAmount();
        double frequentRenterPoints = SumFrequentRenterPoints();
        return renderStatement(totalAmount, frequentRenterPoints);
    }

    private double sumTotalAmount() {
        return customer.rentals.stream().map(Rental::calAmount).mapToDouble(x -> x).sum();
    }

    private double SumFrequentRenterPoints() {
        return customer.rentals.stream().map(Rental::calFrequentRenterPoints).mapToDouble(x -> x).sum();
    }

    private String renderStatement(double totalAmount, double frequentRenterPoints) {
        String result = getHeader();
        result += getFigureByRentals();
        result += getFooter(totalAmount, frequentRenterPoints);
        return result;
    }

    String formatDouble(double number) {
        return BigDecimal.valueOf(number).stripTrailingZeros().toPlainString();
    }

    abstract String getFooter(double totalAmount, double frequentRenterPoints);

    abstract String getFigureByRentals();

    abstract String getHeader();

}
