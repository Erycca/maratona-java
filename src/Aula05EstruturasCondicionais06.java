public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        //Utlizando Switch e dados os valores de 1 á 7, imprima se é dia útil ou final de semana
        //Considerando 1 como domingo

        byte dia = 1;
        switch (dia){
            case 1:
            case 7:
                System.out.println("FDS");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Opção invalida");
                break;
        }
    }
}
