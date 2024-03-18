// public class Quadrado extends Bidimensional{
//     private double comprimento;
//     private double largura;

//     public Quadrado (String nome, int dimensao, double comprimento, double largura){
//         super(nome, dimensao, comprimento, largura);
//         if (comprimento != largura){
//             System.out.println("Comprimento diferente da largura!");
//             setComprimento(largura);
//         }
//     }

//     public double getComprimento(){
//         return comprimento;
//     }

//     public void setComprimento(double comprimento){
//         this.comprimento = comprimento;
//     }

//     public double getLargura(){
//         return largura;
//     }

//     public void setLargura(double largura){
//         this.largura = largura;
//     }

//     public double area() {
//         return getComprimento() * getLargura();
//     }

//     public void print(){
//         System.out.println("Forma: " + getNome());
//         System.out.println("Dimensão: " + getDimensao());
//         System.out.println("Comprimento = Largura: " + getLargura());
//         System.out.println("Área = " + area());
//     }
// }

final class Quadrado extends Bidimensional {
    public Quadrado(String nome, int dimensao, double comprimento, double largura) {
        super(nome, dimensao, comprimento, largura);
    }

    @Override
    public double area() {
        return comprimento * largura;
    }

    @Override
    public double getAltura() {
        return 0; // Quadrado não tem altura
    }

    @Override
    public String toString() {
        return super.toString() + "\nComprimento = Largura = " + comprimento;
    }

    @Override
    public void print() {
        System.out.println("Forma: " + nome + "\nDimensao: " + dimensao + "\nComprimento = Largura = " + comprimento +
                ", Área = " + area());
    }
}
