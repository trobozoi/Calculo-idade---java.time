import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;

public class PessoaImpl implements Pessoa {
    private String nome;
    private LocalDate dataNascimento;

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    @Override
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String getDataNascimentoFormat(){
        return this.dataNascimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy - EEEE"));
    }

    //Format
    @Override
    public void setDataNascimento(String dataNascimento) {
        DateTimeFormatter formatter = new DateTimeFormatterBuilder()
                .appendValueReduced(ChronoField.YEAR, 2, 2, LocalDate.now().getYear() - 99)
                .appendPattern("-MM-dd")
                .toFormatter();
        this.dataNascimento = LocalDate.parse(dataNascimento, formatter);
    }

    @Override
    public int getIdade(){
        Period period = Period.between(this.dataNascimento, LocalDate.now());
        return period.getYears();
    }

    @Override
    public String getIdadeStr(){
        int id = getIdade();
        String idade = id + " ano";
        if(id > 1)
        {
            idade += "s";
        }
        return idade;
    }
}
