package deors.demos.web.gwt2.server.dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import deors.demos.web.gwt2.shared.Product;

public final class ProductDAO {

    private static final List<Product> products = new ArrayList<Product>();

    static {
        products.add(new Product("0001", "TV Flat 24\" Samsung", "Electronics", new BigDecimal("699.90")));
        products.add(new Product("0002", "TV Flat 30\" Samsung", "Electronics", new BigDecimal("799.90")));
        products.add(new Product("0003", "TV Flat 42\" Samsung", "Electronics", new BigDecimal("899.90")));
        products.add(new Product("0004", "TV Flat 24\" LG", "Electronics", new BigDecimal("679.90")));
        products.add(new Product("0005", "TV Flat 30\" LG", "Electronics", new BigDecimal("779.90")));
        products.add(new Product("0006", "TV Flat 42\" LG", "Electronics", new BigDecimal("879.90")));
        products.add(new Product("0007", "TV Flat 24\" Sony", "Electronics", new BigDecimal("749.90")));
        products.add(new Product("0008", "TV Flat 30\" Sony", "Electronics", new BigDecimal("849.90")));
        products.add(new Product("0009", "TV Flat 42\" Sony", "Electronics", new BigDecimal("949.90")));
        products.add(new Product("0010", "Laptop Intel Core 2 Duo, 160 GB HDD, 2 MB RAM", "Electronics", new BigDecimal("815.50")));
        products.add(new Product("0011", "Laptop Intel Core 2 Duo, 250 GB HDD, 3 MB RAM", "Electronics", new BigDecimal("925.50")));
        products.add(new Product("0012", "Laptop Intel Core 2 Duo, 320 GB HDD, 4 MB RAM", "Electronics", new BigDecimal("1035.50")));
        products.add(new Product("0013", "Laptop Intel Core 2 Quad, 160 GB HDD, 2 MB RAM", "Electronics", new BigDecimal("930.25")));
        products.add(new Product("0014", "Laptop Intel Core 2 Quad, 250 GB HDD, 3 MB RAM", "Electronics", new BigDecimal("1050.25")));
        products.add(new Product("0015", "Laptop Intel Core 2 Quad, 320 GB HDD, 4 MB RAM", "Electronics", new BigDecimal("1200.25")));
        products.add(new Product("0016", "Olive Oil 1 l", "General", new BigDecimal("3.65")));
        products.add(new Product("0017", "Olive Oil 5 l", "General", new BigDecimal("12.95")));
        products.add(new Product("0018", "Sliced white bread 20 pieces", "General", new BigDecimal("0.75")));
        products.add(new Product("0019", "Sliced white bread 26 pieces", "General", new BigDecimal("0.90")));
        products.add(new Product("0020", "Milk Brik 1 l", "General", new BigDecimal("0.85")));
        products.add(new Product("0021", "Milk Bottle 1 l", "General", new BigDecimal("0.87")));
        products.add(new Product("0022", "Butter 250 g", "General", new BigDecimal("1.25")));
        products.add(new Product("0023", "Butter 500 g", "General", new BigDecimal("1.90")));
    }

    private ProductDAO(){
        super();
    }

    public static List<Product> getProducts() {
        return products;
    }
}
