package lista02;
import java.util.Scanner;
public class Lista02_Atv04 {
    public static void main(String[] args){
        Scanner Ler = new Scanner(System.in);
        byte [] opcao = new byte[2];
        /* Variaives de Entrada 
            [ 0 ] - Swith Casa
            [ 1 ] - Tamanho Boletos */
        double [] salario = new double[2];
        double [] desconto = new double[2];
        /*  [0] - Salario Bruto
            [1] - Salario Liuq */
            System.out.print("-> Qual seu Salario Bruto? ");
        salario[0] = Ler.nextDouble();
        /* Descontos CALC - 12% - 6%*/
        desconto[0] = salario[0] * 0.12;
        desconto[1] = salario[0] * 0.06; 
         salario[1] = salario[0] - desconto[0] - desconto[1];
         
         System.out.println("---- Descontos: 12% - " + desconto[0] + "| Descontos VR: 6% " + desconto[1] );
         System.out.println("[ Salario Bruto: " + salario[0] + " ]" 
                 + "[ Salario Liquido: " + salario[1] + " ]");
         
         System.out.println("[ Vc tem boletos pra pagar? ( 1 ) SIM / ( 2 ) NAO ");
         opcao[0] = Ler.nextByte();
         
            switch(opcao[0]){
                case 1: System.out.print(" -- > Quantos Boletos vc tem pra pagar? ");
                          opcao[1] = Ler.nextByte();
                          double [] boletos = new double[opcao[1]];
                          double tBoletos = 0;
                            /* Boletos - Total de Boleto */
                          for (int i = 0; i < opcao[1]; i++){
                             System.out.print("[ -- " + i + " Boleto -- ] \n---> Valor: ");
                             boletos[i] = Ler.nextDouble();
                                if(boletos[i] < salario[1]){
                                    
                                    tBoletos = salario[1] - boletos[i];
                                    System.out.println(" [ -- ] BOLETO PAGO - R$ " + boletos[i] 
                                            + "\n ---> SALDO: " + tBoletos);
                                } else { System.out.println("<-- SALDO INSUFICIENTE --> " + "\n-->" + salario[1]);
                                break; }
                              } break;    
              

                case 2: System.out.println("Tenha um Bom dia!!");  break; }
            
             
        }
    }
       