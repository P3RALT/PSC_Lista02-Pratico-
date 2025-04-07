/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista02;
import java.util.Scanner;
import java.util.Locale;
public class Lista02 {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in).useLocale(Locale.US);
        String [] bimestres = new String[4];
        bimestres[0] = " 1° Bimestre ";
        bimestres[1] = " 2° Bimestre ";
        bimestres[2] = " 3° Bimestre ";
        bimestres[3] = " 4° Bimestre ";
        double [] notas = new double[4];
        double [] frequencia = new double[4];
        double [] media = new double[2];
        
        for(int i = 0; i < 4; i++){
        String indice = bimestres[i];
            System.out.println("{ -- Bem Vindo - Escola Saint Lucia -- } ");
            System.out.println("-> Qual Foi a Nota do " + indice +" : ");
            notas[i] = Ler.nextDouble(); 
        
            Ler.nextLine();
            System.out.println("-> Qual sua frequencia de 0.1 a 0.100: ");
            frequencia[i] = Ler.nextDouble();}
        
        media[0] = (notas[0]+notas[1]+notas[2]+notas[3])/4;
        media[1] = (frequencia[0]+frequencia[1]+frequencia[2]+frequencia[3])/4;
        
        if(media[0] >= 7 && media [1] >= 0.75){
            System.out.println(" ALUNO APROVADO!!");
        } else if(media[0] >= 4 && media [1] >= 0.75){
            System.out.println(" ALUNO EM RECUPERAÇA ");
        } else if(media[0] < 4 || media [1] < 0.75) {
            System.out.println(" Aluno reprovado " + "\n-> Notas: " + media[0] + "\n-> Frequencia: " + media[1]);
        }       
    }
    
}
