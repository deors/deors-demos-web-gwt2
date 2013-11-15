package deors.demos.web.gwt2.client.services;

import java.util.List;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface GetProductNamesServiceAsync {

    void getProductNames(AsyncCallback<List<String>> callback);
}
