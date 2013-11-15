package deors.demos.web.gwt2.server.services;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import deors.demos.web.gwt2.client.services.GetProductNamesService;
import deors.demos.web.gwt2.server.dao.ProductDAO;
import deors.demos.web.gwt2.shared.Product;

public class GetProductNamesServiceImpl
    extends RemoteServiceServlet implements GetProductNamesService {

    private static final long serialVersionUID = -7956444283727613251L;

    public GetProductNamesServiceImpl() {
        super();
    }

    public List<String> getProductNames() {
        List<String> names = new ArrayList<String>();
        for (Product product : ProductDAO.getProducts()) {
            names.add(product.getName());
        }
        return names;
    }
}
