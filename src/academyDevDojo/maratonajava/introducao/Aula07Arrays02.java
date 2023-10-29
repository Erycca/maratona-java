package academyDevDojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        /*
        byte, short, int, long, float e double
        boolean false
        String null
        */

        String [] nomes = new String[4];
        nomes[0] = "casa";
        nomes[1] = "mesa";
        nomes[2] = "porta";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }


    }
}
