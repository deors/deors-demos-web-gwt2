package deors.demos.web.gwt2.shared;

import java.io.Serializable;
import java.math.BigDecimal;

public class Product
    implements Serializable {

    private static final long serialVersionUID = -2875241434167222908L;

    private String id;

    private String name;

    private String category;

    private BigDecimal price;

    public Product() {

        super();
    }

    public Product(String id, String name, String category, BigDecimal price) {

        this();
        setId(id);
        setName(name);
        setCategory(category);
        setPrice(price);
    }

    public String getId() {

        return id;
    }

    public String getName() {

        return name;
    }

    public String getCategory() {

        return category;
    }

    public BigDecimal getPrice() {

        return price;
    }

    public void setId(String id) {

        this.id = id;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setCategory(String category) {

        this.category = category;
    }

    public void setPrice(BigDecimal price) {

        this.price = price;
    }
}
