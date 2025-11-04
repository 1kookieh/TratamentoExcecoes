package org.example;

import java.io.FileWriter;
import java.io.IOException;

public class RegistradorDeErros {

    private static final String NOME_ARQUIVO = "log_erros.txt";

    public static void registrarErro(String mensagemErro) {
        try (FileWriter writer = new FileWriter(NOME_ARQUIVO, true)) {
            String log = "ERRO: " + mensagemErro + "\n";
            writer.write(log);
        } catch (IOException e) {
            System.out.println("FALHA CRÍTICA AO REGISTRAR LOG: " + e.getMessage());
        }
    }
}