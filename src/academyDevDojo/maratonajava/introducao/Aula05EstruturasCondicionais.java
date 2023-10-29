package academyDevDojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais {
    public static void main (String[] args) {

        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >=18;

        if(isAutorizadoComprarBebida){
            System.out.println("Autorizado a comprar bebida");
        }
        if(!isAutorizadoComprarBebida){
            System.out.println("Não autorizado a comprar bebida");
        }
        boolean c = false;
        if(c == true){
            System.out.println("algo q nunca deve ser feito");
        }
        System.out.println("Fora do if");
    }
}

