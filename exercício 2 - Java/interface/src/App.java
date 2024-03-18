public class App {
    public static void main(String[] args){
        Pessoa pessoa = new Pessoa("Ana", 19, 50.78);
        Cachorro cachorro = new Cachorro("Merida", 1, 8.14);

        qualOSeuNome(pessoa);
        qualOSeuProblema(pessoa);

        qualOSeuNome(cachorro);
        qualOSeuProblema(cachorro);
    }

    public static void qualOSeuNome(Paciente paciente){
        System.out.println(paciente.dizerOla());
    }

    public static void qualOSeuProblema(Paciente paciente){
        System.out.println(paciente.dizerDoenca());
    }
}
