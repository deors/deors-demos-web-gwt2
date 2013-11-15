package deors.demos.web.gwt2.server.services;

import java.util.List;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import deors.demos.web.gwt2.client.services.GetProductsService;
import deors.demos.web.gwt2.server.dao.ProductDAO;
import deors.demos.web.gwt2.shared.Product;

public class GetProductsServiceImpl
    extends RemoteServiceServlet implements GetProductsService {

    private static final long serialVersionUID = 3669649225781728351L;

    public GetProductsServiceImpl() {
        super();
    }

    public List<Product> getProducts() {
        return ProductDAO.getProducts();
    }
}
