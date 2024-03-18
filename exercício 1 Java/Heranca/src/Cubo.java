// public class Cubo extends Tridimensional{
//     private double altura;
//     private double largura;
//     private double profundidade;

//     public Cubo (String nome, int dimensao, double altura, double largura, double profundidade){
//         super(nome, dimensao, altura, largura, profundidade);
//         if (largura != profundidade || largura != altura){
//             System.out.println("Altura e/ou profundidade são diferentes da largura");
//             setAltura(largura);
//             setProfundidade(largura);
//         }
//     }

//     public double getAltura(){
//         return altura;
//     }

//     public void setAltura(double altura){
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

//     public double volume(){
//         return getAltura() * getLargura() * getProfundidade();
//     }

//     public double area(){
//         return 3 * getLargura() * getLargura();
//     }

//     public void print(){
//         System.out.println("\nForma: " + getNome());
//         System.out.println("Dimensão: " + getDimensao());
//         System.out.println("Altura = Largura = Profundidade = " + getLargura());
//         System.out.println("Área = " + area());
//         System.out.println("Volume = " + volume());
//     }
// }


final class Cubo extends Tridimensional {
    public Cubo(String nome, int dimensao, double largura) {
        super(nome, dimensao, largura, largura, largura);
    }

    @Override
    public double volume() {
        return largura * largura * largura;
    }

    @Override
    public double area() {
        return 6 * largura * largura; // Área superficial do cubo
    }

    @Override
    public void print() {
        System.out.println("\n\nForma: " + nome + "\nDimensão: " + dimensao +
            "\nAltura = Largura = Profundidade = " + largura + "\nÁrea = " + area() + "\nVolume = " + volume());
    }
}




