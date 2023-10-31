/* exercicio 2:
escrita,leitura, soma e subtração */

package teta;

import java.util.Scanner;
public class Teta {

  
        public static void main(String[] args){
     String nome, sobrenome, curso, disciplina;
     Double n1, n2, n3, n4, media;
     Scanner leitura = new Scanner(System.in);
     System.out.println("Por favor informe seu nome:");
     nome = leitura.nextLine();
     System.out.println("Informe o nome do seu curso:");
     curso = leitura.next();
     System.out.println("Informar o nome de sua disciplina:");
     disciplina = leitura.next();
     System.out.println("Informe seu sobrenome");
     sobrenome = leitura.next();
     System.out.println("Informe a 1 nota:");
     n1 = leitura.nextDouble();
     System.out.println("Informe a 2 nota:");
     n2 = leitura.nextDouble();
     System.out.println("Informe a 3 nota:");
     n3 = leitura.nextDouble();
     System.out.println("Informe a 4 nota:");
     n4 = leitura.nextDouble();
     
     media = (n1+n2+n3+n4)/4;
     
     System.out.println("O nome do aluno é: "+nome);
     System.out.println("O sobrenome do aluno é: "+sobrenome);
     System.out.println("O nome do curso é: "+curso);
     System.out.println("O nome da disciplina é: "+disciplina);
     System.out.println("1 nota: "+n1+" A nota 2: "+n2+" 3 nota: "+n3+" 4 nota"+n4);
     System.out.println("Media: "+media);lu
        }
    
}
