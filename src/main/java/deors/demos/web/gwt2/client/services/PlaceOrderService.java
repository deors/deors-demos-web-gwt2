package deors.demos.web.gwt2.client.services;

import java.util.Map;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import deors.demos.web.gwt2.shared.OrderException;

@RemoteServiceRelativePath("placeOrderService")
public interface PlaceOrderService extends RemoteService {

    String placeOrder(Map<String, Integer> products)
        throws OrderException;
}
