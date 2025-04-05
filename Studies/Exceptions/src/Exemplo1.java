public class Exemplo1 {
    public static void main(String[] args) {
        
        String[] vetor = new String[5];
        
        vetor[0] = "IFSP";
        
        System.out.println(vetor[0].toLowerCase());
        System.out.println(vetor[1]);
//        System.out.println(vetor[1].toLowerCase()); -> é a mesma coisa que 'null.toLowerCase()'
//        System.out.println(vetor[5]); -> a posição não existe

        System.out.println(vetor[0].toUpperCase());

    }
}