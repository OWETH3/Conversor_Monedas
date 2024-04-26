import HttpManager.ApiManager;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // Setting URL
        String url_str = "https://v6.exchangerate-api.com/v6/c66c5e2c5e2aadd0e8c081cc/latest/USD";

        ApiManager apiMoney = new ApiManager(url_str);
        apiMoney.openConnection();

        MoneyConversor conversor = new MoneyConversor(apiMoney);
        conversor.Run();
        apiMoney.closeConnection();
    }
}






