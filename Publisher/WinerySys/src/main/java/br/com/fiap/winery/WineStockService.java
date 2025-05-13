package br.com.fiap.winery;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface WineStockService {
    @WebMethod
    public String getMenu();

    @WebMethod
    public String placeOrder(String name, int quantity);
}
