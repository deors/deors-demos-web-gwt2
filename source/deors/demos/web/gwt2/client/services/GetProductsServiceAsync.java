package deors.demos.web.gwt2.client.services;

import java.util.List;

import com.google.gwt.user.client.rpc.AsyncCallback;

import deors.demos.web.gwt2.shared.Product;

public interface GetProductsServiceAsync {

    void getProducts(AsyncCallback<List<Product>> callback);
}
