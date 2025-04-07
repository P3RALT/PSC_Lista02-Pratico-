
package lista02;
import java.util.Scanner;
public class Lista02_Atv02 {
    public static void main(String[] args){
        Scanner Ler = new Scanner(System.in);
        int valor [] = new int[2];
        int soma;
        System.out.println(" Digite o Primeiro Valor: ");
        valor[0] = Ler.nextInt();
        System.out.println(" Digite o Segundo Valor: ");
        valor[1] = Ler.nextInt();
        soma = valor[0]+valor[1];
        
        if (soma % 2 == 0) {
            System.out.println(" Soma dos Numeros do e PAR");
        } else { System.out.println(" Soma dos Numeros e IMPAR ");}
    }
}

