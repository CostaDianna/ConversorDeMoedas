package ConversorDeMoedas;

import java.util.Scanner;
import com.google.gson.JsonObject;

public class Menu {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			double valor;
			int opcao;

			System.out.println("Bem-vindo ao Conversor de Moedas!");
			System.out.println("Digite o valor a ser convertido:");
			valor = scanner.nextDouble();

			System.out.println("************************************");
			System.out.println("Escolha a moeda para conversão:");
			System.out.println("1 Dólar (USD) para Euro (EUR)");
			System.out.println("2 Euro (EUR) para Dólar (USD)");
			System.out.println("3 Real (BRL) para Dólar (USD)");
			System.out.println("4 Dólar (USD) para Real (BRL)");
			System.out.println("5 Euro (EUR) para Real (BRL)");
			System.out.println("6 Real (BRL) para Euro (EUR)");
			System.out.println("0 Sair");
			System.out.println("************************************");

			opcao = scanner.nextInt();
			if (opcao != 0) {
				JsonObject rates = ExchangeRatesClient.getExchangeRates("BRL");
				if (rates != null) {
					double resultado = Condicional.converter(opcao, valor, rates);
					if (resultado != -1) {
						System.out.println("Valor convertido: " + resultado);
					} else {
						System.out.println("Opção inválida.");
					}
				} else {
					System.out.println("Não foi possível obter as taxas de câmbio.");
				}
			} else {
				System.out.println("Saindo do conversor de moedas.");
			}
		}
	}
}