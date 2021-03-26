package json;

import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class JsonTeste {
    public static void main(String[] args) {
//        JsonObject jsonObject = null;
//        try {
//            jsonObject = JsonParser.parseReader(new FileReader(args[0]))
//                                                        .getAsJsonObject();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//
//        JsonArray jsonArray = jsonObject.getAsJsonArray("faturas");
//
//        double total = 0;
//
//        for (JsonElement elemento : jsonArray) {
//            Gson gson = new Gson();
//            Fatura fatura = gson.fromJson(elemento, Fatura.class);
//            System.out.println(fatura);
//            total += fatura.totalFaturado();
//        }
        Gson gson = new Gson();
        ListaDeFaturas faturas = null;
        try {
            faturas = gson.fromJson(new FileReader(args[0]), ListaDeFaturas.class);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.printf("Total das faturas: R$ %,.2f (%d faturas)",
                faturas.totalDeFaturas(), faturas.quantidadeDeFaturas());
    }
}
