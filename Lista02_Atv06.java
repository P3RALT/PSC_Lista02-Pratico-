package lista02;
import java.util.Scanner;
public class Lista02_Atv06 {
    public static void main(String[] args){
        Scanner Ler = new Scanner(System.in);
        double KM; 
        double Gasolina, Consumo;
        
        System.out.println("------------" );
        System.out.print("|Quantos quilometros percorridos ");
        KM = Ler.nextDouble();
        
        System.out.print("| Quantidade de Litros Consumidos ");
        Gasolina = Ler.nextDouble();
        
        Consumo = KM/Gasolina;
        
        if(Consumo < 8){
            System.out.println("|Consumo de Gasolina: " + Consumo + "- | Carro Economico");
        } else if(Consumo >= 8 && Consumo <= 12){
            System.out.println("|Consumo de Gasolina: " + Consumo + "- | Carro Moderado");
        } else {
            System.out.println("|Consumo de Gasolina: " + Consumo + "- | Carro Eficiente");
        }
    }
}
