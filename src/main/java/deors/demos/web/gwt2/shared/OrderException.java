package deors.demos.web.gwt2.shared;

public class OrderException
    extends Exception {

    private static final long serialVersionUID = 604558045158978337L;

    public OrderException() {

        super();
    }

    public OrderException(String message) {

        super(message);
    }

    public OrderException(Throwable cause) {

        super(cause);
    }

    public OrderException(String message, Throwable cause) {

        super(message, cause);
    }
}
