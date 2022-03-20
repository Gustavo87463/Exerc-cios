public class Exercício7 {

    public static void main(String[] args) {

        double valor = 780.000;
        double primeiro_ganhador = valor*46/100;
        double segundo_ganhador = valor*36/100;
        double terceiro_ganhador = valor - (primeiro_ganhador + segundo_ganhador);
        System.out.println("Primeiro Ganhador. " + primeiro_ganhador);
        System.out.println("Segundo Ganhador. " + segundo_ganhador);
        System.out.println("Terciro Ganhador. " + terceiro_ganhador);
        
    }
    
}
