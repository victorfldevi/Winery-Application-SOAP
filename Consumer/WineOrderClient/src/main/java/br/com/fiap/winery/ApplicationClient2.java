package br.com.fiap.winery;

import br.com.fiap.winery.WineStockService;
import br.com.fiap.winery.WineWarningService;

import jakarta.xml.ws.Service;

import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;

public class ApplicationClient2 {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://localhost:8085/WineStockService");
        URL url2 = new URL("http://localhost:8086/WineWarningService");

        QName qName = new QName( "http://winery.fiap.com.br/","WineStockServiceImplementationService");
        QName qName2 = new QName( "http://winery.fiap.com.br/","WineWarningServiceImplementationService");

        Service service = Service.create(url, qName);
        Service service2 = Service.create(url2, qName2);

        WineStockService wineStockService = service.getPort(WineStockService.class);
        WineWarningService wineWarningService = service2.getPort(WineWarningService.class);

        String order = wineStockService.placeOrder("Tinto", 1);
        String warn = wineWarningService.sendWarn();

        System.out.println(order);
        System.out.println(warn);
    }
}
