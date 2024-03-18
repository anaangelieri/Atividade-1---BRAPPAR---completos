// public abstract class Tridimensional extends Forma{
//     private double largura;
//     private double profundidade;
//     private double altura;

//     public Tridimensional (String nome, int dimensao, double largura, double profundidade, double altura){
//         super(nome, dimensao);
//         this.largura = largura;
//         this.profundidade = profundidade;
//         this.altura = altura;
//     }

//     public double getLargura(){
//         return largura;
//     }

//     public void setLargura(double largura){
//         this.largura = largura;
//     }

//     public double getProfundidade(){
//         return profundidade;
//     }

//     public void setProfundidade(double profundidade){
//         this.profundidade = profundidade;
//     }

//     public double getAltura(){
//         return altura;
//     }

//     public void setAltura(double altura){
//         this.altura = altura;
//     }

//     public String toString(){
//         return super.toString() + "\nLargura: " + largura + "\nProfundidade: " + profundidade + "\nAltura: " + altura;
//     }

//     public abstract double volume();
// }

abstract class Tridimensional extends Forma {
    double largura;
    double profundidade;
    double altura;

    public Tridimensional(String nome, int dimensao, double largura, double profundidade, double altura) {
        super(nome, dimensao);
        this.largura = largura;
        this.profundidade = profundidade;
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public double getProfundidade() {
        return profundidade;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return toString() + "\nLargura: " + largura + "\nProfundidade: " + profundidade + "\nAltura: " + altura;
    }

    public abstract double volume();

    public abstract double area(); // Método abstrato para calcular a área superficial
}

