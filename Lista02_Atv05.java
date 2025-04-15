package lista02;
import java.util.Scanner;
public class Lista02_Atv05 {
    public static void main(String[] args){
        Scanner Ler = new Scanner(System.in);
        int tempo = 0;
        double [] salario = new double[03];
        double [] bonus = new double[2];
        System.out.print("| Qual seu Salario Liquido? ");
        salario[0] = Ler.nextInt();
        
        System.out.print("| Quantos anos vc trabalhar na Empresa? ");
        tempo = Ler.nextInt();
        bonus[0] = salario[0] * 0.05;
        bonus[1] = salario[0] * 0.10;
        
        if(tempo >= 5 && tempo <= 10){
           salario[1] = salario[0] + bonus[0];
           System.out.println("| Seu Salario Com o Bonus de tempo de casa de 5%" 
            + "\n | Salario: " + salario[1]);       
        } else if (tempo >= 10){
            salario[1] = salario[0] + bonus[1];
            System.out.println("| Seu Salario Com o Bonus de tempo de casa de 5%" 
            + "\n --- | Salario: " + salario[1]);}
      }
}
