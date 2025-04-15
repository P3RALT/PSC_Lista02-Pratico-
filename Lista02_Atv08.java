package lista02;
import java.util.Scanner;
public class Lista02_Atv08 {
    public static void main(String[] args){
        Scanner Ler = new Scanner(System.in);
        double salario, prestacao;
        double financiamento;
        boolean aprovado = false;
        System.out.println("| ---- > BANCO < ---- |");
        System.out.print("Qual seu Salario: ");
        salario = Ler.nextDouble();
        System.out.println("Valor da Prestação Mensal: ");
        prestacao = Ler.nextDouble();
        
        financiamento = salario * 0.30; 
        
        if(prestacao >= financiamento){
         aprovado = true; 
            System.out.println("[ V ] Financiamento Aprovado");
        } else {
            System.out.println("[ X ] Reprovado");
        }
        
    }
}
