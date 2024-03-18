public class Cachorro implements Paciente{
    private String nome;
    private int idade;
    private double peso;

    public Cachorro(String nome, int idade, double peso){
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }

    @Override
    public String getNome(){
        return nome;
    }

    @Override
    public int getIdade(){
        return idade;
    }

    @Override
    public double getPeso(){
        return peso;
    }

    @Override
    public String dizerOla(){
        return "Wolf... Wolf...";
    }

    @Override
    public String dizerDoenca(){
        return "Cainnnn...";
    }
}
