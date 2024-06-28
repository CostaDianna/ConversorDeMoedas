package ConversorDeMoedas;

import com.google.gson.JsonObject;


public class Condicional {
	public static double converter(int opcao, double valor, JsonObject rates) {
		return switch (opcao) {
			case 1, 6 -> {
				double taxaUsdEur = rates.get("EUR").getAsDouble();
				yield valor * taxaUsdEur;
			}
			case 2, 5 -> {
				double taxaEurUsd = 1 / rates.get("EUR").getAsDouble();
				yield valor * taxaEurUsd;
			}
			case 3 -> {
				double taxaBrlUsd = rates.get("USD").getAsDouble();
				yield valor * taxaBrlUsd;
			}
			case 4 -> {
				double taxaUsdBrl = 1 / rates.get("USD").getAsDouble();
				yield valor * taxaUsdBrl;
			}

		default -> -1; // Opção inválida
		};
	}
}




















