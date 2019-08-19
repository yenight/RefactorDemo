package rentalstore;

public class HtmlStatement extends Statement {
    @Override
    public String getHeader(Customer customer) {
        return String.format("<h1>Rental Record for <em>%s</em></h1>\n", customer.getName());
    }

    @Override
    public String getBody(Customer customer) {
        String body = "";
        for (Rental each : customer.getRentals()) {
            body += String.format("\t%s\t%s<br>\n", each.getMovie().getTitle(), String.valueOf(each.getCurrentMovieAmount()));
        }
        return body;
    }

    @Override
    public String getFooter(Customer customer) {
        String footer = "";
        footer += String.format("<p>You owe<em>%s</em></p>\n", String.valueOf(customer.getTotalAmount()));
        footer += String.format("<p>On this rental you earned <em>%s</em> frequent renter points</p>", String.valueOf(customer.getFrequentRenterPoints()));
        return footer;
    }
}
