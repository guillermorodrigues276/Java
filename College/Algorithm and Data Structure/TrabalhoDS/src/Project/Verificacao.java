package Project;

import javax.swing.JTextField;
import java.io.File;
import java.util.Scanner;

public class Verificacao<T> extends Tela{

    private String line; 

    public String ReceberArquivo(JTextField teste){
        try {
                Scanner input = new Scanner(new File(teste.getText())); 
                File file = new File(input.nextLine());
                input = new Scanner(file);

                while (input.hasNextLine()) {
                    line = input.nextLine();
                    System.out.println(line);
                }
                input.close();
            } catch (Exception ex) {
                
            }
            System.out.println(line);
            return line;
            }
        }






