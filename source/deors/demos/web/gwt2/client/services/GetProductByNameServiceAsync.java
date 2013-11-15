package deors.demos.web.gwt2.client.services;

import com.google.gwt.user.client.rpc.AsyncCallback;

import deors.demos.web.gwt2.shared.Product;

public interface GetProductByNameServiceAsync {

    void getProduct(String name, AsyncCallback<Product> callback);
}
