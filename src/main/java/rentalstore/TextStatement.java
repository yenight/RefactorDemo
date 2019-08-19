package rentalstore;

public class TextStatement extends Statement {
    @Override
    public String getHeader(Customer customer) {
        return String.format("Rental Record for %s\n", customer.getName());
    }

    @Override
    public String getBody(Customer customer) {
        String body = "";
        for (Rental each : customer.getRentals()) {
            body += String.format("\t%s\t%s\n", each.getMovie().getTitle(), String.valueOf(each.getCurrentMovieAmount()));
        }
        return body;
    }

    @Override
    public String getFooter(Customer customer) {
        String footer = "";
        footer += String.format("Amount owed is %s\n", String.valueOf(customer.getTotalAmount()));
        footer += String.format("You earned %s frequent renter points", String.valueOf(customer.getFrequentRenterPoints()));
        return footer;
    }
}
