package edu.eci.arep;
import static spark.Spark.*;

public class SparkWebServer {
    
    public static void main(String... args){
        port(getPort());
        get("hello", (req,res) -> "Hello Docker!");
        get("cos", (req,res) -> AppService.getCos(req.queryParams("number")));
        get("sin", (req,res) -> AppService.getSin(req.queryParams("number")));
        get("palindrom", (req,res) -> AppService.isPalindrome(req.queryParams("palindrome")));
        get("magnitude", (req,res) -> AppService.getMagnitude(req.queryParams("x"),req.queryParams("y")));
        HTTPServer.getInstance().start(args);
    }

    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
    
}