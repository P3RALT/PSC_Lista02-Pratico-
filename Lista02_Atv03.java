/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista02;
import java.util.Scanner;
public class Lista02_Atv03 {
    public static void main(String[] args){
        Scanner Ler = new Scanner(System.in);
        int beleza, altura, carisma; 
        int Maior7 = 0;
        
        System.out.println("< -------- ENCONTRO ---------- > "  +
        "\n  -> NOME: Hellen Soares" + "\n -> IDADE: 24 \n  -> ALTURA: 1.65");
        System.out.print(" -> Qual Nota você da pra Beleza? de 1 a 10: ");
        beleza = Ler.nextInt();
        System.out.print(" -> Qual Nota você da pra Altura? de 1 a 10: ");
        altura = Ler.nextInt();
        System.out.println(" -> Qual Nota você da pro Carisma? de 1 a 10: ");
        carisma = Ler.nextInt();
       
        if (altura > 7){Maior7++;}
        if (beleza > 7){Maior7++;}
        if (carisma > 7){Maior7++;}
        
        if (Maior7 == 3){
            System.out.println("BORAA!!!");
        } else if(Maior7 == 2){
            System.out.println("So VAI. . . ");
        } else if(Maior7 == 1){
            System.out.println("Fe em Deus. . .");
        } else { System.out.println("Misericordia!!!  ");} 
    }
}
