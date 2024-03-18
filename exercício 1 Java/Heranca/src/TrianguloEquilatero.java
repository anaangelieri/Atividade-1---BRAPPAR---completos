// public class TrianguloEquilatero extends Bidimensional{
//     private double comprimento;
//     private double largura;

//     public TrianguloEquilatero (String nome, int dimensao, double comprimento, double largura){
//         super(nome, dimensao, comprimento, largura);
//         double alturaCorrigida = Math.sqrt(3) / 2 * largura;
//         if (comprimento != alturaCorrigida) {
//             System.out.println("Altura diferente do esperado para um triângulo equilátero.");
//             setComprimento(alturaCorrigida);
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

//     public void setAltura(double largura){
//         this.largura = largura;
//     }

//     public double area() {
//         return (getLargura() * getComprimento()) / 2;
//     }

//     public void print(){
//         System.out.println("\nForma: " + getNome());
//         System.out.println("Dimensão: " + getDimensao());
//         System.out.println("Largura: " + getLargura());
//         System.out.println("Altura: " + getComprimento());
//         System.out.println("Área = " + area());
//     }
// }

final class TrianguloEquilatero extends Bidimensional {
    public TrianguloEquilatero(String nome, int dimensao, double comprimento, double largura) {
        super(nome, dimensao, comprimento, largura);
    }

    @Override
    public double area() {
        return (largura * comprimento) / 2;
    }

    @Override
    public double getAltura() {
        return Math.sqrt(3) / 2 * largura; // Altura de um triângulo equilátero
    }

    @Override
    public String toString() {
        return super.toString() + "\nLargura: " + largura;
    }

    @Override
    public void print() {
        double altura = getAltura(); // Obtendo a altura do triângulo
        System.out.println("\n\nForma: " + nome + "\nDimensao: " + dimensao + "\nLargura: " + largura +
                "\nAltura: " + altura + "\nArea: " + area());
    }
}
