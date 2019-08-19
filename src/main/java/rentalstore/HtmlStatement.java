package rentalstore;

import java.util.stream.Collectors;

public class HtmlStatement extends Statement {

    public HtmlStatement(Customer customer) {
        super(customer);
    }

    String getFooter(double totalAmount, double frequentRenterPoints) {
        return "<P>You owed is <EM>" + totalAmount + "</EM><P>\n"
                + ("On this rental you earned <EM>" + formatDouble(frequentRenterPoints) + "</EM> frequent renter points<P>");
    }

    String getFigureByRentals() {
        return customer.rentals.stream()
                .map(x -> "\t" + x.getMovie().getTitle() + "\t" + x.calAmount() + "<BR>\n")
                .collect(Collectors.joining());
    }

    String getHeader() {
        return "<H1>Rental Record for <EM>" + customer.getName() + "</EM></H1><P>\n";
    }
}
