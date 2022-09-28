public class Questao1 {
    public static void main(String[] args) {

        String nivel, altura;

        nivel = "baixo";
        altura = "certa";

        if ((nivel.equals("")) && (altura.equals(""))) {
            System.out.println("Nivel e Altura");
        } else {
            System.out.println("Teste Altura");
        }
        if (altura.equals("")) {
            System.out.println("Altura Vazia");
            System.out.println("Nivel Vazio");
        } else {
            System.out.println("Altura Cadastrada");
        }
        System.out.println();
        System.out.println("_FINALIZADO_");
    }
}



