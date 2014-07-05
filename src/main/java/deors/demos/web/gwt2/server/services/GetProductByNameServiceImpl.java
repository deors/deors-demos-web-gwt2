package deors.demos.web.gwt2.server.services;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import deors.demos.web.gwt2.client.services.GetProductByNameService;
import deors.demos.web.gwt2.server.dao.ProductDAO;
import deors.demos.web.gwt2.shared.Product;

public class GetProductByNameServiceImpl
    extends RemoteServiceServlet implements GetProductByNameService {

    private static final long serialVersionUID = 1698292708822591501L;

    public GetProductByNameServiceImpl() {
        super();
    }

    public Product getProduct(String name) {
        for (Product product : ProductDAO.getProducts()) {
            if (product.getName().equalsIgnoreCase(name)) {
                return product;
            }
        }
        return null;
    }
}
