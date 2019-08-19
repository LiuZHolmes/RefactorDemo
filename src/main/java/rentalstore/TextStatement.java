package rentalstore;

import java.util.List;
import java.util.stream.Collectors;

public class TextStatement extends Statement {

    public TextStatement(Customer customer) {
        super(customer);
    }

    String getFooter(double totalAmount, double frequentRenterPoints) {
        return "Amount owed is " + totalAmount + "\n" + ("You earned " + formatDouble(frequentRenterPoints) + " frequent renter points");
    }

    String getFigureByRentals() {
        return customer.rentals.stream()
                .map(x->"\t" + x.getMovie().getTitle() + "\t" + x.calAmount() + "\n")
                .collect(Collectors.joining());
    }

    String getHeader() {
        return "Rental Record for " + customer.getName() + "\n";
    }

}
