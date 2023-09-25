package edu.eci.arep;

import static spark.Spark.*;

public class SparkWebServer {

    public static void main(String... args) {
        port(getPort());
        get("/formulario", (req, res) -> {
            String htmlForm = "<form action='/calcular' method='get'>" +
                    "<label for='operacion'>Seleccione la operación:</label>" +
                    "<select name='operacion'>" +
                    "<option value='cos'>Coseno</option>" +
                    "<option value='sin'>Seno</option>" +
                    "<option value='palindrom'>Palíndromo</option>" +
                    "<option value='magnitude'>Magnitud</option>" +
                    "</select><br>" +
                    "Número (o Palíndromo), X (si es magnitud): <input type='text' name='valor'><br>" +
                    "Y (si es magnitud): <input type='text' name='valorY'><br>" +
                    "<input type='submit' value='Calcular'>" +
                    "</form>";
            return htmlForm;
        });
        get("/calcular", (req, res) -> {
            String operacion = req.queryParams("operacion");
            String valor = req.queryParams("valor");

            // Redirige a la ruta correspondiente según la operación seleccionada
            switch (operacion) {
                case "cos":
                    return AppService.getCos(valor);
                case "sin":
                    return AppService.getSin(valor);
                case "palindrom":
                    return AppService.isPalindrome(valor);
                case "magnitude":
                    // Recupera los valores de "x" e "y" por separado
                    String valorX = req.queryParams("valor");
                    String valorY = req.queryParams("valorY");
                    return AppService.getMagnitude(valorX, valorY);
                default:
                    return "Operación no válida";
            }
        });
    }

    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
}