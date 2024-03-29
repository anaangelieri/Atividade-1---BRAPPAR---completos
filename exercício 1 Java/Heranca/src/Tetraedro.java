// public class Tetraedro extends Tridimensional {
//     private double altura;
//     private double largura;
//     private double profundidade;

//     public Tetraedro(String nome, int dimensao, double altura, double largura, double profundidade) {
//         super(nome, dimensao, altura, largura, profundidade);

//         double alturaCorrigida = (Math.sqrt(6) / 3) * largura;
//         double profundidadeCorrigida = (Math.sqrt(3) / 2) * largura;

//         if (altura != alturaCorrigida || profundidade != profundidadeCorrigida) {
//             System.out.println("Altura e/ou profundidade diferentes do esperado para um tetraedro. ");
//             setAltura(alturaCorrigida);
//             setProfundidade(profundidadeCorrigida);
//         }
//     }

//     public double getAltura() {
//         return altura;
//     }

//     public void setAltura(double altura) {
//         this.altura = altura;
//     }

//     public double getLargura() {
//         return largura;
//     }

//     public void setLargura(double largura) {
//         this.largura = largura;
//     }

//     public double getProfundidade() {
//         return profundidade;
//     }

//     public void setProfundidade(double profundidade) {
//         this.profundidade = profundidade;
//     }

//     public double volume() {
//         return Math.sqrt(2) / 12 * getLargura() * getLargura();
//     }

//     public double area() {
//         return Math.sqrt(3) * getLargura() * getLargura();
//     }

//     public void print() {
//         System.out.println("\nForma: " + getNome());
//         System.out.println("Dimensão: " + getDimensao());
//         System.out.println("Largura: " + getLargura());
//         System.out.println("Profundidade: " + getProfundidade());
//         System.out.println("Altura: " + getAltura());
//         System.out.println("Área = " + area());
//         System.out.println("Volume = " + volume());
//     }

// }

final class Tetraedro extends Tridimensional {
    public Tetraedro(String nome, int dimensao, double largura) {
        super(nome, dimensao, largura, largura * Math.sqrt(3) / 2, largura * Math.sqrt(6) / 3);
    }

    @Override
    public double volume() {
        return (Math.sqrt(2) / 12) * largura * largura * largura;
    }

    @Override
    public void print() {
        double altura = largura * Math.sqrt(3) / 2;
        double profundidade = largura * Math.sqrt(6) / 3;
        System.out.println("\n\nForma: " + nome + "\nDimensão: " + dimensao +
                "\nLargura = " + largura + "\nProfundidade = " + profundidade + "\nAltura = " + altura +
                "\nÁrea = " + area() + "\nVolume = " + volume());
    }

    @Override
    public double area() {
        return Math.sqrt(3) * largura * largura;
    }
}
