import java.util.Scanner;

public class Uni6Exe10 {
    
    private Uni6Exe10(){
        Scanner input = new Scanner(System.in);

        int opcao, tamanhoArray;
        int posicaoFinal = 0;
        
        do{
            System.out.println("Informe o tamanho do ARRAY: ");
            tamanhoArray = input.nextInt();
        }while(tamanhoArray < 1 || tamanhoArray > 50);
        
        int array[] = new int[tamanhoArray];

        do{
            System.out.println();
            System.out.println("////////////////////////");
            System.out.println();
            System.out.println("__MENU__"); 
            System.out.println("1 -> Incluir Valor");  
            System.out.println("2 -> Pesquisar Valor"); 
            System.out.println("3 -> Alterar Valor"); 
            System.out.println("4 -> Excluir Valor");
            System.out.println("5 -> Mostrar Valores");
            System.out.println("6 -> Ordenar Valores");
            System.out.println("7 -> Inverter Valores");
            System.out.println("8 -> Sair do Sistema");
            System.out.println("______"); 
            System.out.println();

            opcao = input.nextInt();

            switch (opcao){
                case 1 : 
                        System.out.println();
                        System.out.println("////////////////////////");
                        System.out.println();
                        System.out.println("__Inclusão de Valores__");
                        posicaoFinal = incluirValor(array, posicaoFinal, input);
                        
                break;
                case 2 :
                        System.out.println();
                        System.out.println("////////////////////////");
                        System.out.println();
                        System.out.println("__Pesquisa de Valores__");
                        pesquisarValores(array, posicaoFinal, input);                      
                break;
                case 3 : 
                        System.out.println();
                        System.out.println("////////////////////////");
                        System.out.println();
                        System.out.println("__Alteração de Valores__");
                        alterarValores(array, posicaoFinal, input);
                break;
                case 4 :
                        System.out.println();
                        System.out.println("////////////////////////");
                        System.out.println();
                        System.out.println("__Exclusão de Valores__");
                        posicaoFinal = excluirValores(array, posicaoFinal, input);
                break;
                case 5 : 
                        System.out.println();
                        System.out.println("////////////////////////");
                        System.out.println();
                        System.out.println("__Mostrar de Valores__");
                        mostrarValores(array, posicaoFinal);
                break;
                case 6 : 
                        System.out.println();
                        System.out.println("////////////////////////");
                        System.out.println();
                        System.out.println("__Ordenação de Valores__");
                        ordenarValores(array);
                break;
                case 7 :
                        System.out.println();
                        System.out.println("////////////////////////");
                        System.out.println();
                        System.out.println("__Inversão de Valores__");
                        inverterValores(array, posicaoFinal);
                break;
                case 8 :
                        System.out.println();
                        System.out.println("////////////////////////");
                        System.out.println();
                        System.out.println("__Sistema Finalizado__");
                        break;
                default : //opção inválida
                        System.out.println("Opção inválida."); 
                break;
            }


        }while(opcao != 8);

        input.close();
    }

    private int incluirValor(int array[], int posFinal, Scanner tec){
        for(int i = 0; i < array.length; i++){
            if (posFinal < array.length){
            System.out.print("Informe o valor a incluir:");
            array[posFinal] = tec.nextInt();
            
            System.out.println("Valor incluído no array["+posFinal+"]");
                posFinal++;
                System.out.println();
            }else{
                System.out.println("Elemento não incluído. array Cheio.");
            }
        }
        return posFinal;   
    }

private void mostrarValores(int array[], int posFinal){
    for (int i = 0; i < posFinal;i++){
        System.out.println("array["+i+"] = "+array[i]);
    }
}

private int pesquisarValores(int array[], int posFinal, Scanner tec){
        System.out.print("Informe o valor Pesquisa: ");
        int valorPesquisa = tec.nextInt();
        
        for (int i = 0; i < posFinal; i++){
            if (valorPesquisa == array[i]){
                System.out.println("Valor localizado no array["+i+"]");
                return i;
            }
        }
        System.out.println("Valor não localizado no array.");
        return -1;
    }
    
    private void alterarValores(int array[], int posFinal, Scanner tec){
        int indiceAlterar = pesquisarValores(array, posFinal, tec);
        
        if (indiceAlterar != -1){
            System.out.print("Informe o novo valor:");
            array[indiceAlterar] = tec.nextInt();
            System.out.println("O array["+indiceAlterar+"] foi alterado para o valor: "+array[indiceAlterar]);
        }
    }
    
    private int excluirValores(int array[],int posFinal, Scanner tec){
        int indiceExcluir = pesquisarValores(array, posFinal, tec);
        
        if (indiceExcluir != -1){
            for (int i = indiceExcluir; i < posFinal-1;i++){
                array[i] = array[i+1];
            }
            System.out.println("Elemento foi excluído do array["+indiceExcluir+"]");
            posFinal--;
        }
        return posFinal;
    }
    
    private void inverterValores(int array[], int posFinal){
        int temp = 0;
        
        for (int i = 0; i < posFinal; i++) {
            for (int x = 0; x < i; x++) {
                temp = array[i];
                array[i] = array[x];
                array[x] = temp;
            }
        }
        System.out.println("Elementos do array foram invertidos.");
    }

    private void ordenarValores(int array[]){
        int n = array.length;  
        int temp = 0;  
        for(int i=0; i < n; i++){  
            for(int j=1; j < (n-i); j++){  
                if(array[j-1] > array[j]){  
                    temp = array[j-1];  
                    array[j-1] = array[j];  
                    array[j] = temp;  
                }              
            }  
        }  
        System.out.println();
        for(int i=0; i < array.length; i++){  
            System.out.println(array[i] + " ");  
    }  
}
    
    public static void main(String[] args) {
        new Uni6Exe10();   
    }
}