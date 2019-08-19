package rentalstore;

import org.junit.Assert;
import org.junit.Test;

public class CustomerTest {
    @Test
    public void should_return_amount_owed_0_and_frequent_renter_points_0_when_rentals_is_null() {
        Customer customer = new Customer("Alpha");

        final String result = customer.statement();

        Assert.assertEquals("Rental Record for Alpha\nAmount owed is 0.0\nYou earned 0 frequent renter points", result);
    }

    @Test
    public void should_return_amount_owed_2_and_frequent_renter_points_1_when_rentals_contains_regular_movie_for_one_day() {
        Customer customer = new Customer("Alpha");
        customer.addRental(new Rental(new Movie("Titanic",Movie.REGULAR),1));

        final String result = customer.statement();

        Assert.assertEquals("Rental Record for Alpha\n" +
                "\tTitanic\t2.0\n" +
                "Amount owed is 2.0\n" +
                "You earned 1 frequent renter points", result);
    }

    @Test
    public void should_return_amount_owed_2_and_frequent_renter_points_1_when_rentals_contains_regular_movie_for_two_days() {
        Customer customer = new Customer("Alpha");
        customer.addRental(new Rental(new Movie("Titanic",Movie.REGULAR),2));

        final String result = customer.statement();

        Assert.assertEquals("Rental Record for Alpha\n" +
                "\tTitanic\t2.0\n" +
                "Amount owed is 2.0\n" +
                "You earned 1 frequent renter points", result);
    }

    @Test
    public void should_return_amount_owed_3_point_5_and_frequent_renter_points_1_when_rentals_contains_regular_movie_for_three_days() {
        Customer customer = new Customer("Alpha");
        customer.addRental(new Rental(new Movie("Titanic",Movie.REGULAR),3));

        final String result = customer.statement();

        Assert.assertEquals("Rental Record for Alpha\n" +
                "\tTitanic\t3.5\n" +
                "Amount owed is 3.5\n" +
                "You earned 1 frequent renter points", result);
    }

    @Test
    public void should_return_amount_owed_3_and_frequent_renter_points_1_when_rentals_contains_new_release_movie_for_one_day() {
        Customer customer = new Customer("Alpha");
        customer.addRental(new Rental(new Movie("Titanic",Movie.NEW_RELEASE),1));

        final String result = customer.statement();

        Assert.assertEquals("Rental Record for Alpha\n" +
                "\tTitanic\t3.0\n" +
                "Amount owed is 3.0\n" +
                "You earned 1 frequent renter points", result);
    }

    @Test
    public void should_return_amount_owed_6_and_frequent_renter_points_2_when_rentals_contains_new_release_movie_for_two_days() {
        Customer customer = new Customer("Alpha");
        customer.addRental(new Rental(new Movie("Titanic",Movie.NEW_RELEASE),2));

        final String result = customer.statement();

        Assert.assertEquals("Rental Record for Alpha\n" +
                "\tTitanic\t6.0\n" +
                "Amount owed is 6.0\n" +
                "You earned 2 frequent renter points", result);
    }

    @Test
    public void should_return_amount_owed_1_point_5_and_frequent_renter_points_1_when_rentals_contains_childrens_movie_for_one_day() {
        Customer customer = new Customer("Alpha");
        customer.addRental(new Rental(new Movie("Titanic",Movie.CHILDRENS),1));

        final String result = customer.statement();

        Assert.assertEquals("Rental Record for Alpha\n" +
                "\tTitanic\t1.5\n" +
                "Amount owed is 1.5\n" +
                "You earned 1 frequent renter points", result);
    }

    @Test
    public void should_return_amount_owed_1_point_5_and_frequent_renter_points_1_when_rentals_contains_childrens_movie_for_three_days() {
        Customer customer = new Customer("Alpha");
        customer.addRental(new Rental(new Movie("Titanic",Movie.CHILDRENS),3));

        final String result = customer.statement();

        Assert.assertEquals("Rental Record for Alpha\n" +
                "\tTitanic\t1.5\n" +
                "Amount owed is 1.5\n" +
                "You earned 1 frequent renter points", result);
    }

    @Test
    public void should_return_amount_owed_3_and_frequent_renter_points_1_when_rentals_contains_childrens_movie_for_four_days() {
        Customer customer = new Customer("Alpha");
        customer.addRental(new Rental(new Movie("Titanic",Movie.CHILDRENS),4));

        final String result = customer.statement();

        Assert.assertEquals("Rental Record for Alpha\n" +
                "\tTitanic\t3.0\n" +
                "Amount owed is 3.0\n" +
                "You earned 1 frequent renter points", result);
    }

    @Test
    public void should_return_amount_owed_six_point_5_and_frequent_renter_points_1_when_rentals_contains_regular_movie_for_one_day_and_new_release_movie_for_one_day_and_childs_movie_for_one_day() {
        Customer customer = new Customer("Alpha");
        customer.addRental(new Rental(new Movie("Titanic",Movie.REGULAR),1));
        customer.addRental(new Rental(new Movie("Terminator",Movie.NEW_RELEASE),1));
        customer.addRental(new Rental(new Movie("Harry Potter",Movie.CHILDRENS),1));

        final String result = customer.statement();

        Assert.assertEquals("Rental Record for Alpha\n" +
                "\tTitanic\t2.0\n" +
                "\tTerminator\t3.0\n" +
                "\tHarry Potter\t1.5\n" +
                "Amount owed is 6.5\n" +
                "You earned 3 frequent renter points", result);
    }

    @Test
    public void should_return_html_amount_owed_0_and_frequent_renter_points_0_when_rentals_is_null() {
        Customer customer = new Customer("Alpha");

        final String result = customer.statementHtml();

        Assert.assertEquals("<H1>Rental Record for <EM>Alpha</EM></H1><P>\n" +
                "<P>You owed is <EM>0.0</EM><P>\n" +
                "On this rental you earned <EM>0</EM> frequent renter points<P>", result);
    }

    @Test
    public void should_return_html_amount_owed_2_and_frequent_renter_points_1_when_rentals_contains_regular_movie_for_one_day() {
        Customer customer = new Customer("Alpha");
        customer.addRental(new Rental(new Movie("Titanic",Movie.REGULAR),1));

        final String result = customer.statementHtml();

        Assert.assertEquals("<H1>Rental Record for <EM>Alpha</EM></H1><P>\n" +
                "\tTitanic\t2.0<BR>\n" +
                "<P>You owed is <EM>2.0</EM><P>\n" +
                "On this rental you earned <EM>1</EM> frequent renter points<P>", result);
    }

    @Test
    public void should_return_html_amount_owed_2_and_frequent_renter_points_1_point_5_when_rentals_contains_literary_movie_for_one_day() {
        Customer customer = new Customer("Alpha");
        customer.addRental(new Rental(new Movie("Titanic",Movie.Literary),1));

        final String result = customer.statementHtml();

        Assert.assertEquals("<H1>Rental Record for <EM>Alpha</EM></H1><P>\n" +
                "\tTitanic\t6.0<BR>\n" +
                "<P>You owed is <EM>6.0</EM><P>\n" +
                "On this rental you earned <EM>1.5</EM> frequent renter points<P>", result);
    }
}
