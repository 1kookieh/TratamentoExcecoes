package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Teste 1: Divisão normal");
        double resultado = AppFinanceiro.calcularDivisao(10, 2);
        System.out.println("Resultado: " + resultado + "\n");

        System.out.println("Teste 2: Divisão por zero");
        AppFinanceiro.calcularDivisao(10, 0);
        System.out.println();

        CadastroCliente cadastro = new CadastroCliente();
        try {
            System.out.println("Tentando cadastrar cliente...");
            cadastro.cadastrar("", 16);
        } catch (DadosInvalidosException e) {
            String msg = e.getMessage();
            System.out.println("Erro: " + msg);
            RegistradorDeErros.registrarErro("Falha no cadastro: " + msg);
        }
    }
}