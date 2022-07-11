import java.time.LocalDate;

public interface Pessoa {
    String getNome();

    void setNome(String nome);

    LocalDate getDataNascimento();

    void setDataNascimento(LocalDate dataNascimento);

    String getDataNascimentoFormat();

    //Format
    void setDataNascimento(String dataNascimento);

    int getIdade();

    String getIdadeStr();
}
