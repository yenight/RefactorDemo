package rentalstore;

public abstract class Statement {

    public String statement(Customer customer) {
        String result = "";
        result += getHeader(customer);
        result += getBody(customer);
        result += getFooter(customer);
        return result;
    }

    public abstract String getHeader(Customer customer);
    public abstract String getBody(Customer customer);
    public abstract String getFooter(Customer customer);
}
