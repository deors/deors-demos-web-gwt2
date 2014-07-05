package deors.demos.web.gwt2.client.services;

import java.util.List;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import deors.demos.web.gwt2.shared.Product;

@RemoteServiceRelativePath("getProducts")
public interface GetProductsService extends RemoteService {

    List<Product> getProducts();
}
