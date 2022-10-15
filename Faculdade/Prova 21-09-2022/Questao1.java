public class Questao1 {
    public static void main(String[] args) {
        
        String nivel, altura;
        
        nivel = "baixo";
        altura = "certa";

        if (nivel.equals("") && altura.equals("")){
            System.out.println("Nível e Altura");
        }else{
            System.out.println("Teste Altura");

            if (altura.equals("")){
                System.out.println("Altura vazia");
                System.out.println("Nível vazio");
            }else{
                System.out.println("Altura Cadastrada");
            }
        }

        System.out.println("_FINALIZADO_");
    }
}
