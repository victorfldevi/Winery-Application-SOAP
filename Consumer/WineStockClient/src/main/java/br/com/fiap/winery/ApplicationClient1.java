package br.com.fiap.winery;

import br.com.fiap.winery.WineStockService;

import jakarta.xml.ws.Service;

import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;

public class ApplicationClient1 {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://localhost:8085/WineStockService");
        QName qName = new QName( "http://winery.fiap.com.br/","WineStockServiceImplementationService");

        Service service = Service.create(url, qName);
        WineStockService wineStockService = service.getPort(WineStockService.class);
        String menu = wineStockService.getMenu();

        System.out.println(menu);
    }
}
