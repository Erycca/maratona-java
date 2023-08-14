public class Aula06EstruturasRepeticao04 {
    public static void main(String[] args) {
        //exercicio Dado o valor de uma carro, descubra em quantos x ele pode ser parcelado
        //condição valorPacela >= 1000
        double valorTotal = 30000;
        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000){
                break;
            }
            System.out.println(" Parcela  " + parcela  + " R$ " + valorParcela);
        }
    }
}
