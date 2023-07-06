package devdojo.introducao;


public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *

        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01 / (double) numero02;
        System.out.println(resultado);

        //%
        int resta = 21 % 7;
        System.out.println(resta);

        //<> <= >= == !=

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;

        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezIgualVinte " + isDezIgualVinte);
        System.out.println("isDezIgualDez " + isDezIgualDez);
        System.out.println("isDezDiferenteDez " + isDezDiferenteDez);

        // && (AND) || (or) !

        int idade = 29;
        float salario = 3500F;
        boolean isDentrodaLeiMaior30 = idade >= 30 && salario >= 4612;
        boolean isDentrodaLeiMenor30 = idade < 30 && salario >= 3381;

        System.out.println("isDentrodaLei30 " + isDentrodaLeiMaior30);
        System.out.println("isDentrodaLei30 " + isDentrodaLeiMenor30);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupança = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupança > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel " + isPlaystationCincoCompravel);

        // = += -= /= %=




    }
}
