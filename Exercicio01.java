import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Pessoa> pessoas = new ArrayList<>();
        do{
            System.out.println("Escreva os nomes das pessoas e suas datas de nascimento");
            String[] pessoa = scanner.next().split(":");
            Pessoa pessoa1 = new PessoaImpl();
            pessoa1.setNome(pessoa[0]);
            pessoa1.setDataNascimento(pessoa[1]);
            pessoas.add(pessoa1);
            System.out.println("Deseja continuar inserindo pessoas?[s/n]");
        }while(scanner.next().toUpperCase().equals("S"));

        pessoas.forEach(pessoa -> System.out.println(pessoa.getNome() + " - " + pessoa.getDataNascimentoFormat() + " - " + pessoa.getIdadeStr()));

    }
}
