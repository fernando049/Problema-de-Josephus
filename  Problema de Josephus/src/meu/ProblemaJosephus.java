package meu;
import javax.swing.*;
import java.util.LinkedList;
import java.util.List;

public class ProblemaJosephus {

    public static void main(String[] args) {
        List<Pessoa> pessoas = criarListaDePessoas();

        // Solicita o valor de m ao usuário
        String input = JOptionPane.showInputDialog(null, 
                "Digite o valor de m (passo de eliminação):", 
                "Problema de Josephus - Entrada", 
                JOptionPane.QUESTION_MESSAGE);

        int m;
        try {
            m = Integer.parseInt(input);
            if (m <= 0) {
                throw new NumberFormatException();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, 
                    "Entrada inválida! Usando m = 3 por padrão.", 
                    "Erro", 
                    JOptionPane.WARNING_MESSAGE);
            m = 3;
        }

        // Log das remoções
        StringBuilder log = new StringBuilder("<html><h3>Processo de Eliminação</h3><ul>");
        Pessoa sobrevivente = resolverJosephus(pessoas, m, log);
        log.append("</ul><h3>Sobrevivente Final</h3><p><b>").append(sobrevivente).append("</b></p></html>");

        // Exibe o resultado final
        JOptionPane.showMessageDialog(null, 
                log.toString(), 
                "Resultado Final - Problema de Josephus", 
                JOptionPane.INFORMATION_MESSAGE);
    }

    private static Pessoa resolverJosephus(List<Pessoa> pessoas, int m, StringBuilder log) {
        LinkedList<Pessoa> circulo = new LinkedList<>(pessoas);
        int index = 0; // Começamos pela Pessoa número 1

        while (circulo.size() > 1) {
            index = (index + m - 1) % circulo.size(); // Caminhamos m-1 posições
            log.append("<li>Removendo: ").append(circulo.get(index)).append("</li>");
            circulo.remove(index);
        }

        return circulo.get(0);
    }

    private static List<Pessoa> criarListaDePessoas() {
        List<Pessoa> pessoas = new LinkedList<>();

        pessoas.add(new Pessoa(1, "Ana Silva", "11987654321", "Rua das Flores, 123", "123.456.789-01"));
        pessoas.add(new Pessoa(2, "Carlos Santos", "21987654321", "Av. Brasil, 456", "234.567.890-12"));
        pessoas.add(new Pessoa(3, "Mariana Oliveira", "31987654321", "Praça da Paz, 789", "345.678.901-23"));
        pessoas.add(new Pessoa(4, "João Souza", "41987654321", "Rua Verde, 101", "456.789.012-34"));
        pessoas.add(new Pessoa(5, "Fernanda Lima", "51987654321", "Av. Central, 202", "567.890.123-45"));
        pessoas.add(new Pessoa(6, "Rafael Costa", "61987654321", "Rua Azul, 303", "678.901.234-56"));
        pessoas.add(new Pessoa(7, "Gabriela Rocha", "71987654321", "Av. Paulista, 404", "789.012.345-67"));
        pessoas.add(new Pessoa(8, "Pedro Almeida", "81987654321", "Rua do Sol, 505", "890.123.456-78"));
        pessoas.add(new Pessoa(9, "Julia Ferreira", "91987654321", "Av. das Palmeiras, 606", "901.234.567-89"));
        pessoas.add(new Pessoa(10, "Vinicius Ramos", "21987653210", "Rua do Limoeiro, 707", "012.345.678-90"));
        pessoas.add(new Pessoa(11, "Larissa Melo", "11987654322", "Rua das Acácias, 808", "987.654.321-01"));
        pessoas.add(new Pessoa(12, "Diego Moreira", "21987654432", "Av. dos Jacarandás, 909", "876.543.210-12"));
        pessoas.add(new Pessoa(13, "Patrícia Barros", "31987654543", "Rua das Rosas, 1001", "765.432.101-23"));
        pessoas.add(new Pessoa(14, "Felipe Teixeira", "41987654654", "Av. do Mar, 1111", "654.321.012-34"));
        pessoas.add(new Pessoa(15, "Beatriz Nogueira", "51987654765", "Rua do Lago, 1212", "543.210.123-45"));
        pessoas.add(new Pessoa(16, "Rodrigo Martins", "61987654876", "Av. das Orquídeas, 1313", "432.101.234-56"));
        pessoas.add(new Pessoa(17, "Carolina Farias", "71987654987", "Rua das Violetas, 1414", "321.012.345-67"));
        pessoas.add(new Pessoa(18, "André Almeida", "81987654098", "Av. do Horizonte, 1515", "210.123.456-78"));
        pessoas.add(new Pessoa(19, "Vanessa Lima", "91987654109", "Rua da Primavera, 1616", "101.234.567-89"));
        pessoas.add(new Pessoa(20, "Gustavo Fonseca", "21987654210", "Av. das Palmeiras, 1717", "012.345.678-01"));

        return pessoas;
    }
}
