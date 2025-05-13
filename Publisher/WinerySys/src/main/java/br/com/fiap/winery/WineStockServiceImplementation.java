package br.com.fiap.winery;

import jakarta.jws.WebService;

import java.math.BigDecimal;
import java.util.ArrayList;

@WebService(endpointInterface = "br.com.fiap.winery.WineStockService")
public class WineStockServiceImplementation implements WineStockService {

    @Override
    public String getMenu() {

        String menu = "";

        Vinho vinho1 = new Vinho(1L,"Tinto", BigDecimal.valueOf(10.00), "Uva Aragonez");
        Vinho vinho2 = new Vinho(2L,"Branco", BigDecimal.valueOf(30.00), "Uva Chardonnay");
        Vinho vinho3 = new Vinho(3L,"Rosé", BigDecimal.valueOf(80.00), "Uva Tempranillo");

        ArrayList<Vinho> vinhos = new ArrayList<Vinho>();
        vinhos.add(vinho1);
        vinhos.add(vinho2);
        vinhos.add(vinho3);

        for (int i = 0; i < vinhos.size(); i++){
            menu += vinhos.get(i).getName() + " : " + vinhos.get(i).getTypeGrape() + "\n";
        }

        return menu;
    }

    @Override
    public String placeOrder(String name, int quantity) {
        return "Pedido confirmado!";
    }
}
