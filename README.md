# Conversor de Moedas

## Descrição
Este é um projeto de conversor de moedas que permite que o usuário insira um valor em uma moeda e converta para outra moeda com base em uma taxa de conversão obtida da API Exchange Rate.

## Funcionalidades
- Conversão entre diversas moedas.
- Taxas de câmbio atualizadas de uma API externa.
- Interface de linha de comando para entrada e saída de dados.

## Pré-requisitos
- Java 17+
- Maven

## Dependências
As dependências do projeto estão especificadas no arquivo `pom.xml`. Este projeto utiliza:
- `com.google.code.gson:gson:2.8.6`
- `org.apache.httpcomponents:httpclient:4.5.13`

## Como Usar
1. Clone o repositório:
    ```sh
    git clone https://github.com/CostaDianna/ConversorDeMoedas.git
    ```
2. Navegue até o diretório do projeto:
    ```sh
    cd seu-repositorio
    ```
3. Compile e execute o projeto:
    ```sh
    mvn clean install
    mvn exec:java -Dexec.mainClass="com.seuprojeto.ConversorDeMoedas"
    ```
4. Siga as instruções na interface de linha de comando para converter moedas.

## Estrutura do Projeto
- `src/main/java`: Código fonte principal.
    - `com/seuprojeto`: Pacote que contém as classes principais.
        - `ConversorDeMoedas.java`: Classe principal que contém a lógica do conversor.
        - `ExchangeRateClient.java`: Classe que faz a chamada à API Exchange Rate.
- `src/test/java`: Testes unitários.
- `README.md`: Este arquivo de documentação.
- `pom.xml`: Arquivo de configuração do Maven.

## Exemplo de Uso
Ao rodar o programa, você verá algo assim:

Bem-vindo ao Conversor de Moedas!
Digite o valor a ser convertido:
100
Escolha a moeda para conversão:

Dólar (USD) para Euro (EUR)
Euro (EUR) para Dólar (USD)
Real (BRL) para Dólar (USD)
Dólar (USD) para Real (BRL)
Euro (EUR) para Real (BRL)
Real (BRL) para Euro (EUR)
Sair
Escolha a opção: 1
Valor em Euros: 85.34



## Contribuindo
1. Fork este repositório.
2. Crie uma nova branch (`git checkout -b feature/nova-funcionalidade`).
3. Commit suas mudanças (`git commit -m 'Adiciona nova funcionalidade'`).
4. Push para a branch (`git push origin feature/nova-funcionalidade`).
5. Abra um Pull Request.

## Licença
Este projeto está licenciado sob a Licença MIT - veja o arquivo ´LICENSE` para mais detalhes.

## Configuração da API
Você precisa obter uma chave da API Exchange Rate para usar no projeto. Insira sua chave na variável `API_KEY` na classe `ExchangeRateClient`.

```java
private static final String API_KEY = "sua-chave-api-aqui";

Exibição de Resultados
Os resultados da conversão são exibidos na interface de linha de comando, mostrando o valor convertido com base na taxa de câmbio atual.

Contato
Se tiver dúvidas ou sugestões, sinta-se à vontade para abrir uma issue ou entrar em contato.

Agradecimentos
Obrigado por usar este conversor de moedas! Se gostou, por favor, deixe uma estrela no repositório.
