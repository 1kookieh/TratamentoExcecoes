package org.example;

public class AppFinanceiro {
    static int calcularDivisao(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            String msg = "Divisão por zero não é permitida.";
            System.out.println("Erro: " + msg);
            RegistradorDeErros.registrarErro(msg + " (Detalhe: " + e.getMessage() + ")");
            return 0;
        } finally {
            System.out.println("Operação finalizada com sucesso.");
        }
    }
}