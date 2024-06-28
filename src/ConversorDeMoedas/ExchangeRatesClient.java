package ConversorDeMoedas;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ExchangeRatesClient {

	private static final String API_KEY = "c35ce25b1d5decb11632b1d0";
	private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/";

	public static JsonObject getExchangeRates(String baseCurrency) {
		String urlString = BASE_URL + API_KEY + "/latest/" + baseCurrency;
		try {
			URL url = new URL(urlString);
			HttpURLConnection request = (HttpURLConnection) url.openConnection();
			request.connect();

			JsonParser jp = new JsonParser();
			JsonObject jsonobj = jp.parse(new InputStreamReader(request.getInputStream())).getAsJsonObject();

			return jsonobj.getAsJsonObject("conversion_rates");
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}

