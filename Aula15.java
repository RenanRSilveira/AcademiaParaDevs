public class Aula15{
    
    public static void main(String[] args) {
        
        System.out.println(Planetas.JUPITER.getNome());
        Planetas p = Planetas.valueOf("JUPITER");
        System.out.println(p); // Posso utilizar métodos, como o get.

        System.out.println(Operacao.SOMA.aplicar(1, 2));
        System.out.println(Operacao.MULTIPLICACAO.aplicar(3, 4));

    }
}

enum Planetas{
    
    MERCURIO("Mercúrio"), 
    VENUS("Vênus"), 
    TERRA("Terra"), 
    MARTE("Marte"), 
    JUPITER("Júpiter"), 
    SATURNO("Saturno"), 
    URANO("Urano"), 
    NETUNO("Netuno");
    
    private String nome;
    Planetas(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }
}

enum Operacao{
    SOMA {
        public double aplicar(double x, double y) {
            return x + y;
        }
    },

    MULTIPLICACAO {
        public double aplicar(double x, double y) {
            return x * y;
        }
    };

    public abstract double aplicar(double x, double y);
   
}