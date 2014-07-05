package deors.demos.web.gwt2.client.services;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import deors.demos.web.gwt2.shared.Product;

@RemoteServiceRelativePath("getProductByName")
public interface GetProductByNameService extends RemoteService {

    Product getProduct(String name);
}
