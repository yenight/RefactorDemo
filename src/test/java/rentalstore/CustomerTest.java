package rentalstore;

import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {

    @Test
    public void should_return_result_when_rental_movie_is_regular_for_3_days_and_customer_name_is_Jerry() {
        //given
        Customer customer = new Customer("Jerry");
        customer.addRental(new Rental(new Movie("Titanic", Movie.REGULAR), 3));

        //when
        String result = customer.textStatement();

        //then
        assertEquals("Rental Record for Jerry\n" +
                "\tTitanic\t3.5\n" +
                "Amount owed is 3.5\n" +
                "You earned 1.0 frequent renter points", result);
    }

    @Test
    public void should_return_result_when_rental_movie_is_regular_for_2_days_and_customer_name_is_Berry() {
        //given
        Customer customer = new Customer("Berry");
        customer.addRental(new Rental(new Movie("Titanic", Movie.REGULAR), 2));

        //when
        String result = customer.textStatement();

        //then
        assertEquals("Rental Record for Berry\n" +
                "\tTitanic\t2.0\n" +
                "Amount owed is 2.0\n" +
                "You earned 1.0 frequent renter points", result);
    }

    @Test
    public void should_return_result_when_rental_movie_is_newRelease_for_5_days_and_customer_name_is_Ben() {
        //given
        Customer customer = new Customer("Ben");
        customer.addRental(new Rental(new Movie("Fast", Movie.NEW_RELEASE), 2));

        //when
        String result = customer.textStatement();

        //then
        assertEquals("Rental Record for Ben\n" +
                "\tFast\t6.0\n" +
                "Amount owed is 6.0\n" +
                "You earned 2.0 frequent renter points", result);
    }

    @Test
    public void should_return_result_when_rental_movie_is_newRelease_for_1_day_and_customer_name_is_Akin() {
        //given
        Customer customer = new Customer("Akin");
        customer.addRental(new Rental(new Movie("Fast", Movie.NEW_RELEASE), 1));

        //when
        String result = customer.textStatement();

        //then
        assertEquals("Rental Record for Akin\n" +
                "\tFast\t3.0\n" +
                "Amount owed is 3.0\n" +
                "You earned 1.0 frequent renter points", result);
    }

    @Test
    public void should_return_result_when_rental_movie_is_children_for_4_days_and_customer_name_is_William() {
        //given
        Customer customer = new Customer("William");
        customer.addRental(new Rental(new Movie("Porter", Movie.CHILDRENS), 4));

        //when
        String result = customer.textStatement();

        //then
        assertEquals("Rental Record for William\n" +
                "\tPorter\t3.0\n" +
                "Amount owed is 3.0\n" +
                "You earned 1.0 frequent renter points", result);
    }

    @Test
    public void should_return_result_when_rental_movie_is_children_for_3_days_and_customer_name_is_Susan() {
        //given
        Customer customer = new Customer("Susan");
        customer.addRental(new Rental(new Movie("Porter", Movie.CHILDRENS), 3));

        //when
        String result = customer.textStatement();

        //then
        assertEquals("Rental Record for Susan\n" +
                "\tPorter\t1.5\n" +
                "Amount owed is 1.5\n" +
                "You earned 1.0 frequent renter points", result);
    }

    @Test
    public void should_return_result_when_rental_movie_all_type_one_for_5_days_and_customer_name_is_Eric() {
        //given
        Customer customer = new Customer("Eric");
        customer.addRental(new Rental(new Movie("Fast", Movie.NEW_RELEASE), 5));
        customer.addRental(new Rental(new Movie("Titanic", Movie.REGULAR), 5));
        customer.addRental(new Rental(new Movie("Porter", Movie.CHILDRENS), 5));

        //when
        String result = customer.textStatement();

        //then
        assertEquals("Rental Record for Eric\n" +
                "\tFast\t15.0\n" +
                "\tTitanic\t6.5\n" +
                "\tPorter\t4.5\n" +
                "Amount owed is 26.0\n" +
                "You earned 4.0 frequent renter points", result);
    }

    @Test
    public void should_return_html_statement_when_rental_movie_is_regular_for_3_days_and_customer_name_is_Jerry() {
        //given
        Customer customer = new Customer("Jerry");
        customer.addRental(new Rental(new Movie("Titanic", Movie.REGULAR), 3));

        //when
        String result = customer.htmlStatement();

        //then
        assertEquals("<h1>Rental Record for <em>Jerry</em></h1>\n" +
                "\tTitanic\t3.5<br>\n" +
                "<p>You owe<em>3.5</em></p>\n" +
                "<p>On this rental you earned <em>1.0</em> frequent renter points</p>", result);
    }

    @Test
    public void should_return_html_statement_when_rental_movie_is_literary_for_5_days_and_customer_name_is_Jerry() {
        //given
        Customer customer = new Customer("Jerry");
        customer.addRental(new Rental(new Movie("Titanic", Movie.LITERARY), 5));

        //when
        String result = customer.htmlStatement();

        //then
        assertEquals("<h1>Rental Record for <em>Jerry</em></h1>\n" +
                "\tTitanic\t30.0<br>\n" +
                "<p>You owe<em>30.0</em></p>\n" +
                "<p>On this rental you earned <em>1.5</em> frequent renter points</p>", result);
    }
}