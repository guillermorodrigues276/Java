    public class array {
        for(int i = 0; i < numeros.length; i++){
            // PERCORRE O ARRAY DE 0 AO TAMANHO DO ARRAY
            System.out.println("Informe os números: " + "[" + (i + 1) + "]");
            numeros[i] = input.nextDouble();
        }
    }

        int valor = 0;
        boolean B = false;

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número: ");
            valor = input.nextInt();
            for (int j = 0; j < vetor.length; j++) {
                if(valor == vetor[j]){
                    B = true;
                }
            }
            
            if(B){
                System.out.println("Valor já existe no vetor...");
                i = i - 1;
                B = false;
            }
            else{
                vetor[i] = valor;
            }
        }
    }

    private void ordenar(int vetor[]){
    ORDENAR VALOR NO ARRAY
        Arrays.sort(vetor);            
    }
