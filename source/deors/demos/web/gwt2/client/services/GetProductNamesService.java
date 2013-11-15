package deors.demos.web.gwt2.client.services;

import java.util.List;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("getProductNames")
public interface GetProductNamesService extends RemoteService {

    List<String> getProductNames();
}
