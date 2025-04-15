package lista02;
import java.util.Scanner;
import java.util.Random;
public class Lista02_Atv07 {
    public static void main(String[] args){
       Scanner Ler = new Scanner(System.in);
       Random Sorteio = new Random(); 
       
       int [] Sorteado = new int[2];
       Sorteado[1] = Sorteio.nextInt(11);
       
       System.out.println("---- SORTE ----" 
               + "\nPREMIO: R$1.000.000.000.000 \n| Digite um Numero de 1 A 10 e tenta acertar |" );
       Sorteado[0] = Ler.nextInt();
       
       if(Sorteado[0] == Sorteado[1]){ 
           System.out.println("PARABENS !!!! " + " Numero Sorteado: " + Sorteado[1] );}
       else {System.out.println(
               "ERROU MAS NAO DESISTE, APOSTE MAIS!!" + " Numero Sorteado: " + Sorteado[1]);}
     }
}
